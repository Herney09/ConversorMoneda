package controlador;

import vista.VistaMoneda;

import javax.swing.*;

public class ControlMain {

    private VistaMoneda vista;

    public ControlMain(){
        vista = new VistaMoneda();
        vista.setContentPane(vista.getJPanelContenedor());
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true);
        vista.pack();

    }
    public static void main(String[] args) {
        ControlMain control = new ControlMain();
    }

}