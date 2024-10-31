
package empresajava1;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class agregarinventario extends javax.swing.JDialog {

    private int xmouse;
    private int ymouse;

    public agregarinventario(java.awt.Frame parent, boolean b) {
       
        super(parent, b);
        initComponents();
        aceptar.setBackground(new Color(139, 0, 0));
        aceptar.setForeground(Color.black);
        //para moverlo al siguiente
         fecha.addPropertyChangeListener("date",evt->{
             if(fecha.getDate()!=null){
                     cantidad.requestFocus(); 
             }
         });
 
        setIconImage(new ImageIcon(getClass().getResource("/icons/logof.png")).getImage());

        
         /*
        Esta libreria ofrece una forma de detectar cambios en tiempo real, como si estuvieras constantemente
        revisando el campo de texto con if-else, pero de manera automática y continua.        
        */
          // Listener para campos de texto
        DocumentListener listener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) { validar(); }
            @Override
            public void removeUpdate(DocumentEvent e) { validar(); }
            @Override
            public void changedUpdate(DocumentEvent e) { validar(); }
        };
        valor.getDocument().addDocumentListener(listener);
         nombre.getDocument().addDocumentListener(listener); 
        cantidad.getDocument().addDocumentListener(listener);
        actual.getDocument().addDocumentListener(listener); 
        
          // Inicializa el campo "actual" con la fecha actual
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  'Hora:'  HH:mm");
                actual.setText(dateFormat.format(new java.util.Date()));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tdatos = new javax.swing.JLabel();
        barratitulo = new javax.swing.JPanel();
        Jpago = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jlfecha = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        JLnombre = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        JLvalor = new javax.swing.JLabel();
        valort = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        JLvalortotal1 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        actual = new javax.swing.JTextField();
        cfecha = new javax.swing.JCheckBox();

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

        Jpago.setBackground(new java.awt.Color(255, 255, 255));
        Jpago.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Jpago.setForeground(new java.awt.Color(255, 255, 255));
        Jpago.setText("Cantidad:");
        jPanel4.add(Jpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 20));

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
        jPanel4.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 300, 30));

        jlfecha.setBackground(new java.awt.Color(255, 255, 255));
        jlfecha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlfecha.setForeground(new java.awt.Color(255, 255, 255));
        jlfecha.setText("Fecha Compra:");
        jPanel4.add(jlfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 20));

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
        jPanel4.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 200, 30));

        JLnombre.setBackground(new java.awt.Color(255, 255, 255));
        JLnombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLnombre.setForeground(new java.awt.Color(255, 255, 255));
        JLnombre.setText("Nombre:");
        jPanel4.add(JLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 20));

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
        jPanel4.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 80, 30));

        JLvalor.setBackground(new java.awt.Color(255, 255, 255));
        JLvalor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLvalor.setForeground(new java.awt.Color(255, 255, 255));
        JLvalor.setText("Valor:");
        jPanel4.add(JLvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 20));

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
        jPanel4.add(valort, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 200, 30));

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
        aceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aceptarKeyPressed(evt);
            }
        });
        jPanel4.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 90, 30));

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
        jPanel4.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 90, 30));

        JLvalortotal1.setBackground(new java.awt.Color(255, 255, 255));
        JLvalortotal1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLvalortotal1.setForeground(new java.awt.Color(255, 255, 255));
        JLvalortotal1.setText("Valor Total:");
        jPanel4.add(JLvalortotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 20));

        fecha.setBackground(new java.awt.Color(225, 153, 51));
        fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaMouseClicked(evt);
            }
        });
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
        });
        jPanel4.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, -1));

        actual.setBackground(new java.awt.Color(225, 153, 51));
        actual.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        actual.setForeground(new java.awt.Color(225, 153, 51));
        actual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        actual.setBorder(null);
        actual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actual.setOpaque(false);
        actual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualActionPerformed(evt);
            }
        });
        actual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                actualKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                actualKeyReleased(evt);
            }
        });
        jPanel4.add(actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 130, 30));

        cfecha.setBackground(new java.awt.Color(225, 153, 51));
        cfecha.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cfecha.setText("Fecha actual");
        cfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfechaActionPerformed(evt);
            }
        });
        jPanel4.add(cfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 410));

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
    if (valor.getText().trim().isEmpty()  || nombre.getText().trim().isEmpty() ||  cantidad.getText().trim().isEmpty() || fecha.getDate() == null ){
        aceptar.setBackground(new Color(139, 0, 0));
        aceptar.setForeground(Color.black);
    } else {
        aceptar.setBackground(new Color(70, 70, 70));
        aceptar.setForeground(Color.white);
    }
}
    
    private void valorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorKeyPressed
         if(evt.getKeyCode()== KeyEvent.VK_ENTER){
             try{
        if (valor.getText().trim().isEmpty() ||
        nombre.getText().trim().isEmpty() ||
        cantidad.getText().trim().isEmpty() ||
        fecha.getDate() == null) {
        
        JOptionPane.showMessageDialog(this, 
                "Todos los campos (Nombre, Fecha, Compra, Valor, Cantidad) deben estar llenos", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if (Float.parseFloat(cantidad.getText())<=0) {
            JOptionPane.showMessageDialog(this, "Cantidad tiene que ser mayor que cero");

         //llenar valores   
        }else if (Float.parseFloat(valor.getText())<=0) {
            JOptionPane.showMessageDialog(this, "Valor tiene que ser mayor que cero");
        }else{ 
                    this.setVisible(false);

        }
        
    }catch(HeadlessException | NumberFormatException e){
        
        JOptionPane.showMessageDialog(this, "Los Datos No son validos");
    }
         }
    }//GEN-LAST:event_valorKeyPressed

    private void cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyPressed
    if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        valor.requestFocus();} 
    }//GEN-LAST:event_cantidadKeyPressed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
    if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        fecha.requestFocus(); }
    }//GEN-LAST:event_nombreKeyPressed

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
        fecha.getDate() == null) {
        
        JOptionPane.showMessageDialog(this, 
                "Todos los campos (Nombre, Fecha, Compra, Valor, Cantidad) deben estar llenos", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if (Float.parseFloat(cantidad.getText())<=0) {
            JOptionPane.showMessageDialog(this, "Cantidad tiene que ser mayor que cero");

         //llenar valores   
        }else if (Float.parseFloat(valor.getText())<=0) {
            JOptionPane.showMessageDialog(this, "Valor tiene que ser mayor que cero");
        }else{ 
                    this.setVisible(false);

        }
        
    }catch(HeadlessException | NumberFormatException e){
        
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
        try{
            float cantidadValue = Float.parseFloat(cantidad.getText());
            float valorValue = Float.parseFloat(valor.getText());
            float totalValue = cantidadValue * valorValue;
            valort.setText(String.valueOf(totalValue));
           
        }
        catch (NumberFormatException e){
           
           valort.setText("0.00");
        }
    }//GEN-LAST:event_cantidadKeyReleased

    private void valorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorKeyReleased
        /*lo llamamos para que tambien saque el valor tal
        ya que solo modifica en cantidad y en el valor tambien
        se tiene que poder*/
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

    private void actualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actualKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualKeyPressed

    private void actualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actualKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_actualKeyReleased

    private void actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualActionPerformed

    private void aceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aceptarKeyPressed
 if(evt.getKeyCode()== KeyEvent.VK_ENTER){
     try{
        if (valor.getText().trim().isEmpty() ||
        nombre.getText().trim().isEmpty() ||
        cantidad.getText().trim().isEmpty() ||
        fecha.getDate() == null) {
        
        JOptionPane.showMessageDialog(this, 
                "Todos los campos (Nombre, Fecha, Compra, Valor, Cantidad) deben estar llenos", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if (Float.parseFloat(cantidad.getText())<=0) {
            JOptionPane.showMessageDialog(this, "Cantidad tiene que ser mayor que cero");

         //llenar valores   
        }else if (Float.parseFloat(valor.getText())<=0) {
            JOptionPane.showMessageDialog(this, "Valor tiene que ser mayor que cero");
        }else{ 
                    this.setVisible(false);

        }
        
    }catch(HeadlessException | NumberFormatException e){
        
        JOptionPane.showMessageDialog(this, "Los Datos No son validos");
    }
 }


     
    }//GEN-LAST:event_aceptarKeyPressed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
    if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        cantidad.requestFocus(); 
    
    }
    }//GEN-LAST:event_fechaKeyPressed

    private void fechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaMouseClicked
 
    }//GEN-LAST:event_fechaMouseClicked

    private void cfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfechaActionPerformed
        if(cfecha.isSelected()){
                    fecha.setDate(new Date());

        }else if (!cfecha.isSelected()){
                                fecha.setDate(null);
        }
            
    }//GEN-LAST:event_cfechaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarinventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            agregarinventario dialog = new agregarinventario(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLvalor;
    private javax.swing.JLabel JLvalortotal1;
    private javax.swing.JLabel Jpago;
    private javax.swing.JButton aceptar;
    public javax.swing.JTextField actual;
    private javax.swing.JPanel barratitulo;
    private javax.swing.JButton cancelar;
    public javax.swing.JTextField cantidad;
    private javax.swing.JCheckBox cfecha;
    public com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlfecha;
    public javax.swing.JTextField nombre;
    private javax.swing.JLabel tdatos;
    public javax.swing.JTextField valor;
    public javax.swing.JTextField valort;
    // End of variables declaration//GEN-END:variables
    
}
