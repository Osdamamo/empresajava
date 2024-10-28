package empresajava1;

import javax.swing.*;
import java.awt.*;

public class ModificarTarea extends JDialog {
    private JTextField txtModificar;
    private JButton btnGuardar, btnCancelar;
    private String tareaOriginal;
    private boolean modificada = false;
    
    
    public ModificarTarea(JFrame parent, String tarea) {
        super(parent, "Modificar Tarea", true);
       this.setUndecorated(true);
        tareaOriginal = tarea;
          
        // Configuración de componentes
        txtModificar = new JTextField(tarea, 20);
             txtModificar.setPreferredSize(new Dimension(400, 30));   // Establece un tamaño preferido para el JTextField
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");

        // Configuración del layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Añade padding

        // Añadir componentes con constraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(new JLabel("Modificar tarea:"), gbc);

        // Campo de texto con margen
        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL; /*Hace que el JTextField se expanda horizontalmente para ocupar todo el espacio disponible.*/
         gbc.weightx = 1.0;  // Permite que el JTextField se expanda
        add(txtModificar, gbc);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnGuardar);
        panelBotones.add(btnCancelar);

        
        gbc.gridy++;
        gbc.gridwidth = 2;
        add(panelBotones, gbc);

        // Añade espacio adicional debajo de los botones
        gbc.gridy++;
        gbc.weighty = 1.0;  // Esto añade espacio flexible en la parte inferior
        add(Box.createVerticalStrut(15), gbc);

        // Ajustes finales
        setMinimumSize(new Dimension(500, 200));  // Tamaño mínimo
        setLocationRelativeTo(parent);
        setResizable(false);  // Opcional, para que no se redimensione

        // Eventos de botones
        btnGuardar.addActionListener(e -> guardarTarea());
        btnCancelar.addActionListener(e -> dispose());
    }

    private void guardarTarea() {
        if (!txtModificar.getText().trim().isEmpty()) {
            tareaOriginal = txtModificar.getText();
            modificada = true;
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "El campo no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Devuelve la tarea modificada si se guardó, o null si se canceló
    public String getTareaModificada() {
        return modificada ? tareaOriginal : null;
        
    }
}
