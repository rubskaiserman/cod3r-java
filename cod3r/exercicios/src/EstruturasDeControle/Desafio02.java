package EstruturasDeControle;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o dia da semana: ");
        String dia = scan.next();

        if(dia.equals("Domingo")){
            System.out.println(1);
        } else if(dia.equals("Segunda")){
            System.out.println(2);
        } else if(dia.equals("Terca")){
            System.out.println(3);
        } else if(dia.equals("Quarta")){
            System.out.println(4);
        } else if(dia.equals("Quinta")){
            System.out.println(5);
        } else if(dia.equals("Sexta")){
            System.out.println(6);
        } else if(dia.equals("Sabado")){
            System.out.println(7);
        } else {
            System.out.println("Não foi informado um dia válido");
        }

        scan.close();
    }
    
}
