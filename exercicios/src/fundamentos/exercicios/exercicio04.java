package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Número: ");
        double num = scan.nextDouble();
        
        System.out.println();
        System.out.printf("Quadrado: %.2f", num * num);
        System.out.println();
        System.out.printf("Cubo: %.2f", num * num * num);
        System.out.println();

        scan.close();
    }
    
}
