
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

    public agregar(java.awt.Frame parent, boolean modal) {
       
        super(parent, modal);
        initComponents();
        aceptar.setBackground(new Color(139, 0, 0));
        aceptar.setForeground(Color.black);
        setIconImage(new ImageIcon(getClass().getResource("/icons/logof.png")).getImage());

        

            @Override
            public void insertUpdate(DocumentEvent e) { validar(); }
            @Override
            public void removeUpdate(DocumentEvent e) { validar(); }
            @Override
            public void changedUpdate(DocumentEvent e) { validar(); }

        servicios.addItemListener(e -> validar());
        materiales.addItemListener(e -> validar());

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tdatos = new javax.swing.JLabel();
        barratitulo = new javax.swing.JPanel();
        materiales = new javax.swing.JCheckBox();
        servicios = new javax.swing.JCheckBox();
        Jpago = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        Jpago1 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        JLnombre = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        JLvalor = new javax.swing.JLabel();
        valort = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        JLvalortotal1 = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ventana");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(225, 153, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tdatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Total de Registro"));
        jPanel4.add(tdatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 140, 40));

        barratitulo.setBackground(new java.awt.Color(225, 153, 51));
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
        jPanel4.add(barratitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 30));


        materiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialesActionPerformed(evt);
            }
        });

        servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviciosActionPerformed(evt);
            }
        });


        Jpago.setBackground(new java.awt.Color(255, 255, 255));
        Jpago.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Jpago.setForeground(new java.awt.Color(255, 255, 255));
        Jpago.setText("Cantidad:");


        nombre.setBackground(new java.awt.Color(204, 204, 204));
        nombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
        });


        Jpago1.setBackground(new java.awt.Color(255, 255, 255));
        Jpago1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Jpago1.setForeground(new java.awt.Color(255, 255, 255));
        Jpago1.setText("Seleccione:");


        valor.setBackground(new java.awt.Color(204, 204, 204));
        valor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        valor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });
        valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valorKeyReleased(evt);
            }
        });


        JLnombre.setBackground(new java.awt.Color(255, 255, 255));
        JLnombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLnombre.setForeground(new java.awt.Color(255, 255, 255));
        JLnombre.setText("Nombre:");


        cantidad.setBackground(new java.awt.Color(204, 204, 204));
        cantidad.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadKeyReleased(evt);
            }
        });


        JLvalor.setBackground(new java.awt.Color(255, 255, 255));
        JLvalor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLvalor.setForeground(new java.awt.Color(255, 255, 255));
        JLvalor.setText("Valor:");


        valort.setEditable(false);
        valort.setBackground(new java.awt.Color(222, 222, 222));
        valort.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        valort.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valortActionPerformed(evt);
            }
        });
        valort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valortKeyPressed(evt);
            }
        });


        aceptar.setBackground(new java.awt.Color(70, 70, 70));
        aceptar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("Aceptar");
        aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarMouseClicked(evt);
            }
        });
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(70, 70, 70));
        cancelar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });


        JLvalortotal1.setBackground(new java.awt.Color(255, 255, 255));
        JLvalortotal1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLvalortotal1.setForeground(new java.awt.Color(255, 255, 255));
        JLvalortotal1.setText("Valor Total:");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    //metodos
    public void validar(){

        aceptar.setBackground(new Color(139, 0, 0));
        aceptar.setForeground(Color.black);
    } else {
        aceptar.setBackground(new Color(70, 70, 70));
        aceptar.setForeground(Color.white);
    }
}
    


    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed


    private void materialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialesActionPerformed
        if (materiales.isSelected()) {
            materiales.setSelected(true);servicios.setSelected(false);
        }else{
            servicios.setSelected(false);  materiales.setSelected(false);
        }

    }//GEN-LAST:event_materialesActionPerformed

    private void serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviciosActionPerformed
        if (servicios.isSelected()) {
            materiales.setSelected(false);servicios.setSelected(true);
        }else {
            servicios.setSelected(false);  materiales.setSelected(false);
        }

    }//GEN-LAST:event_serviciosActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void valortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valortActionPerformed

    private void valortKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valortKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_valortKeyPressed

    private void aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseClicked
    try{
        if (valor.getText().trim().isEmpty() ||
        nombre.getText().trim().isEmpty() ||
        cantidad.getText().trim().isEmpty() || 
        !servicios.isSelected() && 

                "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if (Float.parseFloat(cantidad.getText())<=0) {
            JOptionPane.showMessageDialog(this, "Cantidad tiene que ser mayor que cero");

         //llenar valores   
        }else if (Float.parseFloat(valor.getText())<=0) {
            JOptionPane.showMessageDialog(this, "Valor tiene que ser mayor que cero");
        }else{
                    this.setVisible(false);

        }
        
        JOptionPane.showMessageDialog(this, "Los Datos No son validos");
    }
    }//GEN-LAST:event_aceptarMouseClicked

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed

    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
    }//GEN-LAST:event_cancelarActionPerformed

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        this.setRootPane(null);//lo hace inservible entonces no envia los datos
        this.dispose();//lo cierra
    }//GEN-LAST:event_cancelarMouseClicked

    private void cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyReleased

           
           valort.setText("0.00");
        }
    }//GEN-LAST:event_cantidadKeyReleased

    private void valorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorKeyReleased

        cantidadKeyReleased(null);
    }//GEN-LAST:event_valorKeyReleased

    private void barratituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barratituloMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_barratituloMousePressed

    private void barratituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barratituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_barratituloMouseDragged


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
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLvalor;
    private javax.swing.JLabel JLvalortotal1;
    private javax.swing.JLabel Jpago;
    private javax.swing.JLabel Jpago1;
    private javax.swing.JButton aceptar;

    public javax.swing.JCheckBox materiales;
    public javax.swing.JTextField nombre;
    public javax.swing.JCheckBox servicios;
    private javax.swing.JLabel tdatos;
    public javax.swing.JTextField valor;
    public javax.swing.JTextField valort;
    // End of variables declaration//GEN-END:variables


}
