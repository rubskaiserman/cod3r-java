package classes;

public class DesafioTrauma {

    int a = 3; // If I could turn it into a static variable it would work
    public static void main(String[] args){ //Static is the problem {
        // int a = 3;
        DesafioTrauma teste = new DesafioTrauma();
        System.out.println(teste.a);
    }
    
}
