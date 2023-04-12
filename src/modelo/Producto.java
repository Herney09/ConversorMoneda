package modelo;

public class Producto {
    // definicion de variables
    private String nombre;
    private double precio;
    private int catidad;

    //implementamos dos metodos constructores
    public Producto(String nombre){
        this.nombre = nombre;
    }
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //metodo calcular precio unitario en dolares
    public double precioUSD(){
        double precioUSD = 4507.80;
        return getPrecio() / precioUSD;
    }

    // metodo para calcular el valor el valor total en dolares
    public double precioTotalUSD( double cantidad){
        double totalUSD = 4507.80;
        return  getPrecio() * cantidad/totalUSD;
    }
    // metodo para calcular el valor el valor total en pesos colombianos
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
