package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.next();
        Set<Character> caracteresUnicos = new HashSet<>();
        for (int i = 0; i < cadena.length(); i++){
            caracteresUnicos.add(cadena.charAt(i));
        }
        System.out.println(caracteresUnicos.size());
    }
}
