package fundamentos;

import java.util.Scanner;

public class DesafioFundamentos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        double a = scan.nextDouble();
        System.out.println("Insira o segundo número: ");
        double b = scan.nextDouble();
        System.out.println("Insira a operação desejada: ");
        String op = scan.next();
        scan.close();
        double res = op.equals("+") ? a + b : 0;
        res = op.equals("-") ? a - b : res;
        res = op.equals("*") ? a * b : res;
        res = op.equals("/") ? a / b : res;
        res = op.equals("%") ? a % b : res;

        System.out.println(res);

    }
}
