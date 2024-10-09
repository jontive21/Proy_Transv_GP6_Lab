/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import AccesoADatos.MateriaData;
import Entidades.Materia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class ViewMaterias extends javax.swing.JInternalFrame {

    private int idMateria = 0;
    private DefaultTableModel modelo = new DefaultTableModel();
    private boolean mostrarCampos = false;

    public ViewMaterias() {
        initComponents();
        btnModificar.setVisible(false);
        armarCabecera();
        camposActivos(mostrarCampos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        close = new javax.swing.JButton();
        cmbAnio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        radio = new javax.swing.JRadioButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaMaterias = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Materias");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Año:");

        btnRegistrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(255, 0, 0));
        close.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("X");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        cmbAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Activa:");

        btnModificar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tbListaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbListaMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbListaMateriasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbListaMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(radio)))))
                            .addComponent(jLabel3)
                            .addComponent(btnModificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(radio))
                        .addGap(29, 29, 29)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        dispose();

    }//GEN-LAST:event_closeActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (!mostrarCampos) {
            mostrarCampos = true;
            camposActivos(mostrarCampos);
        } else {
            String nombre = txtNombre.getText();
            String añoTxt = (String) cmbAnio.getSelectedItem();
            Integer año = Integer.parseInt(añoTxt);
            boolean activo = radio.isSelected();

            if (nombre.isEmpty() || año == null) {
                JOptionPane.showMessageDialog(
                        this,
                        "Complete los campos correctamente.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            MateriaData md = new MateriaData();
            String res = md.guardarMateria(new Materia(0, nombre, año, activo));
            JOptionPane.showMessageDialog(this, res);
            mostrarCampos = false;
            limpiarCampos();
            camposActivos(mostrarCampos);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        MateriaData md = new MateriaData();
        List<Materia> listaMat = md.listarMaterias();

        if (listaMat.size() == 0) {
            JOptionPane.showMessageDialog(this, "No hay ninguna materia registrada.");
            return;
        }

        modelo.setRowCount(0);
        for (Materia mat : listaMat) {
            modelo.addRow(new Object[]{
                mat.getIdMateria(),
                mat.getNombre(),
                mat.getAnio(),
                mat.isActivo()
            });
        }

        tbListaMaterias.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String nombre = txtNombre.getText();
        String añoTxt = (String) cmbAnio.getSelectedItem();
        Integer año = Integer.parseInt(añoTxt);
        boolean activo = radio.isSelected();

        MateriaData md = new MateriaData();
        String res = md.modificarMateria(new Materia(idMateria, nombre, año, activo));
        JOptionPane.showMessageDialog(this, res);
        mostrarCampos = false;
        camposActivos(mostrarCampos);
        limpiarCampos();
        btnModificar.setVisible(false);
        modelo.setRowCount(0);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tbListaMateriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaMateriasMousePressed
        int filaSeleccionada = tbListaMaterias.getSelectedRow();
        int filaTabla = tbListaMaterias.convertRowIndexToModel(filaSeleccionada);

        if (!mostrarCampos) {
            mostrarCampos = true;
            camposActivos(mostrarCampos);
        }

        Integer id = (Integer) modelo.getValueAt(filaTabla, 0);
        String nombre = (String) modelo.getValueAt(filaTabla, 1);
        Integer anio = (Integer) modelo.getValueAt(filaTabla, 2);
        Boolean activo = (Boolean) modelo.getValueAt(filaTabla, 3);

        txtNombre.setText(nombre);
        cmbAnio.setSelectedItem(anio);
        radio.setSelected(activo);
        idMateria = id;

        btnModificar.setVisible(true);
    }//GEN-LAST:event_tbListaMateriasMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tbListaMaterias.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Seleccione una fila para poder eliminarla. Si no hay ninguna use el botón de Buscar."
            );
            return;
        }

        int filaTabla = tbListaMaterias.convertRowIndexToModel(filaSeleccionada);
        Integer id = (Integer) modelo.getValueAt(filaTabla, 0);
        String nombre = (String) modelo.getValueAt(filaTabla, 1);
        Integer anio = (Integer) modelo.getValueAt(filaTabla, 2);
        Boolean activo = (Boolean) modelo.getValueAt(filaTabla, 3);
        idMateria = id;

        int i = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro que deseas eliminarla?",
                "Confirmar",
                JOptionPane.DEFAULT_OPTION
        );

        if (i == 0) {
            MateriaData md = new MateriaData();
            String res = md.borrarMateria(idMateria);
            JOptionPane.showMessageDialog(this, res);
            mostrarCampos = false;
            camposActivos(mostrarCampos);
            limpiarCampos();
            btnModificar.setVisible(false);
            modelo.setRowCount(0);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton close;
    private javax.swing.JComboBox<String> cmbAnio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton radio;
    private javax.swing.JTable tbListaMaterias;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Activo");
        tbListaMaterias.setModel(modelo);
    }

    private void camposActivos(boolean bool) {
        txtNombre.setEnabled(bool);
        cmbAnio.setEnabled(bool);
        radio.setEnabled(bool);
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        cmbAnio.setSelectedItem("1");
        radio.setSelected(false);
    }
}
