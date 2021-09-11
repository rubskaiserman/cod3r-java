package EstruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        String conceito = "";
        switch(i){
            case 10:
                conceito = "A";
                break;
            case 9: case 8:
                conceito = "B";
                break;
            case 7: case 6:
                conceito = "C";
                break;
            case 5: case 4:
                conceito = "D";
                break;
            case 3: case 2:
                conceito = "E";
                break;
            case 1:
                conceito = "F";
                break;
            default:
                conceito = "Nota não atribuída";    
        }
        System.out.println(conceito);

        scan.close();
    }
    
}
