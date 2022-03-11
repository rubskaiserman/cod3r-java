package EstruturasDeControle;

import java.util.Scanner;

public class WhileStructure02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = "";
        while(!text.equalsIgnoreCase("sair")){
            System.out.print("Você diz: ");
            text = scan.nextLine();
            System.out.println();
            System.out.println(text);
            System.out.println();
            System.out.println();
        }

        scan.close();
    }
}
