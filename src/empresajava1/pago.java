
package empresajava1;

import empresajava1.agregar;
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
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

    

public class pago extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    TableRowSorter<DefaultTableModel> buscadorfinal;
   int xmouse ,ymouse;
    
    public pago() {
        initComponents();
        configurarFiltros();
        setIconImage(new ImageIcon(getClass().getResource("/icons/logof.png")).getImage());
        setLocationRelativeTo(null);
        cargarDesdeExcel();
               calcular();
    
            modelo = (DefaultTableModel) tablaempleado.getModel();
            buscadorfinal = new TableRowSorter<>(modelo);
            tablaempleado.setRowSorter(buscadorfinal);
        
            buscadorColumna6.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                aplicarFiltro();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                aplicarFiltro();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                aplicarFiltro();
            }
        });

        ajustarAnchoColumnas(tablaempleado);
        // Listener para la tecla Delete en la JTable
        tablaempleado.addKeyListener(new KeyAdapter() {
            @Override
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleado = new javax.swing.JTable();
        barratitulo = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        tdatos = new javax.swing.JLabel();
        buscadorColumna8 = new javax.swing.JTextField();
        buscadorColumna7 = new javax.swing.JTextField();
        buscadorColumna6 = new javax.swing.JTextField();
        buscadorColumna2 = new javax.swing.JTextField();
        buscadorColumna3 = new javax.swing.JTextField();
        buscadorColumna1 = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        EliminarTodo = new javax.swing.JButton();
        buscadorColumna4 = new javax.swing.JTextField();
        buscadorColumna5 = new javax.swing.JTextField();

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
        pagos.setText("Empleados");
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

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1160, 490));

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
        barratitulo.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 0, 20, 30));

        jPanel4.add(barratitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 1420, -1));

        tdatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Total de Pago"));
        jPanel4.add(tdatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 600, 140, 40));

        buscadorColumna8.setBackground(new java.awt.Color(225, 153, 51));
        buscadorColumna8.setForeground(new java.awt.Color(0, 0, 0));
        buscadorColumna8.setBorder(javax.swing.BorderFactory.createTitledBorder("Pago"));
        buscadorColumna8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorColumna8ActionPerformed(evt);
            }
        });
        buscadorColumna8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorColumna8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorColumna8KeyTyped(evt);
            }
        });
        jPanel4.add(buscadorColumna8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 100, 60));

        buscadorColumna7.setBackground(new java.awt.Color(225, 153, 51));
        buscadorColumna7.setForeground(new java.awt.Color(0, 0, 0));
        buscadorColumna7.setBorder(javax.swing.BorderFactory.createTitledBorder("Proyecto"));
        buscadorColumna7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorColumna7ActionPerformed(evt);
            }
        });
        buscadorColumna7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorColumna7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorColumna7KeyTyped(evt);
            }
        });
        jPanel4.add(buscadorColumna7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 110, 60));

        buscadorColumna6.setBackground(new java.awt.Color(225, 153, 51));
        buscadorColumna6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        buscadorColumna6.setForeground(new java.awt.Color(0, 0, 0));
        buscadorColumna6.setBorder(javax.swing.BorderFactory.createTitledBorder("Finaliza"));
        buscadorColumna6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorColumna6ActionPerformed(evt);
            }
        });
        buscadorColumna6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorColumna6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorColumna6KeyTyped(evt);
            }
        });
        jPanel4.add(buscadorColumna6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 110, 60));

        buscadorColumna2.setBackground(new java.awt.Color(225, 153, 51));
        buscadorColumna2.setForeground(new java.awt.Color(0, 0, 0));
        buscadorColumna2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        buscadorColumna2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorColumna2ActionPerformed(evt);
            }
        });
        buscadorColumna2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorColumna2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorColumna2KeyTyped(evt);
            }
        });
        jPanel4.add(buscadorColumna2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 110, 60));

        buscadorColumna3.setBackground(new java.awt.Color(225, 153, 51));
        buscadorColumna3.setForeground(new java.awt.Color(0, 0, 0));
        buscadorColumna3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargo"));
        buscadorColumna3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorColumna3ActionPerformed(evt);
            }
        });
        buscadorColumna3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorColumna3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorColumna3KeyTyped(evt);
            }
        });
        jPanel4.add(buscadorColumna3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 100, 60));

        buscadorColumna1.setBackground(new java.awt.Color(225, 153, 51));
        buscadorColumna1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        buscadorColumna1.setForeground(new java.awt.Color(0, 0, 0));
        buscadorColumna1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        buscadorColumna1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorColumna1ActionPerformed(evt);
            }
        });
        buscadorColumna1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorColumna1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorColumna1KeyTyped(evt);
            }
        });
        jPanel4.add(buscadorColumna1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 60));

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
        jPanel4.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 80, 20));

        Eliminar.setBackground(new java.awt.Color(70, 70, 70));
        Eliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        Eliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EliminarKeyPressed(evt);
            }
        });
        jPanel4.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 80, 20));

        Modificar.setBackground(new java.awt.Color(70, 70, 70));
        Modificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel4.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 120, 20));

        EliminarTodo.setBackground(new java.awt.Color(70, 70, 70));
        EliminarTodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        EliminarTodo.setForeground(new java.awt.Color(255, 255, 255));
        EliminarTodo.setText("Eliminar Todo");
        EliminarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTodoActionPerformed(evt);
            }
        });
        jPanel4.add(EliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 70, 120, 20));

        buscadorColumna4.setBackground(new java.awt.Color(225, 153, 51));
        buscadorColumna4.setForeground(new java.awt.Color(0, 0, 0));
        buscadorColumna4.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrato"));
        buscadorColumna4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorColumna4ActionPerformed(evt);
            }
        });
        buscadorColumna4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorColumna4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorColumna4KeyTyped(evt);
            }
        });
        jPanel4.add(buscadorColumna4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 110, 60));

        buscadorColumna5.setBackground(new java.awt.Color(225, 153, 51));
        buscadorColumna5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        buscadorColumna5.setForeground(new java.awt.Color(0, 0, 0));
        buscadorColumna5.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio"));
        buscadorColumna5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorColumna5ActionPerformed(evt);
            }
        });
        buscadorColumna5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorColumna5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscadorColumna5KeyTyped(evt);
            }
        });
        jPanel4.add(buscadorColumna5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 100, 60));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1210, 650));

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
     //filtrado
private void configurarFiltros() {
    // Definir el arreglo de JTextFields correctamente
    JTextField[] camposBuscadores = { 
        buscadorColumna1, buscadorColumna2, buscadorColumna3, 
        buscadorColumna4, buscadorColumna5,buscadorColumna6,  };

    for (JTextField campo : camposBuscadores) {
        campo.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                aplicarFiltro();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                aplicarFiltro();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                aplicarFiltro();
            }
        });
    }
}
  private void aplicarFiltro() {
    RowFilter<DefaultTableModel, Object> rowFilter = null;
    ArrayList<RowFilter<Object, Object>> filtros = new ArrayList<>();

    // Añadir filtros para cada JTextField
    if (!buscadorColumna1.getText().trim().isEmpty()) {
        filtros.add(RowFilter.regexFilter("(?i)" + buscadorColumna1.getText(), 0));
    }
    if (!buscadorColumna2.getText().trim().isEmpty()) {
        filtros.add(RowFilter.regexFilter("(?i)" + buscadorColumna2.getText(), 1));
    }
    if (!buscadorColumna3.getText().trim().isEmpty()) {
        filtros.add(RowFilter.regexFilter("(?i)" + buscadorColumna3.getText(), 2));
    }
    if (!buscadorColumna4.getText().trim().isEmpty()) {
        filtros.add(RowFilter.regexFilter("(?i)" + buscadorColumna4.getText(), 3));
    }
    if (!buscadorColumna5.getText().trim().isEmpty()) {
        filtros.add(RowFilter.regexFilter("(?i)" + buscadorColumna5.getText(), 4));
    }
    if (!buscadorColumna6.getText().trim().isEmpty()) {
        filtros.add(RowFilter.regexFilter("(?i)" + buscadorColumna6.getText(), 5));
    }
     if (!buscadorColumna7.getText().trim().isEmpty()) {
        filtros.add(RowFilter.regexFilter("(?i)" + buscadorColumna7.getText(), 6));
    }
      if (!buscadorColumna8.getText().trim().isEmpty()) {
        filtros.add(RowFilter.regexFilter("(?i)" + buscadorColumna8.getText(), 7));
    }

    rowFilter = RowFilter.andFilter(filtros);
    buscadorfinal.setRowFilter(rowFilter);
  
        
            calcular();
   }
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
   //para elimnar filas
    private void eliminarFilaSeleccionada() {
        int selectedRow = tablaempleado.getSelectedRow(); // Índice en la vista

    if (selectedRow != -1) {
        // Convertir el índice de la vista al índice del modelo
        int modelRow = tablaempleado.convertRowIndexToModel(selectedRow);

        // Confirmar eliminación
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar esta fila?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Desactivar temporalmente el sorter para evitar el error
            TableRowSorter<?> sorter = (TableRowSorter<?>) tablaempleado.getRowSorter();
            tablaempleado.setRowSorter(null);

            // Eliminar la fila en el modelo
            modelo.removeRow(modelRow);

            // Reactivar el sorter después de la eliminación
            tablaempleado.setRowSorter(sorter);

            // Reaplicar el filtro después de eliminar la fila
            aplicarFiltro();
                        calcular();
        }
    } else {
        JOptionPane.showMessageDialog(this, "No hay ninguna fila seleccionada para eliminar.");
    }
    }    
    
        //Metodo para sacar el total
    private void calcular(){
        
        float suma=0;
        for (int i = 0; i < tablaempleado.getRowCount(); i++) {
            float renglon =Float.parseFloat(tablaempleado.getValueAt(i, 7).toString());
            suma=suma+renglon;
            tdatos.setText(String.valueOf(suma));
        }
       
            // Formatear el total sin decimales
    DecimalFormat df = new DecimalFormat("#"); // Solo enteros
    tdatos.setText(df.format(suma)); // Actualiza el texto sin decimales

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

    private void buscadorColumna8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorColumna8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna8ActionPerformed

    private void buscadorColumna8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna8KeyReleased

    }//GEN-LAST:event_buscadorColumna8KeyReleased

    private void buscadorColumna8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna8KeyTyped

    }//GEN-LAST:event_buscadorColumna8KeyTyped

    private void buscadorColumna7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorColumna7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna7ActionPerformed

    private void buscadorColumna7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna7KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna7KeyReleased

    private void buscadorColumna7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna7KeyTyped

    private void buscadorColumna6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorColumna6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna6ActionPerformed

    private void buscadorColumna6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna6KeyReleased

    private void buscadorColumna6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna6KeyTyped

    private void buscadorColumna2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorColumna2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna2ActionPerformed

    private void buscadorColumna2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna2KeyReleased

    private void buscadorColumna2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna2KeyTyped

    private void buscadorColumna3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorColumna3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna3ActionPerformed

    private void buscadorColumna3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna3KeyReleased

    private void buscadorColumna3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna3KeyTyped

    private void buscadorColumna1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorColumna1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna1ActionPerformed

    private void buscadorColumna1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna1KeyReleased

    private void buscadorColumna1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna1KeyTyped

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
        // Desactiva temporalmente el TableRowSorter
        tablaempleado.setRowSorter(null);
        //lamo el JDialog
        agregar agregar1 = new agregar(this,true);
        agregar1.setVisible(true);
        if (agregar1.getRootPane()!=null) {

            Vector v = new Vector();
            String fechaI = new SimpleDateFormat("yyyy-MM-dd").format(agregar1.fechaI.getDate());
            String fechaF = new SimpleDateFormat("yyyy-MM-dd").format(agregar1.fechaF.getDate());
            v.addElement(agregar1.actual.getText());
            v.addElement(agregar1.nombre.getText());
            v.addElement(agregar1.cargo.getText());
            v.addElement(agregar1.contrato.getText());
            v.addElement(fechaI);
            v.addElement(fechaF);
            v.addElement(agregar1.proyecto.getText());
            v.addElement(agregar1.pago.getText());

            DefaultTableModel modeloMateriales = (DefaultTableModel) tablaempleado.getModel();
            modeloMateriales.addRow(v);  // Agregar a tabla de materiales
            ajustarAnchoColumnas(tablaempleado);
            calcular();
            tablaempleado.setRowSorter(buscadorfinal);

            // Exportar los datos a Excel (si tienes implementada esta función
                exportarAExcel();
                // Reactiva el TableRowSorter después de la modificación
            }
    }//GEN-LAST:event_AgregarMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

    }//GEN-LAST:event_AgregarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        eliminarFilaSeleccionada();
    }//GEN-LAST:event_EliminarActionPerformed

    private void EliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EliminarKeyPressed

    }//GEN-LAST:event_EliminarKeyPressed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
                                         
        DefaultTableModel modeloempleado = (DefaultTableModel) tablaempleado.getModel();

        int selectedRowEmpleado = tablaempleado.getSelectedRow();
        //devuelve ya que no seleccciona ninguna fila
        if (selectedRowEmpleado == -1) 
        return;

        agregar modificar = new agregar(this, true);


            // Verificar si el registro2 contiene los datos esperados
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

    private void EliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTodoActionPerformed
        // Muestra un cuadro de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar todas las tareas?", "Confirmación", JOptionPane.YES_NO_OPTION);

        // Si el usuario confirma con "Sí", procede a eliminar
        if (confirmacion == JOptionPane.YES_OPTION) {
            DefaultTableModel modelomaterieales = (DefaultTableModel) tablaempleado.getModel();

            // Elimina todas las filas del modelo de la tabla
            modelomaterieales.setRowCount(0);

            // Actualiza el contador de tareas a 0
            tdatos.setText("0");
            ajustarAnchoColumnas(tablaempleado);

            JOptionPane.showMessageDialog(this, "Todas las tareas han sido eliminadas con éxito.");
            exportarAExcel();
        }
    }//GEN-LAST:event_EliminarTodoActionPerformed

    private void buscadorColumna4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorColumna4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna4ActionPerformed

    private void buscadorColumna4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna4KeyReleased

    private void buscadorColumna4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna4KeyTyped

    private void buscadorColumna5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorColumna5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna5ActionPerformed

    private void buscadorColumna5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna5KeyReleased

    private void buscadorColumna5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorColumna5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorColumna5KeyTyped

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
    private javax.swing.JTextField buscadorColumna1;
    private javax.swing.JTextField buscadorColumna2;
    private javax.swing.JTextField buscadorColumna3;
    private javax.swing.JTextField buscadorColumna4;
    private javax.swing.JTextField buscadorColumna5;
    private javax.swing.JTextField buscadorColumna6;
    private javax.swing.JTextField buscadorColumna7;
    private javax.swing.JTextField buscadorColumna8;
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
