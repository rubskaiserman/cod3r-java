package EstruturasDeControle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        int batata = 4;
        switch(batata){
            case 4:
                System.out.println(4); //Roda todos os posteriores até o break ou até acabar
            case 3:
                System.out.println(3);
            case 2:
                System.out.println(2);
            case 1:
                System.out.println(1);
            case 0:
                System.out.println(0);
            default:
                System.out.println("negativos...");
        }
    }
    
}
