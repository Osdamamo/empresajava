
package empresajava1;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class reportes extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    public reportes() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Tareas = new javax.swing.JButton();
        Reportes = new javax.swing.JButton();
        Extraer = new javax.swing.JButton();
        pagos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txttarea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RegistroT = new javax.swing.JTable();
        tdatos = new javax.swing.JLabel();
        barratitulo = new javax.swing.JPanel();
        x = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(54, 57, 63));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tareas.setBackground(new java.awt.Color(70, 70, 70));
        Tareas.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Tareas.setForeground(new java.awt.Color(255, 255, 255));
        Tareas.setText("Tareas");
        Tareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TareasMousePressed(evt);
            }
        });
        Tareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareasActionPerformed(evt);
            }
        });
        jPanel3.add(Tareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 40));

        Reportes.setBackground(new java.awt.Color(70, 70, 70));
        Reportes.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Reportes.setForeground(new java.awt.Color(255, 255, 255));
        Reportes.setText("Reportes");
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });
        jPanel3.add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, 40));

        Extraer.setBackground(new java.awt.Color(70, 70, 70));
        Extraer.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Extraer.setForeground(new java.awt.Color(255, 255, 255));
        Extraer.setText("Extraer");
        Extraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraerActionPerformed(evt);
            }
        });
        jPanel3.add(Extraer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 40));

        pagos.setBackground(new java.awt.Color(70, 70, 70));
        pagos.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        pagos.setForeground(new java.awt.Color(255, 255, 255));
        pagos.setText("Pagos");
        pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosActionPerformed(evt);
            }
        });
        jPanel3.add(pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 460));

        jPanel4.setBackground(new java.awt.Color(225, 153, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Agregar.setBackground(new java.awt.Color(70, 70, 70));
        Agregar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("Agregar");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel4.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        Eliminar.setBackground(new java.awt.Color(70, 70, 70));
        Eliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel4.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 90, 20));

        Modificar.setBackground(new java.awt.Color(70, 70, 70));
        Modificar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel4.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 90, 20));

        jPanel5.setBackground(new java.awt.Color(54, 57, 56));
        jPanel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(txttarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 480, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("reportes");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 550, 50));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Todos los reportes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12))); // NOI18N

        RegistroT.setBackground(new java.awt.Color(54, 57, 56));
        RegistroT.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        RegistroT.setForeground(new java.awt.Color(255, 255, 255));
        RegistroT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null}
            },
            new String [] {
                "reportes"
            }
        ));
        RegistroT.setAutoResizeMode(1);
        RegistroT.setColumnSelectionAllowed(true);
        RegistroT.setSelectionBackground(new java.awt.Color(54, 57, 56));
        RegistroT.setSelectionForeground(new java.awt.Color(54, 57, 56));
        jScrollPane1.setViewportView(RegistroT);
        RegistroT.getAccessibleContext().setAccessibleName("");

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 550, 290));
        jScrollPane1.getAccessibleContext().setAccessibleName("reportes");

        tdatos.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        tdatos.setForeground(new java.awt.Color(255, 255, 255));
        tdatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total de Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.add(tdatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 140, 40));

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
        barratitulo.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 20, 30));

        jPanel4.add(barratitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 570, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int xmouse ,ymouse;
    //Metodos
    public void limpiar(){
        txttarea.setText("");
    }
    public void mostrar(){
                 modelo.addColumn("Tareas");
                 RegistroT.setModel(modelo);
    }
    
    
    
    private void TareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TareasActionPerformed

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportesActionPerformed

    private void ExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExtraerActionPerformed

    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagosActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        
    }//GEN-LAST:event_AgregarActionPerformed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
    DefaultTableModel modelo = (DefaultTableModel) RegistroT.getModel();
    Object [] Dato = new Object [1];
     Dato[0] = txttarea.getText();
        
     modelo.addRow(Dato);
     int filast = RegistroT.getRowCount();
     tdatos.setText(""+filast);
    }//GEN-LAST:event_AgregarMouseClicked

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        x.setForeground(new Color(255,153,51));
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        x.setForeground(Color.white);
    }//GEN-LAST:event_xMouseExited

    private void barratituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barratituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_barratituloMouseDragged

    private void barratituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barratituloMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_barratituloMousePressed

    private void TareasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TareasMousePressed
       principal principal = new principal();
    principal.setVisible(true);  
    dispose();
    }//GEN-LAST:event_TareasMousePressed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Extraer;
    private javax.swing.JButton Modificar;
    private javax.swing.JTable RegistroT;
    private javax.swing.JButton Reportes;
    private javax.swing.JButton Tareas;
    private javax.swing.JPanel barratitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pagos;
    private javax.swing.JLabel tdatos;
    private javax.swing.JTextField txttarea;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
