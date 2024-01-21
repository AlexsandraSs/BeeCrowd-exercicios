/*
    Escreva um programa que leia o número de um funcionário, seu 
    número de horas trabalhadas, o valor que recebe por hora 
    e calcula o salário desse funcionário. A seguir, mostre 
    o número e o salário do funcionário, com duas casas decimais.
*/

import java.util.Scanner;

public class BEE8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        double s = sc.nextDouble();
        double x = (h*s);
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", n, x);
        sc.close();
    }
}
