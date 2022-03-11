package POO.DesafioComposicao;

public class Item {
    private int qtd;
    private Produto produto;
    private double custoProduto;

    public Item(Produto produto, int qtd){
        this.qtd = qtd;
        this.produto = produto;
        custoProduto = produto.getPrecoProduto() * qtd;
    }

    public Produto getProduto() {
        return produto;
    }
    public int getQtd() {
        return qtd;
    }
    public double getCustoItem() {
        return custoProduto;
    }
}
