package periferico;

public class Main {
    public static void main(String[] args) {

        //instanciamos perifericos
        Periferico per1 = new Periferico("mouse");
        Periferico per2 = new Periferico("mouse");
        Periferico per3 = new Periferico();
        System.out.println("Perifericos inicializados");
        System.out.println("per1 =" + per1);
        System.out.println("per2 =" +per2);
        System.out.println("per3 =" +per3);

        //seteo atributos per 1 y 2
        per1.setAniosGarantia(3);
        per1.setCostoDelProducto(10f);
        per2.setAniosGarantia(2);
        per2.setCostoDelProducto(15f);
        System.out.println("perifericos 1 y 2 con atributos");
        System.out.println(per1);
        System.out.println(per2);

        //metodo equals
        System.out.println("Los perifericos per1 y per2 son iguales? " + (per1.equals(per2) ? "si" : "no"));
        System.out.println("Los perifericos per1 y per3 son iguales? " + (per1.equals(per3) ? "si" : "no"));

        //incrementamos costos
        System.out.println("Costo inicial de per1");
        System.out.println(per1.getCostoDelProducto());
        System.out.println("Incremento del 50%");
        per1.incrementarCosto(0.5f);
        System.out.println(per1.getCostoDelProducto());
        System.out.println("Incremento de 12.9");
        per1.incrementarCosto(12.9);
        System.out.println(per1.getCostoDelProducto());

    }
}
