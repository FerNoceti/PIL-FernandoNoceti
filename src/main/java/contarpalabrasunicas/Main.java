package contarpalabrasunicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Escribir un programa que me permita escribir palabras hasta que escriba exit y que me muestre cuantas apariciones de cada palabra encuentra
        //
        //USAR ArrayList

        //definicion e inicializacion
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;
        String temp;
        boolean primeraVez = true;
        boolean ultimaVez = false;
        int contador = 0;

        //carga de datos
        do{
            System.out.print("Ingrese una palabra a cargar o exit para salir: ");
            word = sc.next();
            if(!word.equalsIgnoreCase("exit")){

                words.add(word);
            }
        }while (!word.equalsIgnoreCase("exit"));

        System.out.println(words);

        //ordenar array
        for (int j = 0; j < words.size(); j++) {
            for (int i = j + 1; i < words.size(); i++) {
                if (words.get(i).compareTo(words.get(j)) < 0) {
                    temp = words.get(j);
                    words.set(j, words.get(i));
                    words.set(i, temp);
                }
            }
        }
        System.out.println(words);

        //mostrar cantidad de veces
        for (int i = 0; i < words.size(); i++) {
            if (i == words.size() - 1){
                ultimaVez = true;
            }
            if (i == 0 & !ultimaVez){
                contador++;
            } else {
                if (words.get(i).equals(words.get(i - 1))) {
                    contador++;
                } else {
                    System.out.println("Se encontro " + contador + " vez/veces la palabra " + words.get(i - 1));
                    contador = 1;
                }
            }
        }
    }
}
