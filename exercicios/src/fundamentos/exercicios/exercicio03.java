package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Peso: ");
        double m = scan.nextDouble();
        System.out.print("Altura: ");
        double h = scan.nextDouble();

        scan.close();
        double imc = m/(h*h);
        System.out.println();
        System.out.printf("IMC: %.2f", imc);
        System.out.println();
    }
    
}
