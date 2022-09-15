package palindromo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.next();
        String subcadena = "";
        int cantidad = 0;

        for (int i = 0; i < palabra.length(); i++){
            for (int j = i; j < palabra.length(); j++){
                System.out.println(palabra.substring(i,j+1));
                if (esPalindromo(palabra.substring(i, j + 1))){
                    cantidad++;
                }
            }
        }

        System.out.println("Hay " + cantidad + " palindromo/s");

    }

    static boolean esPalindromo(String word){
        for (int i = 0; i < word.length()/2; i++){
            if (word.charAt(i) != word.charAt(word.length()- i - 1) || word.length() == 1){
                return false;
            }
        }
        return true;
    }

}
