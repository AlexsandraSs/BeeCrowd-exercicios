/*
    Calcule o consumo médio de um automóvel sendo fornecidos 
    a distância total percorrida (em Km) e o total de 
    combustível gasto (em litros).
*/

import java.util.Scanner;

public class BEE14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        System.out.printf("%.3f km/l%n", (x/y));
        sc.close();
    }
}
