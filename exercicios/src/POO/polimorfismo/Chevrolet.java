package POO.polimorfismo;

public class Chevrolet extends Carro {
    private int ano;

    Chevrolet(){
        super(240);
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
