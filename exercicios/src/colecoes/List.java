package colecoes;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Usuario> list = new ArrayList<Usuario>();

        list.add(new Usuario("Rubens"));
        list.add(new Usuario("Roberta"));
        list.add(new Usuario("Greg"));
        list.add(new Usuario("Loss"));

        for(Usuario nome : list){
            System.out.println(nome);
        }
        System.out.println();
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.remove(1);

        System.out.println(list.get(1));


    }
    
}
