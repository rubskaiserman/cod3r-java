package EstruturasDeControle.lista;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class Q2 {    
    public static void main(String[] args) {    
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");  
        LocalDateTime now = LocalDateTime.now();  
        int year = Integer.parseInt(dtf.format(now));
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 == 1)){
            System.out.println("É um ano bissexto");
        }
        else{
            System.out.println("Não é um ano bissexto");
        }

  }    
}    
