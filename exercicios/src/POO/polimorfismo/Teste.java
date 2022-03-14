package POO.polimorfismo;

public class Teste {
    public static void main(String[] args) {
        Carro ferrari = new Ferrari(2020, "Alguma");
        ferrari.acelerar();
        System.out.println(ferrari.getVelocidadeAtual());
        Carro chevrolet = new Chevrolet();
        chevrolet.acelerar();
        System.out.println(chevrolet.getVelocidadeAtual());
    }
    
}
