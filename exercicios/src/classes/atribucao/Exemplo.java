package classes.atribucao;
// import classes.atribucao.Atribuicao1.java

public class Exemplo {
    public static void main(String[] args) {
        Atribuicao1 atr = new Atribuicao1();
        Atribuicao1 atr2 = atr;
        atr2.exp8 = "Como pode ver pela alteração";

        atr.printEverything();
    }
    
}
