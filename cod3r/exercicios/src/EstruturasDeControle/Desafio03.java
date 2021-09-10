package EstruturasDeControle;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        int total = 0;
        double val = 0;
        while(val != -1){
            System.out.print("Insira um valor: ");
            val = scan.nextDouble();
            if(val > 0 && val < 10){
                soma += val;
                total ++;
            } else if(val != -1) {
                System.out.println("Valor inválido!");
                System.out.println("Tente novamente.");
            }
            System.out.println();
        }
        System.out.println("Total de notas: " + total);
        System.out.printf("Média: %.2f", soma/total);
        System.out.println();

        scan.close();
    }
    
}
