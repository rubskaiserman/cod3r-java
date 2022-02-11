package TrabalhoFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
                System.out.println("\n\n");
                
                System.out.print("Selecione: ");
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


    private static Cliente criarCliente(Scanner scanner){
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.println();
        System.out.print("Nome do Cliente: ");
        String nome = scanner.nextLine();
        System.out.println();
        System.out.print("Email do cliente: ");
        String email = scanner.nextLine();
        System.out.println();
        System.out.print("Plano do cliente(Padrão, Ouro, Diamante ou Platina): ");
        String plano = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dataInscricao = formatter.format(LocalDate.now());

        return new Cliente(cpf, nome, email, dataInscricao, plano);
    }
    public static void main(String[] args) {
        try {  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_clientes", "registrador", "loucuras_de_amor");
            Statement cmd = conn.createStatement();
            Scanner scan = new Scanner(System.in);
            int op = getOption(scan);

            switch(op){
                case 1:
                    Cliente cliente = criarCliente(scan);
                    Cliente.registrarCliente(cmd, cliente);

                    break;
                case 2:
                System.out.print("Insira o cpf do cliente (Apenas os números): ");
                String cpf = scan.next();
                Cliente.removerCliente(cmd, cpf);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}