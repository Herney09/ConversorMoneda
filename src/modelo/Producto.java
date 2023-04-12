package modelo;

public class Producto {
    private String nombre;
    private double precio;
    private int catidad;

    //implementamos el metodo constructor
    public Producto(String nombre){
        this.nombre = nombre;
    }
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //implentamanos el metodo calcular precio
    public double precioUSD(){
        double precioUSD = 0.000215;
        return getPrecio() * precioUSD;
    }

    public double precioTotalUSD( double cantidad){
        double totalUSD = 4507.80;
        return  getPrecio() * cantidad/totalUSD;
    }
    public double precioTotalCOP( double cantidad){
        return getPrecio() * cantidad;
    }

    //implementamos los metodos Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCatidad() {
        return catidad;
    }

    public void setCatidad(int catidad) {
        this.catidad = catidad;
    }
}
