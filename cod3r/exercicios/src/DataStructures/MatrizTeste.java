package DataStructures;

import java.util.Arrays;

public class MatrizTeste {

    public static void main(String[] args) {
        double[][][][] a = new double[5][5][5][5];
        double b = 0;
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 5; k++){
                    for(int l = 0; l < 5; l++){
                        a[i][j][k][l] = b;
                        b++;
                        // System.out.println(b);
                    }
                }
            }
        }
        // System.out.println(Arrays.toString(a));
    }
}
