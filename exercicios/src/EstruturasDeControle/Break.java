package EstruturasDeControle;

public class Break{
    public static void main(String[] args){
        int i = 0;
        for(i = 0; i < 10; i++){
            if(i == 5){
                break;
            }
        }
        System.out.printf("Você saiu do loop com i = %d", i );
        System.out.println();
    }
    
}