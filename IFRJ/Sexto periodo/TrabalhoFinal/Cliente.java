package TrabalhoFinal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Cliente {
    private String _cpf;
    private String _nome;
    private String _email;
    private String _plano;
    private String _dataInscricao;
    
    
    public Cliente(String cpf, String nome, String email, String dataInscricao, String plano){
        this._cpf = cpf;
        this._nome = nome;
        this._email = email;
        this._dataInscricao = dataInscricao;
        this._plano = plano;
    }
    public String getCpf(){
        return this._cpf;
    }
    public String getNome(){
        return this._nome;
    }
    public String getEmail(){
        return this._email;
    }
    public String getDate(){
        return this._dataInscricao;
    }
    public String getPlano(){
        return this._plano;
    }

    public static void registrarCliente(Statement statement, Cliente cliente) throws SQLException{
        String sqlString = String.format("INSERT INTO clientes(cpf_cliente, nome, email, data_inscricao, plano) VALUES('%s', '%s', '%s', '%s', '%s')", cliente._cpf, cliente._nome, cliente._email, cliente._dataInscricao, cliente._plano); 
        statement.execute(sqlString);

    }
    public static void removerCliente(Statement statement, String cpf) throws SQLException{
        String sqlString = String.format("DELETE FROM clientes WHERE cpf_cliente = %s", cpf); 
        statement.execute(sqlString);

    }
    public static void modificarCliente(Statement statement, int cpf, String coluna, String novoValor) throws SQLException{
        String sqlString = String.format("UPDATE clientes SET %s = %s WHERE cpf_cliente=%s", coluna, novoValor, cpf); 
        statement.execute(sqlString);
    }
    public static void getAllClients(Statement statement){
        //Retorna todos os clientes
        
    }
    public ResultSet selectCliente(Statement statement, int cpf) throws SQLException{
        String sqlString = String.format("SELECT FROM clientes WHERE cpf_cliente = %d", cpf); 
        statement.execute(sqlString);
        ResultSet clienteSet = statement.getResultSet();
        // Cliente cliente = new Cliente(clientSet[])
        return clienteSet;
    }
}

