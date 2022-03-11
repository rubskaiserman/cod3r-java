package POO.DesafioComposicao;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<Compra> listaCompra = new ArrayList<>();

    public Cliente(String nome){
        this.nome = nome;
        // this.listaCompra = listaCompra;
    }

    public String getNome() {
        return nome;
    }
    public ArrayList<Compra> getListaCompra() {
        return listaCompra;
    }
    public void setListaCompra(ArrayList<Compra> listaCompra) {
        this.listaCompra = listaCompra;
    }

}
