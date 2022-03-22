package lambdas.calculo;

public class Teste {
    public static void main(String[] args) {
        Calculo calc = (a, b) -> a + b;
        System.out.println(calc.calculo(1, 2));
    }
    
}
