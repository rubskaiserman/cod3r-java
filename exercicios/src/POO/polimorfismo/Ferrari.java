package POO.polimorfismo;

public class Ferrari extends Carro {
    private int ano;
    private String modelo;

    public Ferrari(int potencia, int velocidadeMaxima, int ano, String modelo){
        this.ano = ano;
        this.modelo = modelo;
        super.setPotencia(potencia);
        super.setVelocidadeMaxima(velocidadeMaxima);
    }
    public int getAno() {
        return ano;
    }
    public String getModelo() {
        return modelo;
    }
    @Override
    public int getVelocidadeMaxima() {
        return super.getVelocidadeMaxima();
    }
    @Override
    public int getPotencia() {
        return super.getPotencia();
    }
}
