package POO.DesafioComposicao;

import java.util.ArrayList;

public class Compra {
    private ArrayList<Item> listaItem = new ArrayList<>();
    private double valorCompra;
    
    public Compra(ArrayList<Item> listaItem){
        this.listaItem = listaItem;
        valorCompra = setValorCompra(listaItem);    
    }

    public ArrayList<Item> getListaCompra() {
        return this.listaItem;
    }

    private double setValorCompra(ArrayList<Item> listaItem){
        double valorCompra = 0;
        for(Item item : listaItem){
            valorCompra += item.getCustoItem();
        }
        return valorCompra;
    }

    public double getValorCompra() {
        return this.valorCompra;
    }
}
