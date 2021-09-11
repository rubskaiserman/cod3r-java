package EstruturasDeControle;

public class ForStatement03 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){ //i é privada
            System.out.print("[");
            for(int j = 0; j < 5; j++){ //j é privada
                System.out.printf("(%d, %d)", i, j);
            }
            System.out.println("]");
        }
    }
    
}
