/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Entidades.Alumno;
import AccesoADatos.AlumnoData;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class ViewAlumnos extends javax.swing.JInternalFrame {

    public ViewAlumnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        radioActivo = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Alumnos");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Fecha:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("DNI:");

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton3.setText("Buscar");

        jButton4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton4.setText("Modificar");

        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton5.setText("Eliminar");

        close.setBackground(new java.awt.Color(255, 0, 0));
        close.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("X");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Estado:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioActivo)
                                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                                    .addComponent(close)
                                    .addGap(11, 11, 11))))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5))
                    .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radioActivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Obtener campos
        String dniTxt = txtDni.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        java.util.Date fecha = fechaNacimiento.getDate();
        
        try {
            //Verificar campos
            if(dniTxt.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || fecha == null) {
               JOptionPane.showMessageDialog(
                       this,
                       "Complete los campos correctamente.",
                       "Error",
                       JOptionPane.ERROR_MESSAGE
               );
               return;
            }
            
            //Formateando valores
            Integer dni = Integer.valueOf(dniTxt);
            LocalDate ldFecha = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Boolean activo = radioActivo.isSelected();
            
            //Conexión con base de datos
            AlumnoData ad = new AlumnoData();
            String msjFinal = ad.guardarAlumno(new Alumno(
                    0,
                    nombre,
                    apellido,
                    dni,
                    ldFecha,
                    activo
            ));
            
            JOptionPane.showMessageDialog(this, msjFinal);
            limpiarCampos();
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ingrese un DNI válido.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton radioActivo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        fechaNacimiento.setDate(null);
        radioActivo.setSelected(false);
    }
}
