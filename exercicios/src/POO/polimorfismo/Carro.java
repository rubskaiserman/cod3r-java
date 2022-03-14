package POO.polimorfismo;

public class Carro{
    private int velocidadeAtual = 0;
    protected int fatorAceleracao = 5;
    public final int VELOCIDADE_MAX;

    Carro(int velocidadeMaxima){
        this.VELOCIDADE_MAX = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(){
        // this.setVelocidadeAtual(velocidadeAtual + fatorAceleracao);
        int novaVelocidade = this.velocidadeAtual <= VELOCIDADE_MAX - fatorAceleracao ? this.velocidadeAtual + fatorAceleracao : this.VELOCIDADE_MAX;
        setVelocidadeAtual(novaVelocidade);
    }
    public void desacelerar(){
        int novaVelocidade = this.velocidadeAtual >= fatorAceleracao ? this.velocidadeAtual - fatorAceleracao : 0;
        setVelocidadeAtual(novaVelocidade);
    }
    
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}