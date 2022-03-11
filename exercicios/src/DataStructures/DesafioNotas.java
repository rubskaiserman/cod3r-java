package DataStructures;

import java.util.Scanner;

public class DesafioNotas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas notas gostaria de inserir?");
        int length = scan.nextInt();
        System.out.println();
        double[] notas = new double[length];
        for(int i = 0; i<length; i++){
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = scan.nextDouble();
        }

        double total = 0;
        for(double nota: notas){
            total += nota;
        }
        System.out.println(total / length);





        scan.close();
    }
    
    
}
