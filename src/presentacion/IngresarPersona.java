package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame {

    private JPanel pnlPrincipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblApellido;
    private JTextField txtApellido;
    private JButton guardarButton;
    private JLabel lblIdioma;
    private JComboBox cmbIdioma;

    private JCheckBox chbTerminos;
    private JRadioButton rbtFemenino;
    private JLabel lblGenero;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtPrefieronNoDecirlo;

    public IngresarPersona (){
        this.setContentPane(pnlPrincipal);

        this.setSize(400,300);

        this.setVisible (true);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo =txtCodigo.getText();
                String nombre =txtNombre.getText();
                String apellido = txtApellido.getText();
                String idioma = cmbIdioma.getSelectedItem().toString();
                String aceptoTerminos = (chbTerminos.isSelected()==true)? "SI":"NO";
                String genero = (rbtFemenino.isSelected()==true)? "Femenino":
                                (rbtMasculino.isSelected()== true)? "Masculino":
                                (rbtOtro.isSelected()==true)? "Otro":
                                        (rbtPrefieronNoDecirlo.isSelected())? "No indicado": "";
                String mensaje = "Tus datos son: "+ "\n"+
                                "Codigo:"  +codigo+ "\n"+
                                "Nombre:"  +nombre+ "\n"+
                                "Apellido:" +apellido+ "\n"+
                                "Idioma: " + idioma + "\n"+
                                "Genero: " + genero + "\n"+
                                "Acepto Terminos : "+ aceptoTerminos ;
                JOptionPane.showMessageDialog(guardarButton, mensaje);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

}
