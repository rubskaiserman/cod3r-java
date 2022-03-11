package fundamentos;

public class ConverterTipos {
    public static void main(String args[]){
        int a = 12;
        byte b = (byte) a;
        //comversão explicita de int para byte

        float c = (float) b;
        c = (float) c + 1.123466666777777776f; //res: 13.1234665
        // System.out.println(c);
        
    }
    
}
