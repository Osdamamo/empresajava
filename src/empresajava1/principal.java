
package empresajava1;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
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
import javax.swing.ImageIcon;



public class principal extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
   int xmouse ,ymouse;
    
    public principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icons/logof.png")).getImage());
        setLocationRelativeTo(null);
        cargarDesdeExcel();
        int filast = RegistroT.getRowCount();
        tdatos.setText("" + filast);
        Agregar.setBackground(new Color(139,0,0));
        Agregar.setForeground(Color.black); 
        /*
        Esta libreria ofrece una forma de detectar cambios en tiempo real, como si estuvieras constantemente
        revisando el campo de texto con if-else, pero de manera automática y continua.        
        */
        txttarea.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
            validar();}

            public void removeUpdate(DocumentEvent e) {
            validar();}

            public void changedUpdate(DocumentEvent e) {
             validar();}
                });
         // Listener para la tecla Delete en la JTable
        RegistroT.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                    eliminarFilaSeleccionada();
                }
                if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    eliminarFilaSeleccionada();
}   
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Extraer = new javax.swing.JButton();
        barratitulo1 = new javax.swing.JPanel();
        x1 = new javax.swing.JLabel();
        Tareas = new javax.swing.JButton();
        Reportes = new javax.swing.JButton();
        pagos = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        EliminarTodo = new javax.swing.JButton();
        Tarea = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txttarea = new javax.swing.JTextField();
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
        setTitle("constructora mar s.a.s.");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(54, 57, 63));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Extraer.setBackground(new java.awt.Color(70, 70, 70));
        Extraer.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Extraer.setForeground(new java.awt.Color(255, 255, 255));
        Extraer.setText("Extraer");
        Extraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraerActionPerformed(evt);
            }
        });
        jPanel3.add(Extraer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 110, 40));

        barratitulo1.setBackground(new java.awt.Color(54, 57, 63));
        barratitulo1.setForeground(new java.awt.Color(0, 0, 0));
        barratitulo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barratitulo1MouseDragged(evt);
            }
        });
        barratitulo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barratitulo1MousePressed(evt);
            }
        });
        barratitulo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        x1.setBackground(new java.awt.Color(255, 255, 255));
        x1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        x1.setForeground(new java.awt.Color(255, 255, 255));
        x1.setText("x");
        x1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                x1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                x1MouseExited(evt);
            }
        });
        barratitulo1.add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 20, 30));

        jPanel3.add(barratitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 30));

        Tareas.setBackground(new java.awt.Color(70, 70, 70));
        Tareas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tareas.setForeground(new java.awt.Color(255, 255, 255));
        Tareas.setText("Tareas");
        Tareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareasActionPerformed(evt);
            }
        });
        jPanel3.add(Tareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 110, 40));

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
        jPanel3.add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 110, 40));

        pagos.setBackground(new java.awt.Color(70, 70, 70));
        pagos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        pagos.setForeground(new java.awt.Color(255, 255, 255));
        pagos.setText("Pagos");
        pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosActionPerformed(evt);
            }
        });
        jPanel3.add(pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 110, 40));

        inventario.setBackground(new java.awt.Color(70, 70, 70));
        inventario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        inventario.setForeground(new java.awt.Color(255, 255, 255));
        inventario.setText("Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });
        jPanel3.add(inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 650));

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
        jPanel4.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 20));

        Modificar.setBackground(new java.awt.Color(70, 70, 70));
        Modificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel4.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, 20));

        Eliminar.setBackground(new java.awt.Color(70, 70, 70));
        Eliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel4.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 80, 20));

        EliminarTodo.setBackground(new java.awt.Color(70, 70, 70));
        EliminarTodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EliminarTodo.setForeground(new java.awt.Color(255, 255, 255));
        EliminarTodo.setText("Eliminar Todo");
        EliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTodoActionPerformed(evt);
            }
        });
        jPanel4.add(EliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 120, 20));

        Tarea.setBackground(new java.awt.Color(255, 255, 255));
        Tarea.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tarea.setForeground(new java.awt.Color(255, 255, 255));
        Tarea.setText("Tarea:");
        jPanel4.add(Tarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, -1));

        jPanel5.setBackground(new java.awt.Color(54, 57, 63));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttarea.setBackground(new java.awt.Color(204, 204, 204));
        txttarea.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txttarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttareaKeyPressed(evt);
            }
        });
        jPanel5.add(txttarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 6, 750, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 880, 50));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Todas Las Tareas"));

        RegistroT.setBackground(new java.awt.Color(255, 255, 255));
        RegistroT.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        RegistroT.setForeground(new java.awt.Color(0, 0, 0));
        RegistroT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarea"
            }
        ));
        RegistroT.setGridColor(new java.awt.Color(54, 57, 63));
        RegistroT.setShowGrid(false);
        jScrollPane1.setViewportView(RegistroT);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 960, 430));

        tdatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Total de Registro"));
        jPanel4.add(tdatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 140, 40));

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
        barratitulo.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 20, 30));

        jPanel4.add(barratitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 1180, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 970, 650));

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
       //para elimnar filas
    private void eliminarFilaSeleccionada() {
        int filaSeleccionada = RegistroT.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar esta tarea?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                DefaultTableModel modelo = (DefaultTableModel) RegistroT.getModel();
                modelo.removeRow(filaSeleccionada);

                JOptionPane.showMessageDialog(this, "Tarea eliminada con éxito.");
                exportarAExcel();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una tarea para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void limpiar(){
        txttarea.setText("");
    }
    public void mostrar(){
                 modelo.addColumn("Tareas");
                 RegistroT.setModel(modelo);
    }
    
    
    public void validar(){
        if(txttarea.getText().trim().isEmpty()){
            Agregar.setBackground(new Color (139,0,0));
            Agregar.setForeground(Color.black);
        }
        else   {
        Agregar.setBackground(new Color(70,70,70));
        Agregar.setForeground(new Color(255,255,255));


        }
    }
    private void exportarAExcel() {
    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("Tareas");

    // Agregar encabezados
    Row headerRow = sheet.createRow(0);
    headerRow.createCell(0).setCellValue("Tarea");

    // Agregar datos de la tabla
    for (int i = 0; i < RegistroT.getRowCount(); i++) {
        Row row = sheet.createRow(i + 1);
        row.createCell(0).setCellValue((String) RegistroT.getValueAt(i, 0));
    }

    // Escribir el archivo
    try (FileOutputStream fileOut = new FileOutputStream("tareas.xlsx")) {
        workbook.write(fileOut);
        workbook.write(fileOut);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
private void cargarDesdeExcel() {
    File archivo = new File("tareas.xlsx");
    if (!archivo.exists()) return; // Verificar si el archivo existe

    try (FileInputStream fileIn = new FileInputStream(archivo)) {
        Workbook workbook = new XSSFWorkbook(fileIn);
        Sheet sheet = workbook.getSheetAt(0);
        DefaultTableModel modelo = (DefaultTableModel) RegistroT.getModel();

        // Limpiar la tabla antes de cargar
        modelo.setRowCount(0);

        // Leer filas del archivo Excel
        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue; // Saltar encabezado

            String tarea = row.getCell(0).getStringCellValue();
            modelo.addRow(new Object[]{tarea});
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    
    private void ExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraerActionPerformed
XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("Tareas");

    // Agregar los encabezados a la primera fila
    Row headerRow = sheet.createRow(0);
    for (int i = 0; i < RegistroT.getColumnCount(); i++) {
        Cell cell = headerRow.createCell(i);
        cell.setCellValue(RegistroT.getColumnName(i));
    }

    // Llenar el archivo con los datos de la tabla
    for (int i = 0; i < RegistroT.getRowCount(); i++) {
        Row row = sheet.createRow(i + 1);
        for (int j = 0; j < RegistroT.getColumnCount(); j++) {
            Cell cell = row.createCell(j);
            cell.setCellValue(RegistroT.getValueAt(i, j).toString());
        }
    }

    try (FileOutputStream fileOut = new FileOutputStream("Tareas.xlsx")) {
        workbook.write(fileOut);
        JOptionPane.showMessageDialog(this, "Datos exportados exitosamente a Tareas.xlsx");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al exportar los datos: " + e.getMessage());
    } finally {
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    }//GEN-LAST:event_ExtraerActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
      int filaSeleccionada = RegistroT.getSelectedRow();
       if (filaSeleccionada >= 0) {
        // Obtiene la tarea actual
        String tareaSeleccionada = (String) RegistroT.getValueAt(filaSeleccionada, 0);

        // Obtiene el JFrame padre para abrir el diálogo
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        ModificarTarea ventana = new ModificarTarea(parentFrame, tareaSeleccionada);
        ventana.setVisible(true);

        // Obtiene la tarea modificada si el usuario guardó los cambios
        String tareaModificada = ventana.getTareaModificada();
        if (tareaModificada != null) {
            RegistroT.setValueAt(tareaModificada, filaSeleccionada, 0);
            JOptionPane.showMessageDialog(this, "Tarea modificada con éxito.");
            exportarAExcel();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una tarea para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
                         eliminarFilaSeleccionada();

    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

    }//GEN-LAST:event_AgregarActionPerformed
    
    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
         if (txttarea.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo de tarea no puede estar vacío", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
        DefaultTableModel modelo = (DefaultTableModel) RegistroT.getModel();
        Object [] Dato = new Object [1];
         Dato[0] = txttarea.getText();

         modelo.addRow(Dato);
         int filast = RegistroT.getRowCount();
         tdatos.setText(""+filast);
         limpiar();// Limpiar el campo de texto después de agregar
         }
         
        // Exportar los datos después de agregar
        exportarAExcel();

    }//GEN-LAST:event_AgregarMouseClicked

    private void EliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTodoActionPerformed
    // Muestra un cuadro de confirmación
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar todas las tareas?", "Confirmación", JOptionPane.YES_NO_OPTION);
    
    // Si el usuario confirma con "Sí", procede a eliminar
    if (confirmacion == JOptionPane.YES_OPTION) {
        DefaultTableModel modelo = (DefaultTableModel) RegistroT.getModel();
        
        // Elimina todas las filas del modelo de la tabla
        modelo.setRowCount(0);
        
        // Actualiza el contador de tareas a 0
        tdatos.setText("0");
        
        JOptionPane.showMessageDialog(this, "Todas las tareas han sido eliminadas con éxito.");
        exportarAExcel();
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

    private void txttareaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttareaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
 if (txttarea.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo de tarea no puede estar vacío", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
        DefaultTableModel modelo = (DefaultTableModel) RegistroT.getModel();
        Object [] Dato = new Object [1];
         Dato[0] = txttarea.getText();

         modelo.addRow(Dato);
         int filast = RegistroT.getRowCount();
         tdatos.setText(""+filast);
         limpiar();// Limpiar el campo de texto después de agregar
         }
         
        // Exportar los datos después de agregar
        exportarAExcel();
        }
    }//GEN-LAST:event_txttareaKeyPressed

    private void TareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareasActionPerformed
        JFrame actual = this;  // Referencia a la ventana actual.
    principal nuevaVentana = new principal();  // Crear la nueva ventana.
    nuevaVentana.setSize(actual.getSize());
    nuevaVentana.setLocationRelativeTo(actual);  // Centrar la nueva ventana.

    nuevaVentana.setOpacity(0);  // Inicia invisible.
    nuevaVentana.setVisible(true);  // Mostrar la nueva ventana.

    new Thread(() -> {
        try {
            // Asegurar que la ventana es totalmente opaca después del efecto.
            for (float i = 0; i <= 1.0f; i += 0.1f) {
                Thread.sleep(30);  // Control de velocidad.
                nuevaVentana.setOpacity(i);
            }

            // Pausa breve para asegurar la opacidad completa.
            Thread.sleep(50);
            nuevaVentana.setOpacity(1.0f);  // Asegurar visibilidad total.

            // Cierra la ventana actual al finalizar el efecto.
            actual.dispose();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
    }//GEN-LAST:event_TareasActionPerformed

    private void ReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportesMousePressed
      
    }//GEN-LAST:event_ReportesMousePressed

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
     JFrame actual = this;  // Referencia a la ventana actual.
    reportes nuevaVentana = new reportes();  // Crear la nueva ventana.
    nuevaVentana.setSize(actual.getSize());
    nuevaVentana.setLocationRelativeTo(actual);  // Centrar la nueva ventana.

    nuevaVentana.setOpacity(0);  // Inicia invisible.
    nuevaVentana.setVisible(true);  // Mostrar la nueva ventana.

    new Thread(() -> {
        try {
            // Asegurar que la ventana es totalmente opaca después del efecto.
            for (float i = 0; i <= 1.0f; i += 0.1f) {
                Thread.sleep(30);  // Control de velocidad.
                nuevaVentana.setOpacity(i);
            }

            // Pausa breve para asegurar la opacidad completa.
            Thread.sleep(50);
            nuevaVentana.setOpacity(1.0f);  // Asegurar visibilidad total.

            // Cierra la ventana actual al finalizar el efecto.
            actual.dispose();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
    }//GEN-LAST:event_ReportesActionPerformed

    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed
           JFrame actual = this;  // Referencia a la ventana actual.
    pago nuevaVentana = new pago();  // Crear la nueva ventana.
    nuevaVentana.setSize(actual.getSize());
    nuevaVentana.setLocationRelativeTo(actual);  // Centrar la nueva ventana.

    nuevaVentana.setOpacity(0);  // Inicia invisible.
    nuevaVentana.setVisible(true);  // Mostrar la nueva ventana.

    new Thread(() -> {
        try {
            // Asegurar que la ventana es totalmente opaca después del efecto.
            for (float i = 0; i <= 1.0f; i += 0.1f) {
                Thread.sleep(30);  // Control de velocidad.
                nuevaVentana.setOpacity(i);
            }

            // Pausa breve para asegurar la opacidad completa.
            Thread.sleep(50);
            nuevaVentana.setOpacity(1.0f);  // Asegurar visibilidad total.

            // Cierra la ventana actual al finalizar el efecto.
            actual.dispose();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
    }//GEN-LAST:event_pagosActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        JFrame actual = this;  // Referencia a la ventana actual.
    Inventario nuevaVentana = new Inventario();  // Crear la nueva ventana.
    nuevaVentana.setSize(actual.getSize());
    nuevaVentana.setLocationRelativeTo(actual);  // Centrar la nueva ventana.

    nuevaVentana.setOpacity(0);  // Inicia invisible.
    nuevaVentana.setVisible(true);  // Mostrar la nueva ventana.

    new Thread(() -> {
        try {
            // Asegurar que la ventana es totalmente opaca después del efecto.
            for (float i = 0; i <= 1.0f; i += 0.1f) {
                Thread.sleep(30);  // Control de velocidad.
                nuevaVentana.setOpacity(i);
            }

            // Pausa breve para asegurar la opacidad completa.
            Thread.sleep(50);
            nuevaVentana.setOpacity(1.0f);  // Asegurar visibilidad total.

            // Cierra la ventana actual al finalizar el efecto.
            actual.dispose();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }).start();
    }//GEN-LAST:event_inventarioActionPerformed

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
    private javax.swing.JButton EliminarTodo;
    private javax.swing.JButton Extraer;
    private javax.swing.JButton Modificar;
    private javax.swing.JTable RegistroT;
    private javax.swing.JButton Reportes;
    private javax.swing.JLabel Tarea;
    private javax.swing.JButton Tareas;
    private javax.swing.JPanel barratitulo;
    private javax.swing.JPanel barratitulo1;
    private javax.swing.JButton inventario;
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
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}
