package presentacion;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    private void inicializarMenu(){
        JMenuBar barraMenu = new JMenuBar();
        
        this.setJMenuBar(barraMenu);
        
        JMenu menuPersonas = new JMenu("personas");
        
        barraMenu.add(menuPersonas);
    }


    public VentanaPrincipal(){
        inicializarMenu();
        this.setSize(180,800);
        this.setVisible(true);
    }
}
