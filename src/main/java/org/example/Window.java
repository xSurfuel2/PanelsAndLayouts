package org.example;

import javax.swing.*;

public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        frame.setContentPane(new Window().JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel JPanel1;
    private JPanel headerPanel;
    private JPanel navPanel;
    private JPanel formPanel;
    private JPanel previewPanel;
    private JTabbedPane tabbedPane1;
    private JPanel Dashboard;
    private JPanel Usuarios;
    private JPanel Informes;
    private JPanel Ajustes;
    private JPanel Ayuda;
    private JPanel buttonBar;
    private JLabel icon;
    private JButton dashboardButton;
    private JButton usuariosButton;
    private JButton informesButton;
    private JButton ajustesButton;
    private JButton ayudaButton;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JCheckBox checkBox1;
    private JLabel Nombre;
    private JLabel Email;
    private JLabel Rol;
    private JLabel Activo;
    private JLabel Notas;
    private JTextArea textArea1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
