package fundamentos.exercicios;

import java.util.Scanner;

public class execicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Base: ");
        double base = scan.nextDouble();
        System.out.println("Altura: ");
        double h = scan.nextDouble();

        scan.close();
        double a = base*h/2;

        System.out.println();
        System.out.printf("Area: %.2f", a);
        System.out.println();
    }
    
}
