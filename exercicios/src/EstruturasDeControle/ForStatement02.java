package EstruturasDeControle;

public class ForStatement02{
    public static void main(String[] args){
        System.out.println();
        for(int i = 10; i>=0; i-=2){ //Detalhe importante o i funciona como variavel privada quando declarado dessa forma
            System.out.println("Hello World " + i);
        }
        System.out.println();
    }
}