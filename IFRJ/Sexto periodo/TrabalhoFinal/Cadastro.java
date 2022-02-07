package TrabalhoFinal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cadastro{
    public static void main(String[] args) {
        try {  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_clientes", "registrador", "loucuras_de_amor");
            System.out.println("Conexão feita com sucesso");
            Statement cmd = conn.createStatement();
            cmd.execute("INSERT INTO clientes(cpf_cliente) VALUES('192912981291');");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}