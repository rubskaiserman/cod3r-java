package fundamentos;

public class TipoString {
    public static void main(String[] args){
        String string = "Hello, World"; //String é um objeto imutavel, mas não sei o que isso significa exatamente.
        System.out.println(string.concat("!"));
        System.out.println(string.startsWith("Hello")); //Pode colocar a string inteira e ainda vai ser true
        System.out.println(string.length()); //O clássico medidor de tamanho
        System.out.println(string.equals("Hello, World"));
        System.out.println(string.equalsIgnoreCase("HELLO, WORLD"));

        String nome = "Rubens";
        String sobrenome = "Kaiserman";
        int idade = 17;

        System.out.printf("Nome: %s %s\nIdade: %d\n", nome, sobrenome, idade ); //Assim é formatada a f-string

        String fstring = String.format("Pode-se utilizar essa formatação aqui %s", idade);
        System.out.println(fstring);
    }
    
}
