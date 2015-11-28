/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIC.Vistas;


import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author Escobar
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
           
        new Login(this, true).setVisible(true);
        ImageIcon fot = new ImageIcon(getClass().getResource("/SIC/Imagenes/logo.png"));
        ImageIcon icono = new ImageIcon(fot.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(icono);
        
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        envio1 = new javax.swing.JButton();
        envio2 = new javax.swing.JButton();
        envio4 = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        envio3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema informatico DELIFRUTAL");
        setBackground(new java.awt.Color(102, 177, 255));
        setExtendedState(6);

        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DELIFRUTAL");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EL SABOR DE LO NATURAL ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        envio1.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        envio1.setText("REGISTRAR TRANSACCIÓN");
        envio1.setMaximumSize(new java.awt.Dimension(165, 23));
        envio1.setPreferredSize(new java.awt.Dimension(160, 25));
        envio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envio1ActionPerformed(evt);
            }
        });

        envio2.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        envio2.setText("ESTADOS FINANCIEROS");
        envio2.setPreferredSize(new java.awt.Dimension(160, 25));
        envio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envio2ActionPerformed(evt);
            }
        });

        envio4.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        envio4.setText("MANTENIMIENTO DE CUENTAS");
        envio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envio4ActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SIC/Imagenes/logo.png"))); // NOI18N

        envio3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        envio3.setText("ORDEN DE FABRICACION");
        envio3.setPreferredSize(new java.awt.Dimension(160, 25));
        envio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envio3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imagen)
                                .addGap(423, 423, 423))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(envio3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(envio2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(envio1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(envio4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(184, 184, 184))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(482, 482, 482))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(540, 540, 540))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(envio4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(envio1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(envio2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(envio3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imagen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void envio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envio1ActionPerformed
        // TODO add your handling code here:
        new IngresoCuenta(this, true).setVisible(true);
    }//GEN-LAST:event_envio1ActionPerformed

    private void envio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envio2ActionPerformed
        new MantenimientoEstadosFinancieros(this, true).setVisible(true);
    }//GEN-LAST:event_envio2ActionPerformed

    private void envio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envio4ActionPerformed
    new MantenimientoCuentas(this, true).setVisible(true);
    }//GEN-LAST:event_envio4ActionPerformed

    private void envio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envio3ActionPerformed
        // TODO add your handling code here:
        new OrdenesFabricacion(this, true).setVisible(true);
    }//GEN-LAST:event_envio3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton envio1;
    private javax.swing.JButton envio2;
    private javax.swing.JButton envio3;
    private javax.swing.JButton envio4;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
