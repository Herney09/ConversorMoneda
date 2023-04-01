package modelo;

public class Procducto {
    private String nombre;
    private double precio;
    private int catidad;

    //implementamos el metodo constructor
    public Procducto(String nombre, double precio, int catidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.catidad = catidad;
    }

    //implementamos los metodos Guetter and Setter
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
