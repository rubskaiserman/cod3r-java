package POO.polimorfismo;

public class Ferrari extends Carro {
    private int ano;
    private String modelo;

    public Ferrari(int ano, String modelo){
        super(320);
        super.fatorAceleracao = 15;
    }
    
    public int getAno() {
        return ano;
    }
    public String getModelo() {
        return modelo;
    }
}
