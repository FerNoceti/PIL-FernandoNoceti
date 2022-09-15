package tp2;

public class Producto {

    //atributos
    private String nombre;
    private int monto;

    //metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        if (monto > 0) {
            this.monto = monto;
        } else {
            this.monto = 1;
        }
    }

    //constructor
    Producto(String nombre, int monto) {
        setNombre(nombre);
        setMonto(monto);
    }

    //toString

    @Override
    public String toString() {
        return "|Producto " + getNombre() + ", monto: $" + getMonto() + "|";
    }
}
