/*
    Faça um programa que leia três valores e apresente o 
    maior dos três valores lidos seguido da mensagem “eh o maior”. 
    Utilize a fórmula: Obs.: a fórmula apenas calcula o maior entre 
    os dois primeiros (a e b). Um segundo passo, portanto é necessário 
    para chegar no resultado esperado.
*/

import java.util.Scanner;

public class BEE13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maiorab = (a+b+Math.abs(a-b))/2;
        int maiorbc = (maiorab+c + Math.abs(maiorab-c))/2;
        System.out.printf(maiorbc +" eh o maior%n");
        sc.close();
    }
}
