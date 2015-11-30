/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIC.Vistas;

import SIC.Service.Comunes;
import SIC.Entidades.Cuenta;
import SIC.Entidades.TipoCuenta;
import SIC.Service.SICService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dannier
 */
public class MantenimientoCuentas extends javax.swing.JDialog {

    List<Cuenta> cuentas = new ArrayList<>();
    Cuenta cuentaActual;

    /**
     * Creates new form MantenimientoCuentas
     */
    public MantenimientoCuentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        comboTiposCuenta.setModel(Comunes.crearModeloComboBox(SICService.getServTipoCuenta().getListado(TipoCuenta.class)));
        this.setLocationRelativeTo(null);
        cargarDatos();
    }

    private void cargarDatos() {
      cuentas = SICService.getServCuenta().getListado(Cuenta.class);
        DefaultTableModel defaultTableModel = (DefaultTableModel) tablaCuentas.getModel();

        while (defaultTableModel.getRowCount() > 0) {
            defaultTableModel.removeRow(0);
        }
        for (Cuenta cuenta : cuentas) {
            Object[] linea = {cuenta.getIdCuenta(),
                cuenta.getNombre(),
                cuenta.getTipoCuenta().getNombre()
            };
            defaultTableModel.addRow(linea);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idCuenta = new javax.swing.JTextField();
        nombreCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboTiposCuenta = new javax.swing.JComboBox<>();
        botonGuardar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de cuentas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de datos"));

        jLabel1.setText("Id Cuenta");

        jLabel2.setText("Nombre");

        idCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCuentaActionPerformed(evt);
            }
        });

        nombreCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCuentaActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo");

        comboTiposCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "P", "R", "K" }));
        comboTiposCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTiposCuentaActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idCuenta)
                    .addComponent(nombreCuenta)
                    .addComponent(comboTiposCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonGuardar)
                    .addComponent(botonEliminar))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(comboTiposCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(botonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Catalogo de cuentas"))));

        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Nombre", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuentas.getTableHeader().setReorderingAllowed(false);
        tablaCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCuentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCuentas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCuentaActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        if (idCuenta.getText().isEmpty() || nombreCuenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Datos incompletos");
        } else {
            if (cuentaActual == null) {
                cuentaActual = new Cuenta(idCuenta.getText());
            }

            cuentaActual.setNombre(nombreCuenta.getText());
            cuentaActual.setTipoCuenta((TipoCuenta) comboTiposCuenta.getSelectedItem());

            if (SICService.getServCuenta().guardar(cuentaActual)) {
                JOptionPane.showMessageDialog(null, "Guardado");
                cargarDatos();
               limpiarTextos();

            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar");
            }
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void limpiarTextos(){
        nombreCuenta.setText("");
    }
    
    private void comboTiposCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTiposCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTiposCuentaActionPerformed

    private void idCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCuentaActionPerformed
        // TODO add your handling code here:
        cuentaActual = (Cuenta) SICService.getServCuenta().getByPK(Cuenta.class, idCuenta.getText());
        if (cuentaActual != null) {
            nombreCuenta.setText(cuentaActual.getNombre());
            comboTiposCuenta.setSelectedItem(cuentaActual.getTipoCuenta());
        } else {
            nombreCuenta.setText("");
        }
    }//GEN-LAST:event_idCuentaActionPerformed

    private void tablaCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCuentasMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            cuentaActual = cuentas.get(tablaCuentas.getSelectedRow());
            idCuenta.setText(cuentaActual.getIdCuenta());
            nombreCuenta.setText(cuentaActual.getNombre());
            comboTiposCuenta.setSelectedItem(cuentaActual.getTipoCuenta());
        }
    }//GEN-LAST:event_tablaCuentasMouseClicked

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        if(cuentaActual!=null){
            SICService.getServCuenta().guardar(cuentaActual);
            cargarDatos();
            limpiarTextos();
        }else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado una cuenta");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JComboBox<String> comboTiposCuenta;
    private javax.swing.JTextField idCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreCuenta;
    private javax.swing.JTable tablaCuentas;
    // End of variables declaration//GEN-END:variables
}
