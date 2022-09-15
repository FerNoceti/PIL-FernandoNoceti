package tp2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creamos productos para la simulacion del programa
        Producto zapatilla = new Producto("Zapatillas", 150);
        Producto buzo = new Producto("Buzo", 300);
        Producto remera = new Producto("Remera", 50);
        Producto medias = new Producto("Medias", 15);
        Producto gorra = new Producto("Gorra", 75);

        Producto[] productos = {zapatilla, buzo, remera, medias, gorra};

        String listadoProductos = "";
        for (int i = 0; i < productos.length; i++) {
            listadoProductos += i + ") " + productos[i].toString() + "\n";
        }

        //Simulacion
        Scanner sc = new Scanner(System.in);
        int opMenu;
        int opVenta;
        Venta ventaAux;
        boolean primerProducto;
        System.out.println("Inicio de jornada");
        int montoTotal = 0;
        //Array donde guardaremos todas las ventas
        ArrayList<Venta> ventas = new ArrayList<>();
        do {

            System.out.print("Ingrese 1 para cagar una venta o cualquier otro numero para finalizar la jornada: ");
            opMenu = sc.nextInt();

            if (opMenu == 1) {
                ventaAux = new Venta();
                primerProducto = true;
                do {
                    System.out.println("\nIngrese el numero de la prenda que desea agregar o cualquier otro numero para " +
                            "finalizar la venta\n" + listadoProductos
                            + (primerProducto ? "\nRECUERDE QUE SI O SI DEBE HABER UN PRODUCTO" : "\nYa puede cerrar la venta"));

                    opVenta = sc.nextInt();

                    if (opVenta >= 0 && opVenta <= 4) {
                        if (primerProducto) {
                            primerProducto = false;
                        }
                        ventaAux.addProducto(productos[opVenta]);
                    } else if (primerProducto) {
                        primerProducto = false;
                        while (opVenta < 0 || opVenta > 4) {
                            System.out.println("Debe ingresar al menos un producto al iniciar una venta");
                            System.out.println("\nIngrese el numero de la prenda que desea agregar o cualquier otro numero" +
                                    " para finalizar la venta\n" + listadoProductos);
                            opVenta = sc.nextInt();
                        }
                        ventaAux.addProducto(productos[opVenta]);
                    }


                } while (opVenta >= 0 && opVenta <= 4);

                ventaAux.calcularMontoTotal();
                System.out.println(ventaAux);
                ventas.add(ventaAux);

            }

        } while (opMenu == 1);

        for (Venta venta : ventas) {
            montoTotal += venta.getMontoTotal();
        }
        System.out.println("\nEl monto total de la jornada fue de $" + montoTotal);

    }
}
