package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Temperatura em celcius: ");
        double c = scan.nextDouble();
        double f = ((9/5.0) * c) + 32;

        System.out.println();
        System.out.printf("Temperatura em fahrenheit: %.2f °f", f);
        System.out.println();
        
        scan.close();
    }
}
