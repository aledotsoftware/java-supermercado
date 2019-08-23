/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1.view;

import com.mycompany.proyecto1.controler.ControllerGestionCliente;
import com.mycompany.proyecto1.model.Cliente;

/**
 *
 * @author ismae
 */
public class ViewCreateCliente extends javax.swing.JPanel {
    ControllerGestionCliente controlador;
    /**
     * Creates new form ViewCreateCliente
     */
    public ViewCreateCliente() {
         controlador = new ControllerGestionCliente ();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_nombre = new javax.swing.JLabel();
        jlbl_apellido = new javax.swing.JLabel();
        jlbl_dni = new javax.swing.JLabel();
        jlbl_direccion = new javax.swing.JLabel();
        jlbl_telefono = new javax.swing.JLabel();
        jlbl_email = new javax.swing.JLabel();
        jbtn_aceptar = new javax.swing.JButton();
        jbtn_cancelar = new javax.swing.JButton();
        jtf_nombre = new javax.swing.JTextField();
        jtf_apellido = new javax.swing.JTextField();
        jtf_dni = new javax.swing.JTextField();
        jtf_direccion = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();

        jlbl_nombre.setText("Nombre :");

        jlbl_apellido.setText("Apellido :");

        jlbl_dni.setText("DNI :");

        jlbl_direccion.setText("Direccion :");

        jlbl_telefono.setText("Telefono :");

        jlbl_email.setText("Email :");

        jbtn_aceptar.setText("ACEPTAR");
        jbtn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_aceptarActionPerformed(evt);
            }
        });

        jbtn_cancelar.setText("CANCELAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbl_email)
                            .addComponent(jlbl_telefono)
                            .addComponent(jlbl_direccion)
                            .addComponent(jlbl_dni)
                            .addComponent(jlbl_apellido)
                            .addComponent(jlbl_nombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_email, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(jtf_telefono)
                            .addComponent(jtf_direccion)
                            .addComponent(jtf_dni)
                            .addComponent(jtf_apellido)
                            .addComponent(jtf_nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jbtn_aceptar)
                        .addGap(91, 91, 91)
                        .addComponent(jbtn_cancelar)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_nombre)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_apellido)
                    .addComponent(jtf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_dni)
                    .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_direccion)
                    .addComponent(jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_telefono)
                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_email)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_aceptar)
                    .addComponent(jbtn_cancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_aceptarActionPerformed
Cliente c = new Cliente();
c.setNombre (jtf_nombre.getText());
c.setApellido (jtf_apellido.getText());
c.setDni (jtf_dni.getText());
c.setDireccion (jtf_direccion.getText());
c.setTelefono (jtf_telefono.getText());
c.setEmail (jtf_email.getText());

jtf_apellido.setEnabled (false);
jtf_direccion.setEnabled(false);
jtf_dni.setEnabled(false);
jtf_email.setEnabled(false);
jtf_nombre.setEnabled(false);
jtf_telefono.setEnabled(false);

jbtn_aceptar.setEnabled(false);
jbtn_cancelar.setEnabled(false);

controlador.create(c);


    }//GEN-LAST:event_jbtn_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_aceptar;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JLabel jlbl_apellido;
    private javax.swing.JLabel jlbl_direccion;
    private javax.swing.JLabel jlbl_dni;
    private javax.swing.JLabel jlbl_email;
    private javax.swing.JLabel jlbl_nombre;
    private javax.swing.JLabel jlbl_telefono;
    private javax.swing.JTextField jtf_apellido;
    private javax.swing.JTextField jtf_direccion;
    private javax.swing.JTextField jtf_dni;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
