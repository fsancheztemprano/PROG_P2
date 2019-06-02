package src.model;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Session se encagra de mantener la informacion de una conexion a una DB
 * especifica, Para multiples mases de datos crearemos multiples objetos
 * SessionDB
 *
 * @author fsancheztemprano
 */
public final class SessionDB {

    private static Connection conn;
    private static String dbUrl = "jdbc:sqlite:"+System.getProperty("user.dir") + "\\src\\src\\resources\\host.db";
    private static File dbFile = new File(dbUrl.substring(14));

    private SessionDB() {
    }

    /**
     * Getter para la clase Conexion
     *
     * @return Conexion
     */
    public static Connection getConn() {
        return conn;
    }

    public static void setDbUrl(String url) {
        dbUrl = "jdbc:sqlite:" + url;
        dbFile = new File(url);
    }

    public static void setDbFile(File dbFile) {
        SessionDB.dbFile = dbFile;
        dbUrl = "jdbc:sqlite:" + dbFile.getAbsolutePath();
    }

    public static String getDbUrl() {
        return dbUrl;
    }

    public static File getDbFile() {
        return dbFile;
    }

    /**
     * devuelve true si, el archivo con el que fue inicializado esta clase,
     * existe
     *
     * @return BOOLEAN
     */
    public static boolean exists() {
        return dbFile.exists();
    }

    /**
     * establece la conexion a la DB
     *
     * @return true si la conexion fue establecida correctamente
     */
    public static boolean connect() {
        boolean success = false;
        conn = null;
        try {
            conn = DriverManager.getConnection(dbUrl);
            System.out.println("Connection to " + conn.getMetaData().getDriverName() + " has been established.");
            success = true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return success;
    }

    /**
     * Finaliza una conexion a la DB
     */
    public static void close() {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Connection has been terminated.");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Devuelve el numero de tablas en una DB
     *
     * @return integer: el numero de tablas en la base de datos
     */
    public static int numOfTables() {
        String sql = "SELECT name FROM  sqlite_master  WHERE type ='table' AND name NOT LIKE 'sqlite_%';";
        int count = 0;
        connect();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            count = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(SessionDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return count;
    }

    /**
     * Devuelve Una lista con los nombres de las tablas en una DB
     *
     * @return
     */
    public static ArrayList<String> listTables() {
        String sql = "SELECT name FROM  sqlite_master  WHERE type ='table' AND name NOT LIKE 'sqlite_%';";
        ArrayList<String> tableNames = new ArrayList<>();
        connect();
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                tableNames.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessionDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return tableNames;
    }

    /**
     * println de la lista de tablas de una DB
     */
    public static void printTables() {
        ArrayList<String> tablenames = listTables();
        tablenames.forEach((name) -> System.out.println(name));
    }

    public static int crearTablas() {
        int rows = 0;
        File sqlFile = new File("src/src/model/Tables.sql");
        StringBuilder sqlcmd = new StringBuilder();
        try (Scanner scan = new Scanner(new BufferedInputStream(new FileInputStream(sqlFile)))) {
            while (scan.hasNext()) {
                sqlcmd.append(scan.nextLine()).append("\n");
            }
            String multicmd = sqlcmd.toString();
            String[] cmds = multicmd.split(";");
            SessionDB.connect();
            for (String cmd : cmds) {
                try (Statement stmt = SessionDB.getConn().createStatement()) {
                    rows += stmt.executeUpdate(cmd.trim());
                } catch (SQLException ex) {
                    Logger.getLogger(SessionDB.class.getName()).log(Level.SEVERE, cmd, ex);
                }
            }
        } catch (FileNotFoundException ignored) {
        } finally {
            SessionDB.close();
        }
        return rows;
    }

    public static int insertarDemoData() {
        int rows = 0;
        File sqlFile = new File("src/src/model/DemoData.sql");
        StringBuilder sqlcmd = new StringBuilder();
        try (Scanner scan = new Scanner(new BufferedInputStream(new FileInputStream(sqlFile)))) {
            while (scan.hasNext()) {
                sqlcmd.append(scan.nextLine()).append("\n");
            }
            String multicmd = sqlcmd.toString();
            String[] cmds = multicmd.split(";");
            SessionDB.connect();
            for (String cmd : cmds) {
                try (Statement stmt = SessionDB.getConn().createStatement()) {
                    stmt.executeUpdate(cmd.trim());
                } catch (SQLException ex) {
                    Logger.getLogger(SessionDB.class.getName()).log(Level.SEVERE, cmd, ex);
                }
            }
        } catch (FileNotFoundException ignored) {
        } finally {
            SessionDB.close();
        }
        return rows;
    }

    /**
     * devuelve true si la estructura de la DB activa es valida (coincide con la
     * inicializada)
     *
     * @return true si es valida
     */
    public static boolean isValid() {
        ArrayList<String> tables = listTables();
        StringBuilder tablesString = new StringBuilder();
        tables.forEach(cnsmr -> tablesString.append(cnsmr).append("\n"));
        String model = "categorias\n"
                + "ordenes\n"
                + "mesas\n"
                + "productos\n"
                + "servidos\n";
        return model.matches(tablesString.toString());
    }
}
