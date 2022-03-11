package classes.desafioModulo;

public class Pessoa {
    public String name;
    public double weight;

    public void comer(Comida comida){
        this.weight += comida.weight;
    }

    public Pessoa(String name, double weight){
        this.name = name;
        this.weight = weight;

    }
}
