package TrabalhoFinal;

import java.sql.Date;

public class Cliente {
    private int _cpf;
    private String _nome;
    private String _email;
    private String _plano;
    private Date _dataInscricao;
    
    
    public Cliente(int cpf, String nome, String email, Date dataInscricao, String plano){
        this._cpf = cpf;
        this._nome = nome;
        this._dataInscricao = dataInscricao;
        this._plano = plano;
    }
    public int getCpf(){
        return this._cpf;
    }
    public String getNome(){
        return this._nome;
    }
    public String getEmail(){
        return this._email;
    }
    public Date getDate(){
        return this._dataInscricao;
    }
    public String getPlano(){
        return this._plano;
    }

    public static void registrarCliente(Cliente cliente){
        //Registra o Cliente na base de dados

    }
    public static void removerCliente(int cpf){
        //Apaga o cliente da base de dados

    }
    public static void modificarCliente(int cpf, String coluna, String novoValor){
        //Altera os dados do cliente
    }
    public static void getAllClients(){
        //Retorna todos os clientes
    }
    public void selectCliente(int cpf){
        //Retorna um cliente especifico
    }
}

