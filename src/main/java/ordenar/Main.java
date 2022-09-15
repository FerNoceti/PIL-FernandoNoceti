package ordenar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int n;
        do {
            System.out.print("Ingrese un numero (0 o menor para cancelar): ");
            n = sc.nextInt();
            if (n > 0){
                numeros.add(n);
            }
        }  while (n > 0);

        System.out.println(estaOrdenado(numeros) ? "Esta ordenado" : "No esta ordenado");
        
    }
    
    static boolean estaOrdenado(ArrayList<Integer> array){
        for (int j = 0; j < array.size(); j++) {
            for (int i = j + 1; i < array.size(); i++) {
                if (array.get(i).compareTo(array.get(j)) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
