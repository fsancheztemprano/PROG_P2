/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.gui.editor;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import src.dao.ServidoDao;
import src.model.Servido;
import src.model.StaticHelpers;

/**
 *
 * @author NarF
 */
public final class ServidoFrame extends javax.swing.JFrame {

    String nombre = "";

    public ServidoFrame() {
        nombre = "Servido";
        setMinimumSize(new Dimension(350, 275));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(nombre);
        initComponents();

        this.setLocationRelativeTo(null);
    }

    public ServidoFrame(Servido servido) {
        this();
        jTextFieldID.setText(servido.getIdServido()+ "");
        jTextFieldIdOrden.setText(servido.getIdOrden()+ "");
        jTextFieldIdProducto.setText(servido.getIdProducto()+ "");
    }

    public ServidoFrame(int id) {
        this(ServidoDao.getInstance().getAll().get(id));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        jTextFieldIdOrden = new javax.swing.JTextField();
        jTextFieldIdProducto = new javax.swing.JTextField();
        nameLabel1 = new javax.swing.JLabel();
        jBtnCancel = new javax.swing.JButton();
        jBtnAccept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(300, 200));

        titleLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText(nombre);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        idLabel.setText("id");

        jTextFieldID.setEditable(false);
        jTextFieldID.setMinimumSize(new java.awt.Dimension(100, 24));

        nameLabel.setText("idOrden");

        jTextFieldIdOrden.setMinimumSize(new java.awt.Dimension(100, 24));

        jTextFieldIdProducto.setMinimumSize(new java.awt.Dimension(100, 24));

        nameLabel1.setText("idProducto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jBtnCancel.setText("Cancelar");
        jBtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelActionPerformed(evt);
            }
        });

        jBtnAccept.setText("Aceptar");
        jBtnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 120, Short.MAX_VALUE)
                        .addComponent(jBtnAccept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancel))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCancel)
                    .addComponent(jBtnAccept)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAcceptActionPerformed
        // TODO add your handling code here:
        String id = jTextFieldID.getText().trim();
        String ordenStr = jTextFieldIdOrden.getText().trim();
        String prodStr = jTextFieldIdProducto.getText().trim();
        if (ordenStr.length() > 0 && StaticHelpers.isInteger(ordenStr) && Integer.parseInt(ordenStr) > 0) {
            if (prodStr.length() > 0 && StaticHelpers.isInteger(prodStr) && Integer.parseInt(prodStr) > 0) {
                if (id.length() == 0) { // id vacio = objeto nuevo
                    Servido servido = new Servido(Integer.parseInt(ordenStr), Integer.parseInt(prodStr));
                    if (ServidoDao.getInstance().insert(servido) > 0) {
                        this.dispose();
                        JOptionPane.showMessageDialog(this, "Insercion realizada", nombre, JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Insercion rechazada", nombre, JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    Servido servido = ServidoDao.getInstance().get(Integer.parseInt(id));
                    servido.setIdOrden(Integer.parseInt(ordenStr));
                    servido.setIdProducto(Integer.parseInt(prodStr));
                    if (ServidoDao.getInstance().update(servido) > 0) {
                        this.dispose();
                        JOptionPane.showMessageDialog(this, "Modificacion realizada", nombre, JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Modificacion rechazada", nombre, JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Capacidad de " + nombre + " invalida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nombre de " + nombre + " invalido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnAcceptActionPerformed

    private void jBtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBtnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idLabel;
    public javax.swing.JButton jBtnAccept;
    public javax.swing.JButton jBtnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldIdOrden;
    private javax.swing.JTextField jTextFieldIdProducto;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
