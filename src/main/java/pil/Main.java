package pil;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //cargar palabras hasta que yo escriba exit y que muestre cuantas palabras iguales hay en el array
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> noRepeatWords = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        String word;
        do {
            System.out.print("Cargue una palabra o ingrese exit para detener la carga: ");
            word = sc.next();
            if (!word.equals("exit")) {
                words.add(word);
            }else {
                System.out.println("Sus palabras son: " + words);
            }
        } while (!word.equals("exit"));

        for (int i = 0; i < words.size(); i++) {
            String auxPalabra = words.get(i);
            boolean isInArray = false;
            for (int j = 0; j < words.size(); j++) {
                if (auxPalabra.equals(words.get(j)) && i != j) {
                    isInArray = true;
                    break;
                }
            }
            if (!isInArray){
                noRepeatWords.add(auxPalabra);
                quantity.add(1);
            }else {
                for(int k = 0; k < noRepeatWords.size(); k++){
                    if(auxPalabra.equals(noRepeatWords.get(k))){
                        int cant = quantity.get(k) + 1;
                        quantity.set(k, cant);
                    }
                }
            }
        }
        System.out.println(noRepeatWords);
        System.out.println(quantity);
    }
}
