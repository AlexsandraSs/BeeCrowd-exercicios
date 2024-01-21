/*
    Leia dois valores inteiros. A seguir, calcule o produto 
    entre estes dois valores e atribua esta operação à variável PROD.
    A seguir mostre a variável PROD com mensagem correspondente.   
*/

import java.util.Scanner;

public class BEE4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("PROD = "+ (a*b));
        sc.close();
    }
}
