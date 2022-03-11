package EstruturasDeControle.lista;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gimme a word or I'll punish you: ");
        String word = sc.next();
        for(char letter : word.toCharArray()){
            System.out.println(letter);
        }

        sc.close();
    }
}
