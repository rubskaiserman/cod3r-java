package EstruturasDeControle.lista;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Gimme a number or feel the consequences: ");
        double x = scan.nextDouble();
        if (x > 0 && x < 10 && x % 2 == 0 ) {
            System.out.println("True");
        }
        scan.close();
    }
}
