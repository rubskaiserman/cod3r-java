package POO.DesafioComposicao;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Rubens");

        Item item1 = new Item(new Produto("Escova de Dentes", 5.99), 3);
        Item item2 = new Item(new Produto("Desodorante", 8.99), 2);
        Item item3 = new Item(new Produto("Caneta Bic", 1.99), 1);

        ArrayList<Item> listaItem = new ArrayList<>();
        listaItem.add(item1);
        listaItem.add(item2);
        listaItem.add(item3);
        Compra compra = new Compra(listaItem);
        
        ArrayList<Compra> listaCompra = new ArrayList<>();
        listaCompra.add(compra);

        c1.setListaCompra(listaCompra);

        for(Compra compras: listaCompra){
            System.out.println(compras.getValorCompra());
        }
    }


}
