package fundamentos;

import java.util.Scanner;

// import java.utils.Locale;

//Crie uma classe Desafio
//A partir do Scanner receba três Strings usando nextLine()
//Os valores são os ultimos três salários de um funcionário
//O objetivo é calcular o salário médio dos ultimos três meses
//O funcionário pode escrever com virgula ou ponto a separação de casas decimais

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu salário de 2 meses atraś");
        String x = scan.nextLine().replaceAll(",", ".");
        System.out.println("Insira seu salário de 1 meses atraś");
        String y = scan.nextLine().replaceAll(",", ".");
        System.out.println("Insira seu salário de desse mes");
        String z = scan.nextLine().replaceAll(",", ".");

        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        double c = Double.parseDouble(z);
        
        System.out.println();
        System.out.printf("Salário médio: %.2f", (a + b + c)/3);
        System.out.println();

    }
    
}
