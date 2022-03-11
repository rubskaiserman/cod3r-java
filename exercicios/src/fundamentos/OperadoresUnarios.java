package fundamentos;

public class OperadoresUnarios{
    public static void main(String args[]){
        int a = 2;
        int b = 3;
        a++; //a += 1;
        a--; //a -= 1;
        ++a; //a++; prioritário
        --a; //a--; prioritário

        System.out.println(++a == b--); // a ++ --> compara a com b e depois b --
        System.out.println(a);
        System.out.println(b);
    }
}