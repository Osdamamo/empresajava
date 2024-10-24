package empresajava1;


import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {

  int xmouse ,ymouse;
    public login() {
        initComponents();
          setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        barratitulo = new javax.swing.JPanel();
        x = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 0, 16));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setFocusable(false);
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Login");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 60, 60));

        txtusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtusuario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setText("Usuario");
        jPanel2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, 30));

        usuario.setBackground(new java.awt.Color(40, 34, 18));
        usuario.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(37, 47, 4));
        usuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioKeyPressed(evt);
            }
        });
        jPanel2.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, -1));

        txtcontraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtcontraseña.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtcontraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtcontraseña.setText("Contraseña");
        jPanel2.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, -1));

        contraseña.setBackground(new java.awt.Color(40, 34, 18));
        contraseña.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseñaMouseClicked(evt);
            }
        });
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaKeyPressed(evt);
            }
        });
        jPanel2.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 320, -1));

        entrar.setBackground(new java.awt.Color(255, 153, 51));
        entrar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        entrar.setForeground(new java.awt.Color(255, 255, 255));
        entrar.setText("ingresar");
        entrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/preesslogin.png"))); // NOI18N
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        entrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entrarKeyPressed(evt);
            }
        });
        jPanel2.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 320, 50));

        barratitulo.setBackground(new java.awt.Color(0, 0, 0));
        barratitulo.setForeground(new java.awt.Color(0, 0, 0));
        barratitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barratituloMouseDragged(evt);
            }
        });
        barratitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barratituloMousePressed(evt);
            }
        });
        barratitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        x.setBackground(new java.awt.Color(255, 255, 255));
        x.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        x.setForeground(new java.awt.Color(255, 255, 255));
        x.setText("x");
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });
        barratitulo.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 20, 30));

        jPanel2.add(barratitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrarKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            String user = usuario.getText();
            String passw = contraseña.getText();
            if (user.isEmpty() || passw.isEmpty()) {
                JOptionPane.showMessageDialog(null, "algun campo esta vacio");
            }else{
                if(user.equals("admin")&& passw.equals("12345")){
                    principal pc = new principal();
                    pc.setVisible(true);
                    this.dispose();
                } else{JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");}
            }

        }
    }//GEN-LAST:event_entrarKeyPressed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        String user = usuario.getText();
        String passw = contraseña.getText();
        if (user.isEmpty() || passw.isEmpty()) {
            JOptionPane.showMessageDialog(null, "algun campo esta vacio");
        }else{
            if(user.equals("admin")&& passw.equals("12345")){
                principal pc = new principal();
                pc.setVisible(true);
                this.dispose();
            } else{JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");}
        }

    }//GEN-LAST:event_entrarActionPerformed

    private void contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){

            entrar.requestFocus();
        }
    }//GEN-LAST:event_contraseñaKeyPressed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed

    }//GEN-LAST:event_contraseñaActionPerformed

    private void contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMouseClicked

    }//GEN-LAST:event_contraseñaMouseClicked

    private void usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){

            contraseña.requestFocus();
        }
    }//GEN-LAST:event_usuarioKeyPressed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void barratituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barratituloMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_barratituloMousePressed

    private void barratituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barratituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_barratituloMouseDragged

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
       x.setForeground(new Color(255,153,51));
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
       x.setForeground(Color.white);
    }//GEN-LAST:event_xMouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barratitulo;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtcontraseña;
    private javax.swing.JLabel txtusuario;
    private javax.swing.JTextField usuario;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
