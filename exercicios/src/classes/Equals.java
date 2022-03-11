package classes;

public class Equals{
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Rubens", "rubskaiserman@gmail.com");
        Usuario user2 = new Usuario("Rubens", "rubskaiserman@gmail.com");

        System.out.println(user1.equals(user2));
    }
}