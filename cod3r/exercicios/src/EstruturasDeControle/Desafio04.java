package EstruturasDeControle;

public class Desafio04 {
    public static void main(String[] args){
        // String string = "#";
        // for(;!string.equals("######");){
        //     System.out.println(string);
        //     string +="#";
        // }
        for(String string = "#"; !string.equals("######"); string += "#"){ //Código mais conciso
            System.out.println(string);
        }
    }
    
}
