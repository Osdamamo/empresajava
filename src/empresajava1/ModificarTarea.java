package empresajava1;

import javax.swing.*;
import java.awt.*;

public class ModificarTarea extends JDialog {
    private JTextField txtModificar, txtModificar2, txtModificar3;
    private JButton btnGuardar, btnCancelar;
    private String tareaOriginal, segundoOriginal, terceroOriginal;
    //para el momento de devolver tiene que ser true, en los metodos lo cambio a true
    private boolean modificada = false;

    // Constructor para principal y reporte
    public ModificarTarea(JFrame parent, String tarea) {
        this(parent, tarea, null, null);
    }

    // Constructor para pago
    public ModificarTarea(JFrame parent, String tarea, String segundo, String tercero) {
        super(parent, true);
        //this.setUndecorated(true);
        this.tareaOriginal = tarea;
        this.segundoOriginal = segundo;
        this.terceroOriginal = tercero;

        // Configuración de componentes
        txtModificar = new JTextField(tarea, 20);
        txtModificar.setPreferredSize(new Dimension(400, 30));
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");

        // Si se proporcionan valores para segundo y tercero, muestra esos campos
        if (segundo != null && tercero != null) {
            txtModificar2 = new JTextField(segundo, 20);
            txtModificar3 = new JTextField(tercero, 20);
            txtModificar2.setPreferredSize(new Dimension(400, 30));
            txtModificar3.setPreferredSize(new Dimension(400, 30));
        }

        // Configuración del layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);  // Añade padding

        // Titulo del campo
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(new JLabel("Modificar tarea:"), gbc);

        // Campo de texto con margen
        gbc.gridy++;
        gbc.fill = GridBagConstraints.HORIZONTAL; /*Hace que el JTextField se expanda horizontalmente para ocupar todo el espacio disponible.*/
         gbc.weightx = 1.0;  // Permite que el JTextField se expanda
        add(txtModificar, gbc);

        if (txtModificar2 != null && txtModificar3 != null) {
            gbc.gridy++;
            add(txtModificar2, gbc);

            gbc.gridy++;
            add(txtModificar3, gbc);
        }

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
        setMinimumSize(new Dimension(500, 250));  // Tamaño mínimo
        setLocationRelativeTo(parent);
        setResizable(false);  // Opcional, para que no se redimensione

        // Eventos de botones
        btnGuardar.addActionListener(e -> guardarTarea());
        btnCancelar.addActionListener(e -> dispose());
    }

    private void guardarTarea() {
        if (!txtModificar.getText().trim().isEmpty() &&
            (txtModificar2 == null || !txtModificar2.getText().trim().isEmpty()) &&
            (txtModificar3 == null || !txtModificar3.getText().trim().isEmpty())) {

            tareaOriginal = txtModificar.getText();
            if (txtModificar2 != null) segundoOriginal = txtModificar2.getText();
            if (txtModificar3 != null) terceroOriginal = txtModificar3.getText();
            modificada = true;
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Devuelve la tarea modificada
    public String getTareaModificada() {
        return modificada ? tareaOriginal : null;
    }

    // Devuelve el segundo y tercer valor si se modificaron
    public String getSegundoModificado() {
        return modificada ? segundoOriginal : null;
    }

    public String getTerceroModificado() {
        return modificada ? terceroOriginal : null;
    }
}
