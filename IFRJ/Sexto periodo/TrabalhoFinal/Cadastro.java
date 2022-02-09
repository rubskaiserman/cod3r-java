package TrabalhoFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Cadastro{

    private static int getOption(Scanner scan){
     boolean test = false;
     int res = -1;
        
        while(!test){
            try {
                System.out.println("1 - Inserir novo Cliente");
                System.out.println("2 - Remover registro de cliente");
                System.out.println("3 - Alterar registro de cliente");
                System.out.println("4 - Ver registro do cliente");
                System.out.println("0 - Verificar todos os clientes");
        
                res = scan.nextInt();
                test = res <= 4 && res >=0;
                if(!test){
                    System.out.println("Valor não identificado, tente novamente\n \n \n \n \n");
                }
                
            } catch (Exception e) {
                System.out.println("Valor não identificado, tente novamente");
            }

        }
        return res;
    }

    public static void main(String[] args) {
        try {  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_clientes", "registrador", "loucuras_de_amor");
            Statement cmd = conn.createStatement();
            Scanner scan = new Scanner(System.in);
            int op = getOption(scan);




        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}