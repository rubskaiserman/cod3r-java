package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.println(nome);

        scan.close();//Scanners precisam ser fechados

    }
    
}
