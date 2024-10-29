
package empresajava1;

import java.awt.Color;
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
import javax.swing.JFileChooser;
import javax.swing.JTable;



public class pago extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
   int xmouse ,ymouse;
    
    public pago() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icons/logof.png")).getImage());
        setLocationRelativeTo(null);
        cargarDesdeExcel();
        int filast = tablaservicios.getRowCount();
        tdatos.setText("" + filast);
        servicios.setEnabled(true);  
        materiales.setEnabled(true);       
        Agregar.setBackground(new Color(139,0,0));
        Agregar.setForeground(Color.black); 
        /*
        Esta libreria ofrece una forma de detectar cambios en tiempo real, como si estuvieras constantemente
        revisando el campo de texto con if-else, pero de manera automática y continua.        
        */
        valor.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
            validar();}

            public void removeUpdate(DocumentEvent e) {
            validar();}

            public void changedUpdate(DocumentEvent e) {
             validar();}
                });
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
        barratitulo1 = new javax.swing.JPanel();
        x1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        EliminarTodo = new javax.swing.JButton();
        Tarea = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        valor = new javax.swing.JTextField();
        Tarea1 = new javax.swing.JLabel();
        Tarea2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaservicios = new javax.swing.JTable();
        tdatos = new javax.swing.JLabel();
        barratitulo = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        materiales = new javax.swing.JCheckBox();
        servicios = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        RegistroT1 = new javax.swing.JTable();

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
        jPanel3.add(Tareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 40));

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
        jPanel3.add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 110, 40));

        Extraer.setBackground(new java.awt.Color(70, 70, 70));
        Extraer.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Extraer.setForeground(new java.awt.Color(255, 255, 255));
        Extraer.setText("Extraer");
        Extraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraerActionPerformed(evt);
            }
        });
        jPanel3.add(Extraer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 40));

        pagos.setBackground(new java.awt.Color(70, 70, 70));
        pagos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        pagos.setForeground(new java.awt.Color(255, 255, 255));
        pagos.setText("Pagos");
        pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosActionPerformed(evt);
            }
        });
        jPanel3.add(pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, 40));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 500));

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
        jPanel4.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 80, 20));

        Modificar.setBackground(new java.awt.Color(70, 70, 70));
        Modificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel4.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 80, 20));

        Eliminar.setBackground(new java.awt.Color(70, 70, 70));
        Eliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel4.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 80, 20));

        EliminarTodo.setBackground(new java.awt.Color(70, 70, 70));
        EliminarTodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EliminarTodo.setForeground(new java.awt.Color(255, 255, 255));
        EliminarTodo.setText("Eliminar Todo");
        EliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTodoActionPerformed(evt);
            }
        });
        jPanel4.add(EliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 120, 20));

        Tarea.setBackground(new java.awt.Color(255, 255, 255));
        Tarea.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tarea.setForeground(new java.awt.Color(255, 255, 255));
        Tarea.setText("Pagos:");
        jPanel4.add(Tarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, -1));

        jPanel5.setBackground(new java.awt.Color(54, 57, 63));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valor.setBackground(new java.awt.Color(204, 204, 204));
        valor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorKeyPressed(evt);
            }
        });
        jPanel5.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 80, 30));

        Tarea1.setBackground(new java.awt.Color(255, 255, 255));
        Tarea1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tarea1.setForeground(new java.awt.Color(255, 255, 255));
        Tarea1.setText("Pagos:");
        jPanel5.add(Tarea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        Tarea2.setBackground(new java.awt.Color(255, 255, 255));
        Tarea2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tarea2.setForeground(new java.awt.Color(255, 255, 255));
        Tarea2.setText("Pagos:");
        jPanel5.add(Tarea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        jLabel1.setText("valor");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setText("cantidad");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        cantidad.setBackground(new java.awt.Color(204, 204, 204));
        cantidad.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidadKeyPressed(evt);
            }
        });
        jPanel5.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 80, 30));

        jLabel3.setText("nombre");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        nombre.setBackground(new java.awt.Color(204, 204, 204));
        nombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
        });
        jPanel5.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 530, 50));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaservicios.setBackground(new java.awt.Color(255, 255, 255));
        tablaservicios.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        tablaservicios.setForeground(new java.awt.Color(0, 0, 0));
        tablaservicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Servicio", "Valor", "Cantidad"
            }
        ));
        tablaservicios.setGridColor(new java.awt.Color(54, 57, 63));
        tablaservicios.setShowGrid(false);
        jScrollPane1.setViewportView(tablaservicios);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 270, 280));

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
        barratitulo.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 20, 30));

        jPanel4.add(barratitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 780, -1));

        materiales.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        materiales.setText("Material");
        materiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialesActionPerformed(evt);
            }
        });
        jPanel4.add(materiales, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        servicios.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        servicios.setText("Servicio");
        servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviciosActionPerformed(evt);
            }
        });
        jPanel4.add(servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        RegistroT1.setBackground(new java.awt.Color(255, 255, 255));
        RegistroT1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        RegistroT1.setForeground(new java.awt.Color(0, 0, 0));
        RegistroT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Material", "Valor", "Cantidad"
            }
        ));
        RegistroT1.setGridColor(new java.awt.Color(54, 57, 63));
        RegistroT1.setShowGrid(false);
        jScrollPane2.setViewportView(RegistroT1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 270, 280));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 570, 500));

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
    public void limpiar(){
        nombre.setText("");
        valor.setText("");
        cantidad.setText("");
    }
    public void mostrar(){
                 modelo.addColumn("Tareas");
                 tablaservicios.setModel(modelo);
    }
    
    
    public void validar(){
        if(valor.getText().trim().isEmpty()){
            Agregar.setBackground(new Color (139,0,0));
            Agregar.setForeground(Color.black);
        }
        else   {
            Tarea.setText("Tarea:");
        Agregar.setEnabled(true);
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
    for (int i = 0; i < tablaservicios.getRowCount(); i++) {
        Row row = sheet.createRow(i + 1);
        row.createCell(0).setCellValue((String) tablaservicios.getValueAt(i, 0));
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
        DefaultTableModel modelo = (DefaultTableModel) tablaservicios.getModel();

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

    
    private void TareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareasActionPerformed
        pago tareas = new pago();
        tareas.setVisible(true);
        dispose();
    }//GEN-LAST:event_TareasActionPerformed

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        reportes reporte = new reportes();
        reporte.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReportesActionPerformed

    private void ExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraerActionPerformed
 JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath() + ".xlsx";

            try (Workbook workbook = new XSSFWorkbook(); FileOutputStream fileOut = new FileOutputStream(filePath)) {
                // Crear hojas para las dos tablas
                Sheet hojaMateriales = workbook.createSheet("Materiales");
                Sheet hojaServicios = workbook.createSheet("Servicios");

                // Agregar los datos de las tablas
                agregarTablaAHoja(hojaMateriales, RegistroT1);
                agregarTablaAHoja(hojaServicios, tablaservicios);

                // Guardar el archivo
                workbook.write(fileOut);
                JOptionPane.showMessageDialog(this, "Datos exportados correctamente a: " + filePath);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al exportar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    
    }//GEN-LAST:event_ExtraerActionPerformed

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
    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed
        pago pagos = new pago();
        pagos.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_pagosActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
      int filaSeleccionada = tablaservicios.getSelectedRow();
    if (filaSeleccionada >= 0) {
        // Obtiene la tarea actual
        String tareaSeleccionada = (String) tablaservicios.getValueAt(filaSeleccionada, 0);

        // Obtiene el JFrame padre para abrir el diálogo
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        ModificarTarea ventana = new ModificarTarea(parentFrame, tareaSeleccionada);
        ventana.setVisible(true);

        // Obtiene la tarea modificada si el usuario guardó los cambios
        String tareaModificada = ventana.getTareaModificada();
        if (tareaModificada != null) {
            tablaservicios.setValueAt(tareaModificada, filaSeleccionada, 0);
            JOptionPane.showMessageDialog(this, "Tarea modificada con éxito.");
            exportarAExcel();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una tarea para modificar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int filaSeleccionada = tablaservicios.getSelectedRow();
    if (filaSeleccionada >= 0) {
         // Muestra un cuadro de confirmación
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar esta tarea?", "Confirmación", JOptionPane.YES_NO_OPTION);
    // Si el usuario confirma con "Sí", procede a eliminar
    if (confirmacion == JOptionPane.YES_OPTION) {
        DefaultTableModel modelo = (DefaultTableModel) tablaservicios.getModel();
        modelo.removeRow(filaSeleccionada);
        
        // Actualiza el contador de tareas
        int filast = tablaservicios.getRowCount();
        tdatos.setText("" + filast);
        
        JOptionPane.showMessageDialog(this, "Tarea eliminada con éxito.");
        exportarAExcel();
    }
        
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una tarea para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
    }    
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

    }//GEN-LAST:event_AgregarActionPerformed
    
    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
            // Verificar si los campos están vacíos
    if (valor.getText().trim().isEmpty() || 
        nombre.getText().trim().isEmpty() || 
        cantidad.getText().trim().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, 
                "Todos los campos (Nombre, Valor, Cantidad) deben estar llenos", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
    } else {
        // Crear el arreglo con los datos de los 3 JTextField
        Object[] datos = new Object[3];
        datos[0] = nombre.getText();
        datos[1] = valor.getText();
        datos[2] = cantidad.getText();
        
        // Verificar qué CheckBox está seleccionado y agregar a la tabla correspondiente
        if (materiales.isSelected()) {
            DefaultTableModel modeloMateriales = (DefaultTableModel) RegistroT1.getModel();
            modeloMateriales.addRow(datos);  // Agregar a tabla de materiales
        } 
        
        if (servicios.isSelected()) {
            DefaultTableModel modeloServicios = (DefaultTableModel) tablaservicios.getModel();
            modeloServicios.addRow(datos);  // Agregar a tabla de servicios
        }

        // Mostrar el número de filas en tdatos (opcional)
        int filasServicios = tablaservicios.getRowCount();
        tdatos.setText("" + filasServicios);  // Muestra las filas en tabla de servicios

        // Limpiar los campos de texto después de agregar
        limpiar();
        
        // Exportar los datos a Excel (si tienes implementada esta función)
        exportarAExcel();
    }

    }//GEN-LAST:event_AgregarMouseClicked

    private void ReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportesMousePressed
    reportes reportes = new reportes();
    reportes.setVisible(true);  
    dispose();
    }//GEN-LAST:event_ReportesMousePressed

    private void EliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTodoActionPerformed
    // Muestra un cuadro de confirmación
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar todas las tareas?", "Confirmación", JOptionPane.YES_NO_OPTION);
    
    // Si el usuario confirma con "Sí", procede a eliminar
    if (confirmacion == JOptionPane.YES_OPTION) {
        DefaultTableModel modelo = (DefaultTableModel) tablaservicios.getModel();
        
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

    private void valorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
 if (valor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo de tarea no puede estar vacío", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
        DefaultTableModel modelo = (DefaultTableModel) tablaservicios.getModel();
        Object [] Dato = new Object [1];
         Dato[0] = valor.getText();

         modelo.addRow(Dato);
         int filast = tablaservicios.getRowCount();
         tdatos.setText(""+filast);
         limpiar();// Limpiar el campo de texto después de agregar
         }
         
        // Exportar los datos después de agregar
        exportarAExcel();
        }
    }//GEN-LAST:event_valorKeyPressed

    private void materialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialesActionPerformed
        if (materiales.isSelected()) {
    materiales.setEnabled(true);servicios.setEnabled(false);
        }else{
            servicios.setEnabled(true);  materiales.setEnabled(true);       
        }


        }//GEN-LAST:event_materialesActionPerformed

    private void cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadKeyPressed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreKeyPressed

    private void serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviciosActionPerformed
        if (servicios.isSelected()) {
    materiales.setEnabled(false);servicios.setEnabled(true);
        }else{
            servicios.setEnabled(true);  materiales.setEnabled(true);       
        }
    
    
      }//GEN-LAST:event_serviciosActionPerformed

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
    private javax.swing.JLabel Tarea;
    private javax.swing.JLabel Tarea1;
    private javax.swing.JLabel Tarea2;
    private javax.swing.JButton Tareas;
    private javax.swing.JPanel barratitulo;
    private javax.swing.JPanel barratitulo1;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox materiales;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton pagos;
    private javax.swing.JCheckBox servicios;
    private javax.swing.JTable tablaservicios;
    private javax.swing.JLabel tdatos;
    private javax.swing.JTextField valor;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables

    
}
