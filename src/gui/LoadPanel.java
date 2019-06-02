/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.gui;

import java.awt.CardLayout;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import src.model.SessionDB;

/**
 *
 * @author NarF
 */
public class LoadPanel extends javax.swing.JPanel {

    public JPanel cards;
    public CardLayout layout;

    private final String title;
    private final boolean newdb;
    
    
       private JFileChooser chooser = new JFileChooser();

    /**
     * Creates new form Start
     *
     * @param newdb
     */
    public LoadPanel(boolean newdb) {
        this.newdb = newdb;
        this.cards = MainFrame.getCards();
        layout = (CardLayout) cards.getLayout();
        initComponents();

        if (newdb) {
            title = "Nueva";
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        } else {
            title = "Cargar";
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        }
        jLabelTitle.setText(title);
        jBtnCargar.setText(title);

        jTextFieldBrowse.setText(System.getProperty("user.dir") + "\\src\\src\\resources");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBtnBrowse = new javax.swing.JButton();
        jTextFieldBrowse = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabStatus = new javax.swing.JLabel();
        jLabFileSize = new javax.swing.JLabel();
        jBtnCargar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 240));

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Cargar BD");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBtnBrowse.setText("Buscar");
        jBtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBrowseActionPerformed(evt);
            }
        });

        jTextFieldBrowse.setEditable(false);

        jLabel2.setText("Elige una ruta");

        jLabel3.setText("Status:");
        jLabel3.setMaximumSize(null);

        jLabel6.setText("Tamaño:");
        jLabel6.setMaximumSize(null);

        jLabStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabStatus.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabStatus.setMinimumSize(new java.awt.Dimension(100, 100));

        jLabFileSize.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabFileSize.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabFileSize.setMinimumSize(new java.awt.Dimension(100, 100));

        jBtnCargar.setText("Cargar");
        jBtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBrowse)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(jLabFileSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnCargar)
                            .addComponent(jBtnBrowse))))
                .addGap(9, 9, 9))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtnBrowse, jBtnCargar});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBrowse))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabFileSize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBtnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabFileSize, jLabStatus, jLabel3, jLabel6});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtnBrowse, jTextFieldBrowse});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCargarActionPerformed
        if (newdb) {
            newButtonAction();
        } else {
            loadButtonAction();
        }
    }//GEN-LAST:event_jBtnCargarActionPerformed

    private void newButtonAction() {
        // TODO add your handling code here:
        if (jTextFieldBrowse.getText().trim().length() > 0) {
            File newfile = null;
            do {
                String nombre = JOptionPane.showInputDialog(this, "Introduce el nombre de la base de datos", "Nueva DB", 3);
                if (nombre == null || nombre.length() < 1) {
                    break;
                }
                File file = new File(jTextFieldBrowse.getText());

                String dir = file.getAbsolutePath();
                if (file.isFile()) {
                    String full = file.getAbsolutePath();
                    dir = full.substring(0, full.lastIndexOf("/"));
                }
                newfile = new File(dir + "/" + nombre + ".db");

                if (!newfile.exists()) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "File already exists", "Alert", JOptionPane.ERROR_MESSAGE);
                    newfile = null;
                }
            } while (true);

            if (newfile != null) {
                SessionDB.setDbFile(newfile);
                System.out.println("Initializing DB...");
                SessionDB.crearTablas();
                int i = JOptionPane.showConfirmDialog(this, "Insertar demo data?", "Nueva DB", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    System.out.println("Inserting Demo Data...");
                    SessionDB.insertarDemoData();
                }
                if(SessionDB.isValid()){
                    MenuBar.jMenuVer.setEnabled(true);
                    MainFrame.setCard(MainFrame.MAINMENUPANEL);
                    JOptionPane.showMessageDialog(this, "DB creada correctamente", "Nueva DB", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    MenuBar.jMenuVer.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "DB invalida. Contacta con el desarrollador.", "Cargando DB", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Creacion cancelada", "Cargando DB", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Elige una ruta", "Cargando DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadButtonAction() {
        // TODO add your handling code here:
        if (jTextFieldBrowse.getText().trim().length() > 0) {
            File loadfile = new File(jTextFieldBrowse.getText());
            if (loadfile.exists()) {
                SessionDB.setDbFile(loadfile);

                if (SessionDB.isValid()) {
                    MenuBar.jMenuVer.setEnabled(true);
                    MainFrame.setCard(MainFrame.MAINMENUPANEL);
                } else {
                    MenuBar.jMenuVer.setEnabled(false);
                    JOptionPane.showMessageDialog(this, "DB Invalida", "Cargando DB", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Archivo inexistente", "Cargando DB", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Elige una DB", "Cargando DB", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jBtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBrowseActionPerformed
        // TODO add your handling code here:
        chooser.setCurrentDirectory(new File(jTextFieldBrowse.getText()));

        if (chooser.showOpenDialog(new JFrame()) == JFileChooser.APPROVE_OPTION) {
            jTextFieldBrowse.setText(chooser.getSelectedFile().getAbsolutePath());
            if (!newdb) {
                setStatusLabels();
            }
        }
    }//GEN-LAST:event_jBtnBrowseActionPerformed

    private void setStatusLabels() {
        File file = new File(jTextFieldBrowse.getText());
        SessionDB.setDbFile(file);

        String ok = "<html><b style=\"color:green;\">OK</b></hrml>";
        String err = "<html><b style=\"color:red;\">Invalid</b></hrml>";

        if (SessionDB.isValid()) {
            jLabStatus.setText(ok);
        } else {
            jLabStatus.setText(err);
        }
        jLabFileSize.setText(byteSizeFormatter(file.length()) + " bytes");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBrowse;
    private javax.swing.JButton jBtnCargar;
    private javax.swing.JLabel jLabFileSize;
    private javax.swing.JLabel jLabStatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBrowse;
    // End of variables declaration//GEN-END:variables

    /**
     * Recursive Byte string formatter ex: 10000 = 10.000
     *
     * @param bytes string containing digits to be formated
     * @return x.xxx.xxx.xxx style string
     */
    private static String byteSizeFormatter(String bytes) {
        StringBuilder sb = new StringBuilder();
        if (bytes.length() < 4) {
            sb.insert(0, bytes);
        } else {
            sb.insert(0, "." + bytes.substring(bytes.length() - 3));
            sb.insert(0, byteSizeFormatter(bytes.substring(0, bytes.length() - 3)));
        }
        return sb.toString();
    }

    public static String byteSizeFormatter(long bytes) {
        return byteSizeFormatter(bytes + "");
    }
}
