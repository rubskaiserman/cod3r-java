package fundamentos;

public class PrimitivoVsObjeto{
    public static void main(String[] args){
        int num = 3; //Tipo primitivo
        String string = new String("string"); //classe

        System.out.println(num + " " +string);
        //Tipos primitivos não tem métodos
        //Tipos primitivos só tem um atributo que é seu valor associado
        //Wrappers são um tipo de versão objeto dos tipos primitivos
    }
}