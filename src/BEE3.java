/*
    Leia dois valores inteiros, no caso para variáveis A e B. 
    A seguir, calcule a soma entre elas e atribua à variável SOMA. 
    A seguir escrever o valor desta variável.
*/

import java.util.Scanner;

public class BEE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("SOMA = "+ (a+b));
        sc.close();
    }
}
