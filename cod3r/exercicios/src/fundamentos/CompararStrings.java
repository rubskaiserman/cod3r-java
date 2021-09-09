package fundamentos;

import java.util.Scanner;

public class CompararStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.print("Insira uma String: "); 
            String string = scan.next(); //é inserido "string"
            System.out.println("string" == string); //--> false
            System.out.println(string.equals("string"));//-->true
        scan.close();
    }
    
}
