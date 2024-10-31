
package empresajava1;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;


    

public class pago extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    
   int xmouse ,ymouse;
    
    public pago() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icons/logof.png")).getImage());
        setLocationRelativeTo(null);
        cargarDesdeExcel();
       //calcular el valor total
        calcular();                

    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jPanel4 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        EliminarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaservicios = new javax.swing.JTable();
        barratitulo = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RegistroT1 = new javax.swing.JTable();
        tdatos = new javax.swing.JLabel();
        tdatos1 = new javax.swing.JLabel();

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
        setTitle("constructora mar s.a.s.");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(54, 57, 63));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tareas.setBackground(new java.awt.Color(70, 70, 70));
        Tareas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tareas.setForeground(new java.awt.Color(255, 255, 255));
        Tareas.setText("Tareas");
        Tareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareasActionPerformed(evt);
            }
        });


        Reportes.setBackground(new java.awt.Color(70, 70, 70));
        Reportes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Reportes.setForeground(new java.awt.Color(255, 255, 255));
        Reportes.setText("Reportes");
        Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReportesMousePressed(evt);
            }
        });
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });


        Extraer.setBackground(new java.awt.Color(70, 70, 70));
        Extraer.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Extraer.setForeground(new java.awt.Color(255, 255, 255));
        Extraer.setText("Extraer");
        Extraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraerActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(225, 153, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Agregar.setBackground(new java.awt.Color(70, 70, 70));
        Agregar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
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
        jPanel4.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 80, 20));

        Modificar.setBackground(new java.awt.Color(70, 70, 70));
        Modificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel4.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 80, 20));

        Eliminar.setBackground(new java.awt.Color(70, 70, 70));
        Eliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel4.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 80, 20));

        EliminarTodo.setBackground(new java.awt.Color(70, 70, 70));
        EliminarTodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EliminarTodo.setForeground(new java.awt.Color(255, 255, 255));
        EliminarTodo.setText("Eliminar Todo");
        EliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTodoActionPerformed(evt);
            }
        });
        jPanel4.add(EliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 120, 20));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaservicios.setBackground(new java.awt.Color(255, 255, 255));
        tablaservicios.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        tablaservicios.setForeground(new java.awt.Color(0, 0, 0));
        tablaservicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaservicios.setGridColor(new java.awt.Color(54, 57, 63));
        tablaservicios.setShowGrid(false);
        jScrollPane1.setViewportView(tablaservicios);


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


        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        RegistroT1.setBackground(new java.awt.Color(255, 255, 255));
        RegistroT1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        RegistroT1.setForeground(new java.awt.Color(0, 0, 0));
        RegistroT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RegistroT1.setGridColor(new java.awt.Color(54, 57, 63));
        RegistroT1.setShowGrid(false);
        jScrollPane2.setViewportView(RegistroT1);

nel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 570, 500));

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

    
    //Metodos
    private void calcular(){
        
        float suma=0;
        float suma2=0;
        for (int i = 0; i < RegistroT1.getRowCount(); i++) {
            float renglon;
            renglon =Float.parseFloat(RegistroT1.getValueAt(i, 3).toString());
            suma=suma+renglon;
            tdatos.setText(String.valueOf(suma));
        }
        for (int i = 0; i < tablaservicios.getRowCount(); i++) {
            float renglon;
            renglon =Float.parseFloat(tablaservicios.getValueAt(i, 3).toString());
            suma2=suma2+renglon;
            tdatos1.setText(String.valueOf(suma2));
        }
    }

    private void exportarAExcel() {
        Workbook workbook = new XSSFWorkbook();

    // Crear las hojas para Materiales y Servicios
    Sheet sheetMateriales = workbook.createSheet("Materiales");
    Sheet sheetServicios = workbook.createSheet("Servicios");

    // Exportar los datos de ambas tablas
    agregarTablaAHoja(sheetMateriales, RegistroT1);
    agregarTablaAHoja(sheetServicios, tablaservicios);

    // Guardar el archivo en el sistema
    try (FileOutputStream fileOut = new FileOutputStream("Pagos.xlsx")) {
        workbook.write(fileOut);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
private void cargarDesdeExcel() {
    File archivo = new File("Pagos.xlsx");
    if (!archivo.exists()) return; // Verificar si el archivo existe

    try (FileInputStream fileIn = new FileInputStream(archivo)) {
        Workbook workbook = new XSSFWorkbook(fileIn);
          // Limpiar la tabla antes de cargar
        modelo.setRowCount(0);
        
        Sheet sheetMateriales = workbook.getSheet("Materiales");
        DefaultTableModel modelomaterieales = (DefaultTableModel) RegistroT1.getModel();
        cargarDatosDesdeHoja(sheetMateriales, modelomaterieales);
        
        Sheet sheetServicios = workbook.getSheet("Servicios");
        DefaultTableModel modeloservicios = (DefaultTableModel) tablaservicios.getModel();
        cargarDatosDesdeHoja(sheetServicios, modeloservicios);
  

    } catch (IOException e) {
        e.printStackTrace();
    }
}
// Método auxiliar para cargar datos desde una hoja de Excel a un modelo de tabla
private void cargarDatosDesdeHoja(Sheet sheet, DefaultTableModel modelo) {
    if (sheet == null) return; // Verificar que la hoja exista
    
    // Limpiar la tabla antes de cargar datos
    modelo.setRowCount(0);

    // Leer filas del archivo Excel
    for (Row row : sheet) {
        if (row.getRowNum() == 0) continue; // Saltar encabezado

        Object[] datosFila = new Object[modelo.getColumnCount()];
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            Cell cell = row.getCell(i);
            datosFila[i] = (cell == null) ? "" : cell.toString(); // Manejar celdas nulas
        }
        modelo.addRow(datosFila);
    }
}

// Método para agregar los datos de una JTable a una hoja de Excel
    private void agregarTablaAHoja(Sheet sheet, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Agregar encabezados
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < model.getColumnCount(); i++) {
            Cell headerCell = headerRow.createCell(i);
            headerCell.setCellValue(model.getColumnName(i));
        }

        // Agregar filas de datos
        for (int i = 0; i < model.getRowCount(); i++) {
            Row row = sheet.createRow(i + 1);
            for (int j = 0; j < model.getColumnCount(); j++) {
                Object value = model.getValueAt(i, j); // Obtener valor de la celda
                String cellValue = (value == null) ? "" : value.toString(); // Manejar valores nulos

                Cell cell = row.createCell(j);
                cell.setCellValue(cellValue);
            }
        }
    }
    
    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        DefaultTableModel modeloServicios = (DefaultTableModel) tablaservicios.getModel();
        DefaultTableModel modeloMateriales = (DefaultTableModel) RegistroT1.getModel();

        int selectedRowServicios = tablaservicios.getSelectedRow();
        int selectedRowMateriales = RegistroT1.getSelectedRow();
        //devuelve ya que no seleccciona ninguna fila
        if (selectedRowServicios == -1 && selectedRowMateriales == -1) 
        return;

        agregar modificar = new agregar(this, true);
// Configurar el estado de los checkboxes o radio buttons según la fila seleccionada
if (selectedRowServicios != -1) {
    // Si hay una fila seleccionada en servicios, activar el checkbox correspondiente
    modificar.servicios.setSelected(true);
        modificar.materiales.setEnabled(false);
} else if (selectedRowMateriales != -1) {
    // Si hay una fila seleccionada en materiales, activar el checkbox correspondiente
    modificar.materiales.setSelected(true);
        modificar.servicios.setEnabled(false);
    System.out.println("Checkbox de materiales activado.");
}

    if (selectedRowServicios != -1 && selectedRowServicios < modeloServicios.getRowCount()) {
        Vector registro = (Vector) modeloServicios.getDataVector().elementAt(selectedRowServicios);
                        if (registro.size() >= 4) {
    }
    // Verificar si la fila seleccionada es válida
    if (selectedRowMateriales != -1 && selectedRowMateriales < modeloMateriales.getRowCount()) {

    // Obtener la fila seleccionada
    Vector registro2 = (Vector) modeloMateriales.getDataVector().elementAt(selectedRowMateriales);

        // Verificar si el registro2 contiene los datos esperados
        if (registro2 != null && registro2.size() >= 4) {

            // Asignar valores al formulario de modificación
    // Mostrar la ventana de modificación
    modificar.setVisible(true);
    
        if (selectedRowServicios == 0) { // Cambiado a 0 si quieres activar la primera opción
    modificar.servicios.setSelected(true);
} else if (selectedRowMateriales == 0) {
    modificar.materiales.setSelected(true);
}
    if (modificar.getRootPane() != null) {
        Vector v = new Vector();

        if (modificar.materiales.isSelected()) {
            modeloMateriales.getDataVector().set(RegistroT1.getSelectedRow(), v); 
            modificar.materiales.setSelected(true);
            RegistroT1.updateUI();
        } 

        if (modificar.servicios.isSelected()) {
            modeloServicios.getDataVector().set(tablaservicios.getSelectedRow(), v);
            modificar.servicios.setSelected(true);
            tablaservicios.updateUI();
        }

           //calcular el valor total
            calcular();                

        // Exportar los datos a Excel si la función está implementada
        exportarAExcel();
    
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
      int filaSeleccionada = tablaservicios.getSelectedRow();
      int filaSeleccionada2 = RegistroT1.getSelectedRow();
    if (filaSeleccionada >= 0) {
         // Muestra un cuadro de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar esta tarea?", "Confirmación", JOptionPane.YES_NO_OPTION);
                // Si el usuario confirma con "Sí", procede a eliminar
                if (confirmacion == JOptionPane.YES_OPTION) {
                    DefaultTableModel modelo = (DefaultTableModel) tablaservicios.getModel();
                    modelo.removeRow(filaSeleccionada);

                    //calcular el valor total
                    calcular();

                    JOptionPane.showMessageDialog(this, "Tarea eliminada con éxito.");

                }

                } else  if (filaSeleccionada2 >= 0) {
                     // Muestra un cuadro de confirmación
                     int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar esta tarea?", "Confirmación", JOptionPane.YES_NO_OPTION);
                                // Si el usuario confirma con "Sí", procede a eliminar
                                if (confirmacion == JOptionPane.YES_OPTION) {
                                    DefaultTableModel modelo = (DefaultTableModel) RegistroT1.getModel();
                                    modelo.removeRow(filaSeleccionada2);

                                    //calcular el valor total
                                    calcular();

                                    JOptionPane.showMessageDialog(this, "Tarea eliminada con éxito.");

                                    }
                }else {
                    JOptionPane.showMessageDialog(this, "Seleccione una tarea para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                }    
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed


    }//GEN-LAST:event_AgregarActionPerformed
   
    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
         //lamo el JDialog
        agregar agregar1 = new agregar(this,true);
        agregar1.setVisible(true);
        if (agregar1.getRootPane()!=null) {
            
         Vector v = new Vector();
(agregar1.valort.getText());
        
        if (agregar1.materiales.isSelected()) {
            DefaultTableModel modeloMateriales = (DefaultTableModel) RegistroT1.getModel();
            modeloMateriales.addRow(v);  // Agregar a tabla de materiales
        } 
        
        if (agregar1.servicios.isSelected()) {
            DefaultTableModel modeloServicios = (DefaultTableModel) tablaservicios.getModel();
            modeloServicios.addRow(v);  // Agregar a tabla de servicios
        }

        // Exportar los datos a Excel (si tienes implementada esta función)
        exportarAExcel();
        }

    }//GEN-LAST:event_AgregarMouseClicked
    }
    }//GEN-LAST:event_EliminarTodoActionPerformed

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        x.setForeground(new Color(255,68,0));
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

    private void x1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_x1MouseClicked

    private void x1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseEntered
        x.setForeground(new Color(255,153,51));
    }//GEN-LAST:event_x1MouseEntered

    private void x1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseExited
        x.setForeground(Color.white);
    }//GEN-LAST:event_x1MouseExited

    private void barratitulo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barratitulo1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_barratitulo1MouseDragged

    private void barratitulo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barratitulo1MousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_barratitulo1MousePressed


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
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new pago().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton EliminarTodo;
    private javax.swing.JButton Extraer;
    private javax.swing.JButton Modificar;
    private javax.swing.JTable RegistroT1;
    private javax.swing.JButton Reportes;
    private javax.swing.JButton Tareas;
    private javax.swing.JPanel barratitulo;
    private javax.swing.JPanel barratitulo1;

    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pagos;
    private javax.swing.JTable tablaservicios;
    private javax.swing.JLabel tdatos;
    private javax.swing.JLabel tdatos1;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables

    
}
