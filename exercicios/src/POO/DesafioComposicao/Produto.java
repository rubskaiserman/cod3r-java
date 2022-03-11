package POO.DesafioComposicao;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public Produto(String nomeProduto, double precoProduto){
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }
    
    public double getPrecoProduto() {
        return precoProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    
}
