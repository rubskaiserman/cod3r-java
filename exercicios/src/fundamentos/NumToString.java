package fundamentos;

public class NumToString {
    public static void main(String args[]){
        Integer num = 127243;
        String string = num.toString();
        //Convertendo int para string e salvando na String string
        System.out.printf("número: %d \nTamanho: %d", num, string.length());
        System.out.println();
    }

    
}
