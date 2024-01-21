/*
    Leia um valor inteiro, que é o tempo de duração em 
    segundos de um determinado evento em uma fábrica, e 
    informe-o expresso no formato horas:minutos:segundos.
*/
import java.util.Scanner;

public class BEE19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();

        //int horas = segundos/3600;
        
        segundos = segundos%3600;       
        sc.close();
    }
    
}