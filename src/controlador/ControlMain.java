package controlador;

import modelo.Producto;
import vista.VistaMoneda;

import javax.swing.*;
import java.util.ArrayList;

public class ControlMain {
    // definicion de variables
    private VistaMoneda vista;
    private ArrayList<Producto> listaProductos;
    private Producto calPrecio;

    public ControlMain(){
        listaProductos = new ArrayList<>();
        addProduct();
        vista = new VistaMoneda(this);
        vista.setContentPane(vista.getJPanelContenedor());
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true);
        vista.pack();
    }

    public void addProduct(){
        Producto mensaje = new Producto("--Selecione un Producto--");

        //creamos los productos
        Producto product1 =new Producto("Jabon Rey", 3650);
        Producto product2 =new Producto("Speed Stick", 16950);

        //añadimos los productos
        listaProductos.add(mensaje);
        listaProductos.add(product1);
        listaProductos.add(product2);
    }

    public static void main(String[] args) {
        ControlMain control = new ControlMain();
    }

    // metodos getter y setter
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public Producto getCalPrecio() {
        return calPrecio;
    }

    public void setCalPrecio(Producto calPrecio) {
        this.calPrecio = calPrecio;
    }
}

