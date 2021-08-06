package fundamentos;

public class Wrapper {
    public static void main(String[] args){
        //Wrappers são classes com tipos primitivos inseridos
        //Wrappers tem o objetivo de chamar funções com base no valor da variável
        //Toda a variável em python é um Wrapper
        Integer i = 18;
        // String string = '12';
        System.out.println(i.intValue());
        System.out.println(Integer.valueOf(12));
        System.out.println(Integer.valueOf("12"));
        System.out.println(Integer.parseInt("16"));
        //Por aí vai
    }
    
}
