/*
    Leia os quatro valores correspondentes aos eixos 
    x e y de dois pontos quaisquer no plano, p1(x1,y1) 
    e p2(x2,y2) e calcule a distância entre eles, mostrando 
    4 casas decimais após a vírgula, segundo a fórmula: 
*/

import java.util.Scanner;

public class BEE15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[4];

        vetor[0] = sc.nextDouble();
        vetor[1] = sc.nextDouble();
        vetor[2] = sc.nextDouble();
        vetor[3] = sc.nextDouble();

        System.out.printf("%.4f%n", Math.sqrt(Math.pow(vetor[2]-vetor[0], 2) + Math.pow(vetor[3]-vetor[1], 2)));
        sc.close();
    }
}
