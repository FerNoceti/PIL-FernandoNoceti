package tp2;

import java.util.ArrayList;

public class Venta {
    //atributos
    private final java.util.Date fecha;
    private final ArrayList<Producto> productos = new ArrayList<>();
    private int montoTotal;

    //metodos

    public java.util.Date getFecha() {
        return fecha;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void calcularMontoTotal() {
        for (Producto producto : productos) {
            montoTotal += producto.getMonto();
        }
    }

    //constructor
    Venta() {
        fecha = new java.util.Date();
        montoTotal = 0;
    }

    //toString
    @Override
    public String toString() {

        String cadenaProductos = "";
        for (Producto producto : getProductos()) {
            cadenaProductos += producto.toString() + " ";
        }

        return "Venta realizada el " + getFecha() + " con un monto de $" + getMontoTotal() + " y los productos fueron\n"
                + cadenaProductos;
    }
}
