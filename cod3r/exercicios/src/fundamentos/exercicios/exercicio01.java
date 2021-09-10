package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira a temperatura em Fahrenheit: ");
        double f = scan.nextDouble();
        double c = (5/9.0)*(f - 32);

        System.out.println();
        System.out.printf("Temperatura: %.2f °C", c);
        System.out.println();

        scan.close();
    }
}
