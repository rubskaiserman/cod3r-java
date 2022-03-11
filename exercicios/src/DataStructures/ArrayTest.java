package DataStructures;

import java.util.Arrays;

public class ArrayTest{

    public static void main(String[] args) {
        double[] a = new double[6];

        for(int i = 10; i > 4; i--){
            a[10-i] = i;
        }

        for(int i = 0; i < 6; i++){
            System.out.println(a[i]);
        }

        System.out.println(a); //Resultado: [D@5ca881b5
        // Tendi não
        System.out.println(Arrays.toString(a));
    }


}