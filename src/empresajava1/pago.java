
package empresajava1;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumnModel;

    

public class pago extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    
   int xmouse ,ymouse;
    
    public pago() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icons/logof.png")).getImage());
        setLocationRelativeTo(null);
        cargarDesdeExcel();
        
        ajustarAnchoColumnas(tablaempleado);
        // Listener para la tecla Delete en la JTable
        tablaempleado.addKeyListener(new KeyAdapter() {
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
        barratitulo1 = new javax.swing.JPanel();
        x1 = new javax.swing.JLabel();
        Tareas = new javax.swing.JButton();
        pagos = new javax.swing.JButton();
        Reportes = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        Extraer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        EliminarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleado = new javax.swing.JTable();
        barratitulo = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        tdatos = new javax.swing.JLabel();
        buscador = new javax.swing.JTextField();

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
        jPanel4.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 80, 20));

        Modificar.setBackground(new java.awt.Color(70, 70, 70));
        Modificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel4.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 80, 20));

        Eliminar.setBackground(new java.awt.Color(70, 70, 70));
        Eliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel4.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 80, 20));

        EliminarTodo.setBackground(new java.awt.Color(70, 70, 70));
        EliminarTodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EliminarTodo.setForeground(new java.awt.Color(255, 255, 255));
        EliminarTodo.setText("Eliminar Todo");
        EliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTodoActionPerformed(evt);
            }
        });
        jPanel4.add(EliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 120, 20));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaempleado.setBackground(new java.awt.Color(255, 255, 255));
        tablaempleado.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        tablaempleado.setForeground(new java.awt.Color(0, 0, 0));
        tablaempleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha Ingreso", "Nombre", "Cargo", "Contrato", "Inicio", "Finaliza", "Proyecto", "Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaempleado.setGridColor(new java.awt.Color(54, 57, 63));
        tablaempleado.setShowGrid(false);
        jScrollPane1.setViewportView(tablaempleado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 930, 480));

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
        barratitulo.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 20, 30));

        jPanel4.add(barratitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 1190, -1));

        tdatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Empleados"));
        jPanel4.add(tdatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, 140, 40));

        buscador.setBackground(new java.awt.Color(225, 153, 51));
        buscador.setForeground(new java.awt.Color(0, 0, 0));
        buscador.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscador"));
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });
        buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorKeyTyped(evt);
            }
        });
        jPanel4.add(buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 380, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 980, 650));

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
    // Método para ajustar el ancho de las columnas
    private void ajustarAnchoColumnas(JTable tabla) {
        TableColumnModel columnModel = tabla.getColumnModel();
        int maxWidth = 200; // Establece un ancho máximo
        for (int column = 0; column < columnModel.getColumnCount(); column++) {
            int width = 0; // Inicializa el ancho de la columna
            for (int row = 0; row < tabla.getRowCount(); row++) {
                // Obtiene el tamaño del valor de cada celda
                int cellWidth = tabla.getCellRenderer(row, column).getTableCellRendererComponent(tabla,  tabla.getValueAt(row, column), false, false, row,column).getPreferredSize().width;
                if (cellWidth > width) {
                    width = cellWidth; // Actualiza el ancho si es mayor
                }
            }
            width += tabla.getIntercellSpacing().width; // Añade espacio entre celdas
        columnModel.getColumn(column).setPreferredWidth(Math.min(width, maxWidth));
        }
        
    }
    //Metodo para sacar el total
    private void eliminarFilaSeleccionada() {
        int filaSeleccionada = tablaempleado.getSelectedRow();
    if (filaSeleccionada >= 0) {
         // Muestra un cuadro de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar esta tarea?", "Confirmación", JOptionPane.YES_NO_OPTION);
                // Si el usuario confirma con "Sí", procede a eliminar
                if (confirmacion == JOptionPane.YES_OPTION) {
                    DefaultTableModel modelofila = (DefaultTableModel) tablaempleado.getModel();
                    modelofila.removeRow(filaSeleccionada);


                    JOptionPane.showMessageDialog(this, "Tarea eliminada con éxito.");
                    ajustarAnchoColumnas(tablaempleado);
                    exportarAExcel();
                    }
                }else {
                    JOptionPane.showMessageDialog(this, "Seleccione una tarea para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
    }
    
    
    

    private void exportarAExcel() {
        Workbook workbook = new XSSFWorkbook();

    // Crear la hoja para Empleado
    Sheet sheetServicios = workbook.createSheet("Empleado");

    // Exportar los datos de ambas tablas
    agregarTablaAHoja(sheetServicios, tablaempleado);

    // Guardar el archivo en el sistema
    try (FileOutputStream fileOut = new FileOutputStream("Empleado.xlsx")) {
        workbook.write(fileOut);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
private void cargarDesdeExcel() {
    File archivo = new File("Empleado.xlsx");
    if (!archivo.exists()) return; // Verificar si el archivo existe

    try (FileInputStream fileIn = new FileInputStream(archivo)) {
        Workbook workbook = new XSSFWorkbook(fileIn);
          // Limpiar la tabla antes de cargar
        modelo.setRowCount(0);
        
        Sheet sheet = workbook.getSheet("Empleado");
        DefaultTableModel modeloempleado = (DefaultTableModel) tablaempleado.getModel();
        
        //Cargar los datos desde la hoja
                 if (sheet == null) return; // Verificar que la hoja exista

                    // Limpiar la tabla antes de cargar datos
                    modeloempleado.setRowCount(0);

                    // Leer filas del archivo Excel
                    for (Row row : sheet) {
                        if (row.getRowNum() == 0) continue; // Saltar encabezado

                        Object[] datosFila = new Object[modeloempleado.getColumnCount()];
                        for (int i = 0; i < modeloempleado.getColumnCount(); i++) {
                            Cell cell = row.getCell(i);
                            datosFila[i] = (cell == null) ? "" : cell.toString(); // Manejar celdas nulas
                        }
                        modeloempleado.addRow(datosFila);
                    }  

    } catch (IOException e) {
        e.printStackTrace();
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

    private void ExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraerActionPerformed
        try {
        // Establecer el Look and Feel a Windows
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Guardar Archivo");
    fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos de Excel", "xlsx")); // Filtro para archivos .xlsx
    int option = fileChooser.showSaveDialog(this);

    if (option == JFileChooser.APPROVE_OPTION) {
        String filePath = fileChooser.getSelectedFile().getAbsolutePath() + ".xlsx";

        try (Workbook workbook = new XSSFWorkbook(); FileOutputStream fileOut = new FileOutputStream(filePath)) {
            // Crear hojas para las dos tablas
            Sheet hojaMateriales = workbook.createSheet("Materiales");

            // Agregar los datos de las tablas
            agregarTablaAHoja(hojaMateriales, tablaempleado);

            // Guardar el archivo
            workbook.write(fileOut);
            JOptionPane.showMessageDialog(this, "Datos exportados correctamente a: " + filePath);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al exportar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }//GEN-LAST:event_ExtraerActionPerformed

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

    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed
       

    }//GEN-LAST:event_pagosActionPerformed

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

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        //lamo el JDialog
        agregar agregar1 = new agregar(this,true);
        agregar1.setVisible(true);
        if (agregar1.getRootPane()!=null) {

            Vector v = new Vector();
            //lo formatero para que me lo bote en este formarto dd-MM-yyyy
            String fechaI  = new SimpleDateFormat("yyyy-MM-dd").format(agregar1.fechaI.getDate());
            String fechaF = new SimpleDateFormat("yyyy-MM-dd").format(agregar1.fechaF.getDate());


            
            v.addElement(agregar1.actual.getText());
            v.addElement(agregar1.nombre.getText());
            v.addElement(agregar1.cargo.getText());
            v.addElement(agregar1.contrato.getText());     
            v.addElement(fechaI);
            v.addElement(fechaF);
            v.addElement(agregar1.proyecto.getText());
            v.addElement(agregar1.pago.getText());

                DefaultTableModel modeloServicios = (DefaultTableModel) tablaempleado.getModel();
                modeloServicios.addRow(v);  // Agregar a tabla de servicios
           }
            ajustarAnchoColumnas(tablaempleado);
            // Exportar los datos a Excel (si tienes implementada esta función)
            exportarAExcel();
        
    }//GEN-LAST:event_AgregarMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        DefaultTableModel modeloempleado = (DefaultTableModel) tablaempleado.getModel();

        int selectedRowEmpleado = tablaempleado.getSelectedRow();
        //devuelve ya que no seleccciona ninguna fila
        if (selectedRowEmpleado == -1) 
        return;

        agregar modificar = new agregar(this, true);

        Vector registro = (Vector) modeloempleado.getDataVector().elementAt(selectedRowEmpleado);
                        if (registro.size() >= 4) {
                            
            modificar.actual.setText(registro.elementAt(0).toString());
            modificar.nombre.setText(registro.elementAt(1).toString());
            modificar.cargo.setText(registro.elementAt(2).toString());
            modificar.contrato.setText(registro.elementAt(3).toString());
            String fechaString = registro.elementAt(4).toString();
                    try {
                    modificar.fechaI.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(fechaString));
                    } catch (ParseException ex) {
                        Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);

                    }
             //ya que toca pasarlo a tipo String toca por el siguiente metodo
            String fechaString2 = registro.elementAt(5).toString();
                    try {
                    modificar.fechaF.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(fechaString2));
                    } catch (ParseException ex) {
                        Logger.getLogger(agregar.class.getName()).log(Level.SEVERE, null, ex);

                    }                  modificar.proyecto.setText(registro.elementAt(6).toString());
            modificar.pago.setText(registro.elementAt(7).toString());
                 
        }

   
    
    // Mostrar la ventana de modificación
    modificar.setVisible(true);

    if (modificar.getRootPane() != null) {
        Vector v = new Vector();
          //lo formatero para que me lo bote en este formarto dd-MM-yyyy
            String fechaI  = new SimpleDateFormat("yyyy-MM-dd").format(modificar.fechaI.getDate());
            String fechaF = new SimpleDateFormat("yyyy-MM-dd").format(modificar.fechaF.getDate());

            v.addElement(modificar.actual.getText());
            v.addElement(modificar.nombre.getText());
            v.addElement(modificar.cargo.getText());
            v.addElement(modificar.contrato.getText());            
            v.addElement(fechaI);
            v.addElement(fechaF);
            v.addElement(modificar.proyecto.getText());
            v.addElement(modificar.pago.getText());

       
            modeloempleado.getDataVector().set(tablaempleado.getSelectedRow(), v);
            tablaempleado.updateUI();
       }
        ajustarAnchoColumnas(tablaempleado);

        // Exportar los datos a Excel si la función está implementada
        exportarAExcel();
    
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        eliminarFilaSeleccionada();
    }//GEN-LAST:event_EliminarActionPerformed

    private void EliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTodoActionPerformed
        // Muestra un cuadro de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Quieres borrar una tabla?", "Confirmación", JOptionPane.YES_NO_OPTION);

        // Si el usuario confirma con "Sí"
        if (confirmacion == JOptionPane.YES_OPTION) {
            //cual entre las dos tablas
            Object[] opciones = {"Materiales", "Servicios"};
            int seleccion=JOptionPane.showOptionDialog(this, "¿Cual Quieres Borrar?", "Confirmación", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);

            if (seleccion == JOptionPane.YES_OPTION) {
                DefaultTableModel modelomaterieales = (DefaultTableModel) tablaempleado.getModel();
                modelomaterieales.setRowCount(0);
                ajustarAnchoColumnas(tablaempleado);
                exportarAExcel();
                JOptionPane.showMessageDialog(this, "Todas las tareas han sido eliminadas con éxito.");

            } else if (seleccion == JOptionPane.NO_OPTION) {
                DefaultTableModel modeloservicios = (DefaultTableModel) tablaempleado.getModel();

                // Elimina todas las filas del modelo de la tabla
                modeloservicios.setRowCount(0);
                
                ajustarAnchoColumnas(tablaempleado);
                exportarAExcel();
                JOptionPane.showMessageDialog(this, "Todas las tareas han sido eliminadas con éxito.");

            }
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

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorActionPerformed

    private void buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyReleased

    }//GEN-LAST:event_buscadorKeyReleased

    private void buscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyTyped

    }//GEN-LAST:event_buscadorKeyTyped

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
    private javax.swing.JButton Reportes;
    private javax.swing.JButton Tareas;
    private javax.swing.JPanel barratitulo;
    private javax.swing.JPanel barratitulo1;
    private javax.swing.JTextField buscador;
    private javax.swing.JButton inventario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pagos;
    private javax.swing.JTable tablaempleado;
    private javax.swing.JLabel tdatos;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables

    
}
