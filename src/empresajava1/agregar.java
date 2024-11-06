
package empresajava1;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class agregar extends javax.swing.JDialog {
//para mover la barra que hay arriba
    private int xmouse;
    private int ymouse;

    public agregar(java.awt.Frame parent, boolean modal) {
       
        super(parent, modal);
        initComponents();
        aceptar.setBackground(new Color(139, 0, 0));
        aceptar.setForeground(Color.black);
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
        nombre.getDocument().addDocumentListener(listener);
        cargo.getDocument().addDocumentListener(listener); 
        contrato.getDocument().addDocumentListener(listener);
        proyecto.getDocument().addDocumentListener(listener); 
        pago.getDocument().addDocumentListener(listener); 
        actual.getDocument().addDocumentListener(listener); 
        
          // Inicializa el campo "actual" con la fecha actual
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd 'Hora:'  HH:mm");
        actual.setText(dateFormat.format(new java.util.Date()));
        
        
                 //para moverlo al siguiente lugar
         fechaI.addPropertyChangeListener("date",evt->{
             if(fechaI.getDate()!=null){
                     fechaI.requestFocus(); 
             }
         });
           fechaF.addPropertyChangeListener("date",evt->{
             if(fechaF.getDate()!=null){
                     proyecto.requestFocus(); 
             }
         });
                  //para que se pueda escribir de una
          contrato.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    fechaI.requestFocus(); // Mover el foco al JDateChooser
                                // Asegúrate de que se pueda escribir en el JDateChooser
            fechaI.getDateEditor().getUiComponent().requestFocus();

        }
    }
});
         fechaI.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    fechaF.requestFocus(); // Mover el foco al JDateChooser
                                // Asegúrate de que se pueda escribir en el JDateChooser
            fechaF.getDateEditor().getUiComponent().requestFocus();

        }
    }
});
         // Listener para cambios en las fechas
PropertyChangeListener dateChangeListener = evt -> {
    if ("date".equals(evt.getPropertyName())) {
        validar();  // Llama a tu método de validación
    }
};

// Agregar el listener a fechaI y fechaF
fechaI.addPropertyChangeListener(dateChangeListener);
fechaF.addPropertyChangeListener(dateChangeListener);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        barratitulo = new javax.swing.JPanel();
        JLcontrato = new javax.swing.JLabel();
        JLcargo = new javax.swing.JLabel();
        JLnombre = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        JLproyecto = new javax.swing.JLabel();
        jlfecha = new javax.swing.JLabel();
        fechaI = new com.toedter.calendar.JDateChooser();
        actual = new javax.swing.JTextField();
        cfechaI = new javax.swing.JCheckBox();
        nombre = new javax.swing.JTextField();
        contrato = new javax.swing.JTextField();
        proyecto = new javax.swing.JTextField();
        cargo = new javax.swing.JTextField();
        pago = new javax.swing.JTextField();
        JLpago = new javax.swing.JLabel();
        jlfechaF = new javax.swing.JLabel();
        fechaF = new com.toedter.calendar.JDateChooser();
        cfechaF = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Ventana");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(225, 153, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        JLcontrato.setBackground(new java.awt.Color(255, 255, 255));
        JLcontrato.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLcontrato.setForeground(new java.awt.Color(255, 255, 255));
        JLcontrato.setText("Contrato");
        jPanel4.add(JLcontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 100, 20));

        JLcargo.setBackground(new java.awt.Color(255, 255, 255));
        JLcargo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLcargo.setForeground(new java.awt.Color(255, 255, 255));
        JLcargo.setText("Cargo");
        jPanel4.add(JLcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 100, 20));

        JLnombre.setBackground(new java.awt.Color(255, 255, 255));
        JLnombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLnombre.setForeground(new java.awt.Color(255, 255, 255));
        JLnombre.setText("Nombre:");
        jPanel4.add(JLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 100, 20));

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
        jPanel4.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 90, 30));

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
        jPanel4.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 90, 30));

        JLproyecto.setBackground(new java.awt.Color(255, 255, 255));
        JLproyecto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLproyecto.setForeground(new java.awt.Color(255, 255, 255));
        JLproyecto.setText("Proyecto");
        jPanel4.add(JLproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, 20));

        jlfecha.setBackground(new java.awt.Color(255, 255, 255));
        jlfecha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlfecha.setForeground(new java.awt.Color(255, 255, 255));
        jlfecha.setText("Fecha De Inicio:");
        jPanel4.add(jlfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 100, 20));

        fechaI.setBackground(new java.awt.Color(225, 153, 51));
        fechaI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaIKeyPressed(evt);
            }
        });
        jPanel4.add(fechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 130, -1));

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
        jPanel4.add(actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, 30));

        cfechaI.setBackground(new java.awt.Color(225, 153, 51));
        cfechaI.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cfechaI.setText("Fecha actual");
        cfechaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfechaIActionPerformed(evt);
            }
        });
        cfechaI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cfechaIKeyPressed(evt);
            }
        });
        jPanel4.add(cfechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

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
        jPanel4.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 300, 30));

        contrato.setBackground(new java.awt.Color(204, 204, 204));
        contrato.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratoActionPerformed(evt);
            }
        });
        contrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contratoKeyPressed(evt);
            }
        });
        jPanel4.add(contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 300, 30));

        proyecto.setBackground(new java.awt.Color(204, 204, 204));
        proyecto.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proyectoActionPerformed(evt);
            }
        });
        proyecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                proyectoKeyPressed(evt);
            }
        });
        jPanel4.add(proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 300, 30));

        cargo.setBackground(new java.awt.Color(204, 204, 204));
        cargo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });
        cargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cargoKeyPressed(evt);
            }
        });
        jPanel4.add(cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 300, 30));

        pago.setBackground(new java.awt.Color(204, 204, 204));
        pago.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });
        pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pagoKeyPressed(evt);
            }
        });
        jPanel4.add(pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 300, 30));

        JLpago.setBackground(new java.awt.Color(255, 255, 255));
        JLpago.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JLpago.setForeground(new java.awt.Color(255, 255, 255));
        JLpago.setText("Pago");
        jPanel4.add(JLpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 100, 20));

        jlfechaF.setBackground(new java.awt.Color(255, 255, 255));
        jlfechaF.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlfechaF.setForeground(new java.awt.Color(255, 255, 255));
        jlfechaF.setText("Fecha de Finalizar:");
        jPanel4.add(jlfechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, 20));

        fechaF.setBackground(new java.awt.Color(225, 153, 51));
        fechaF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaFKeyPressed(evt);
            }
        });
        jPanel4.add(fechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 130, -1));

        cfechaF.setBackground(new java.awt.Color(225, 153, 51));
        cfechaF.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cfechaF.setText("Fecha actual");
        cfechaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfechaFActionPerformed(evt);
            }
        });
        jPanel4.add(cfechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 470));

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
   if (nombre.getText().trim().isEmpty() ||
            cargo.getText().trim().isEmpty() ||
            contrato.getText().trim().isEmpty() || 
            proyecto.getText().trim().isEmpty() || 
            pago.getText().trim().isEmpty() || 
            fechaI.getDate() == null || 
            fechaF.getDate() == null ||
        fechaF.getDate().before(fechaI.getDate())  //puras librerias
           
           ) {
        aceptar.setBackground(new Color(139, 0, 0));
        aceptar.setForeground(Color.black);
    } else {
        aceptar.setBackground(new Color(70, 70, 70));
        aceptar.setForeground(Color.white);
    }
}
    
    private void aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseClicked
    try {
         if (nombre.getText().trim().isEmpty() ||
            cargo.getText().trim().isEmpty() ||
            contrato.getText().trim().isEmpty() || 
            proyecto.getText().trim().isEmpty() || 
            pago.getText().trim().isEmpty() || 
            fechaI.getDate() == null || 
            fechaF.getDate() == null) {
            
            JOptionPane.showMessageDialog(this, 
                "Todos los campos (Nombre, Cargo, Fecha Inicio, Fecha Final, Contrato, Proyecto, Pago) deben estar llenos.", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (Float.parseFloat(pago.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad tiene que ser mayor que cero.");
        } else if (fechaF.getDate().before(fechaI.getDate())) {
            JOptionPane.showMessageDialog(this, "La fecha final debe ser posterior a la fecha de inicio.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            this.setVisible(false);
        }
    } catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Los datos no son válidos.");
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

    private void barratituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barratituloMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_barratituloMousePressed

    private void barratituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barratituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_barratituloMouseDragged

    private void actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualActionPerformed

    private void actualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actualKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_actualKeyPressed

    private void actualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actualKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_actualKeyReleased

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
 if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        cargo.requestFocus();} 
    }//GEN-LAST:event_nombreKeyPressed

    private void cfechaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfechaIActionPerformed
        if(cfechaI.isSelected()){
            fechaI.setDate(new Date());

        }else if (!cfechaI.isSelected()){
            fechaI.setDate(null);
        }
    }//GEN-LAST:event_cfechaIActionPerformed

    private void fechaIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaIKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            fechaF.requestFocus();
        
        }
    }//GEN-LAST:event_fechaIKeyPressed

    private void contratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contratoActionPerformed

    private void contratoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contratoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_contratoKeyPressed

    private void proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proyectoActionPerformed

    private void proyectoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proyectoKeyPressed
 if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        pago.requestFocus();}     }//GEN-LAST:event_proyectoKeyPressed

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagoActionPerformed

    private void pagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagoKeyPressed
 if(evt.getKeyCode()== KeyEvent.VK_ENTER){
       try {
        if (nombre.getText().trim().isEmpty() ||
            cargo.getText().trim().isEmpty() ||
            contrato.getText().trim().isEmpty() || 
            proyecto.getText().trim().isEmpty() || 
            pago.getText().trim().isEmpty() || 
            fechaI.getDate() == null || 
            fechaF.getDate() == null) {
            
            JOptionPane.showMessageDialog(this, 
                "Todos los campos (Nombre, Cargo, Fecha Inicio, Fecha Final, Contrato, Proyecto, Pago) deben estar llenos.", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (Float.parseFloat(pago.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad tiene que ser mayor que cero.");
        } else if (fechaF.getDate().before(fechaI.getDate())) {
            JOptionPane.showMessageDialog(this, "La fecha final debe ser posterior a la fecha de inicio.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            this.setVisible(false);
        }
    } catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Los datos no son válidos.");
    }

 }
    }//GEN-LAST:event_pagoKeyPressed

    private void cargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargoKeyPressed
 if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        contrato.requestFocus();} 
    }//GEN-LAST:event_cargoKeyPressed

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoActionPerformed

    private void fechaFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaFKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaFKeyPressed

    private void cfechaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfechaFActionPerformed
   if(cfechaF.isSelected()){
            fechaF.setDate(new Date());

        }else if (!cfechaF.isSelected()){
            fechaF.setDate(null);
        }    }//GEN-LAST:event_cfechaFActionPerformed

    private void cfechaIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cfechaIKeyPressed
                
    }//GEN-LAST:event_cfechaIKeyPressed

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
        java.awt.EventQueue.invokeLater(() -> {
            agregar dialog = new agregar(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel JLcargo;
    private javax.swing.JLabel JLcontrato;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLpago;
    private javax.swing.JLabel JLproyecto;
    private javax.swing.JButton aceptar;
    public javax.swing.JTextField actual;
    private javax.swing.JPanel barratitulo;
    private javax.swing.JButton cancelar;
    public javax.swing.JTextField cargo;
    private javax.swing.JCheckBox cfechaF;
    private javax.swing.JCheckBox cfechaI;
    public javax.swing.JTextField contrato;
    public com.toedter.calendar.JDateChooser fechaF;
    public com.toedter.calendar.JDateChooser fechaI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlfecha;
    private javax.swing.JLabel jlfechaF;
    public javax.swing.JTextField nombre;
    public javax.swing.JTextField pago;
    public javax.swing.JTextField proyecto;
    // End of variables declaration//GEN-END:variables

}
