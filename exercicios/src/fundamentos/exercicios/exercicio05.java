package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("a: ");
        double a = scan.nextDouble();
        System.out.print("b: ");
        double b = scan.nextDouble();
        System.out.print("c: ");
        double c = scan.nextDouble();

        scan.close();
        double delta = (b * b) - (4 * a * c);
        double x1 = (-b + Math.sqrt(delta))/(2*a);
        double x2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.println();
        System.out.printf("As raizes da função são: %.2f e %.2f", x1, x2);
        System.out.println();
    }
    
}
