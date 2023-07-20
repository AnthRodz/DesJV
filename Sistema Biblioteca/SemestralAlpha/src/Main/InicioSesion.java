/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import TablaUsuario.Usuarios;
import TablaUsuario.UsuariosBD;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shanj
 */
public class InicioSesion extends javax.swing.JFrame {
        Usuarios usuario = new Usuarios();
        UsuariosBD uBD = new UsuariosBD();
    public InicioSesion() {
        initComponents();
        this.setTitle("BookEase");
        
          ImageIcon image;
            image = new ImageIcon("Logo-Book.png");
        this.setIconImage(image.getImage());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoContrasena = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnCrearCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BookEase - Iniciar Sesion");
        setBackground(java.awt.Color.black);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));

        contenedor.setBackground(new java.awt.Color(83, 43, 136));
        contenedor.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo-Book.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        campoCorreo.setBackground(new java.awt.Color(217, 217, 217));
        campoCorreo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        campoCorreo.setToolTipText("Correo Electronico");
        campoCorreo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 5, true));
        campoCorreo.setName(""); // NOI18N
        campoCorreo.setPreferredSize(new java.awt.Dimension(60, 30));
        campoCorreo.setSelectedTextColor(new java.awt.Color(255, 0, 51));

        jLabel2.setBackground(new java.awt.Color(235, 243, 244));
        jLabel2.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 217, 217));
        jLabel2.setText("Correo Electrónico");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(217, 217, 217));
        jLabel3.setText("Contraseña");

        campoContrasena.setBackground(new java.awt.Color(217, 217, 217));
        campoContrasena.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        campoContrasena.setToolTipText("Contraseña");
        campoContrasena.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(217, 217, 217), 5, true));
        campoContrasena.setMinimumSize(new java.awt.Dimension(60, 30));
        campoContrasena.setPreferredSize(new java.awt.Dimension(60, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(217, 217, 217));
        btnIniciarSesion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(47, 24, 75));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(83, 43, 136), 8, true));
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnCrearCuenta.setBackground(new java.awt.Color(217, 217, 217));
        btnCrearCuenta.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(47, 24, 75));
        btnCrearCuenta.setText("Crear cuenta");
        btnCrearCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(83, 43, 136), 8, true));
        btnCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearCuenta.setMaximumSize(new java.awt.Dimension(126, 40));
        btnCrearCuenta.setMinimumSize(new java.awt.Dimension(126, 40));
        btnCrearCuenta.setPreferredSize(new java.awt.Dimension(126, 40));
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(522, 522, 522)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(592, 592, 592)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))))
                .addGap(599, 599, 599))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        
     validar();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
       RegistroUsuario regUsuario = new RegistroUsuario();
       ShowPanel(regUsuario);
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

       private void ShowPanel(JPanel p){
        p.setSize(1366,768);
        p.setLocation(0,0);       
        contenedor.removeAll();
        contenedor.add(p,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        
    }
    
       private void validar() {
    String email = campoCorreo.getText();
    String contra = String.valueOf(campoContrasena.getPassword());
    
    if (!"".equals(email) && !"".equals(contra)) { 

        if (email.equals("admin_correo.com") && contra.equals("987456")) { 
            PanelAdministracion panelAdmin = new PanelAdministracion();
            ShowPanel(panelAdmin);
        } else {
            usuario = uBD.iniciarSesion(email, contra);
            if (usuario.getCorreoElectronico() != null && usuario.getContrasena() != null) {
                PanelEstudiante panelEst = new PanelEstudiante();
                ShowPanel(panelEst);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o la Contraseña incorrecta");
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, ingresa el email y la contraseña.");
    }
}
       
       
       
       
       
       
       
       
       
//        private void validar() {
//        String email = campoCorreo.getText();
//        String contra = String.valueOf(campoContrasena.getPassword());
//        if (!"".equals(email) || !"".equals(contra)) {
//             usuario = uBD.iniciarSesion(email, contra);
//            if (usuario.getCorreoElectronico() != null && usuario.getContrasena()!= null) {
//              
//                PanelEstudiante panelEst = new PanelEstudiante();
//                ShowPanel(panelEst);
//            } else {
//                JOptionPane.showMessageDialog(null, "Usuario o la Contraseña incorrecta");
//            }
//
//        }
//
//    }

       
       
    
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JPasswordField campoContrasena;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
