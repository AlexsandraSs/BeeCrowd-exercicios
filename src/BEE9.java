/*
    Faça um programa que leia o nome de um vendedor, o 
    seu salário fixo e o total de vendas efetuadas por ele 
    no mês (em dinheiro). Sabendo que este vendedor ganha 15%
    de comissão sobre suas vendas efetuadas, informar o total 
    a receber no final do mês, com duas casas decimais.
*/

import java.util.Scanner;

public class BEE9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        @SuppressWarnings("unused")
        String beneficiario = sc.next();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double valorreceber = (vendas*15/100) + salario;
        
        System.out.printf("TOTAL = R$ %.2f%n", valorreceber);

        sc.close();
    }
}