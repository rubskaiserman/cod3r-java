package classes.produto;

public class Compras {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.name = "Celular";
        produto.price = 999.99;
        produto.discount = 0.10;

        System.out.println(produto.name);
        System.out.println(produto.price);

    }

}
