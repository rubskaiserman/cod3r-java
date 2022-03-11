package colecoes;

import java.util.HashSet;
// import java.util.Set;

public class MessySet{
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String args[]){

        HashSet hashSet = new HashSet();
        hashSet.add('a');
        hashSet.add(1);
        hashSet.add(99.6);
        hashSet.add("OIOIOI");
        hashSet.add(99.6);

        int length = hashSet.size();
        System.out.println("O tamanho é:" + length);

        System.out.println(hashSet.remove("OIOIOI"));
        System.out.println(hashSet.size());

        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains("OIOIOI"));

        // Set teste = new HashSet();

        System.out.println(hashSet);
    }
}