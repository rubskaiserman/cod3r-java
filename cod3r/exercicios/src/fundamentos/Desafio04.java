package fundamentos;

public class Desafio04 {
    public static void main(String args[]){
        boolean trabalho01 = false;
        boolean trabalho02 = true;

        boolean tv50 = trabalho01 && trabalho02;
        // boolean tv32 = (trabalho01 || trabalho02) && !tv50;
        boolean tv32 = trabalho01 ^ trabalho02; //xor resulta em true quando há apenas um true no par
        boolean sorvete = tv32 || tv50;

        System.out.println("Trabalho 1: " + trabalho01);
        System.out.println("Trabalho 2: " + trabalho02);
        System.out.println("TV 32\": " + tv32);
        System.out.println("TV 50\": " + tv50);
        System.out.println("Sorvete: " + sorvete);
        
    }
}
