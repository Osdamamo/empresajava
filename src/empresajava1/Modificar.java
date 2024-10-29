
package empresajava1;

public class Modificar extends javax.swing.JFrame {
private boolean guardado = false;
    public Modificar(int numCampos) {
    initComponents();
    if (numCampos == 1) {
        // Oculta los campos 2 y 3 si solo se va a modificar un campo
        txtcampo2.setVisible(false);
        txtcampo3.setVisible(false);
        campo2.setVisible(false);
        campo3.setVisible(false);
    }else{
        txtcampo2.setVisible(true);
        txtcampo3.setVisible(true);
        campo2.setVisible(true);
        campo3.setVisible(true);
    }
        setLocationRelativeTo(null);    
        guardar = new javax.swing.JButton("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            guardado = true; // Indicamos que se guardó
            setVisible(false); // Cerramos el JFrame
        }
    });
}



public boolean isGuardado() {
    return guardado; // Para verificar si el usuario guardó
}
// Método para obtener el texto modificado de un solo campo
public String getCampoModificado() {
    return txtcampo1.getText();
}

// Métodos para obtener el texto modificado de los tres campos
public String getCampo1Modificado() {
    return txtcampo1.getText();
}

public String getCampo2Modificado() {
    return txtcampo2.getText();
}

public String getCampo3Modificado() {
    return txtcampo3.getText();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campo1 = new javax.swing.JLabel();
        campo2 = new javax.swing.JLabel();
        campo3 = new javax.swing.JLabel();
        txtcampo1 = new javax.swing.JTextField();
        txtcampo2 = new javax.swing.JTextField();
        txtcampo3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campo1.setText("Campo 1");
        jPanel1.add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        campo2.setText("Campo 2");
        jPanel1.add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        campo3.setText("Campo 3");
        jPanel1.add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtcampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcampo1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtcampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, -1));

        jPanel1.add(txtcampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 360, -1));

        txtcampo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcampo3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtcampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 360, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Modificar Datos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 170, 20));

        cancelar.setText("Cancelar");
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcampo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcampo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcampo3ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
    String dato1 = txtcampo1.getText();
    String dato2 = txtcampo2.isVisible() ? txtcampo2.getText() : null;
    String dato3 = txtcampo3.isVisible() ? txtcampo3.getText() : null;

    // Aquí puedes enviar los datos a la tabla o al componente que necesitas actualizar
    if (dato2 == null && dato3 == null) {
        System.out.println("Modificado campo 1: " + dato1);
    } else {
        System.out.println("Modificado campo 1: " + dato1 + ", campo 2: " + dato2 + ", campo 3: " + dato3);
    }

    // Cierra la ventana después de guardar
    dispose();
    }//GEN-LAST:event_guardarActionPerformed

    private void txtcampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcampo1ActionPerformed

    }//GEN-LAST:event_txtcampo1ActionPerformed

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modificar(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel campo1;
    private javax.swing.JLabel campo2;
    private javax.swing.JLabel campo3;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcampo1;
    private javax.swing.JTextField txtcampo2;
    private javax.swing.JTextField txtcampo3;
    // End of variables declaration//GEN-END:variables
}
