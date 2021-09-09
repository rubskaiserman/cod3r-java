package fundamentos;

import java.util.Scanner;

public class DesafioFundamentos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int a = Integer.parseInt(scan.next());
        System.out.println("Insira o segundo número: ");
        int b = Integer.parseInt(scan.next());
        System.out.println("Insira a operação desejada: ");
        String op = scan.next();
        scan.close();
        int res = op.equals("+") ? a + b : 0;
        res = op.equals("-") ? a - b : res;
        res = op.equals("*") ? a * b : res;
        res = op.equals("/") ? a / b : res;
        res = op.equals("%") ? a % b : res;

        System.out.println(res);

    }
}
