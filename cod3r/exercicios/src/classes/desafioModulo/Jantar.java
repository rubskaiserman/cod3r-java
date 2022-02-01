package classes.desafioModulo;

public class Jantar {
    public static void main(String[] args){
        Comida macarronada = new Comida("Macarronada", 0.6);
        Comida boloComSorvete = new Comida("Bolo com Sorvete", 0.1);
        Pessoa marcos = new Pessoa("Marcos", 87);
        marcos.comer(macarronada);
        marcos.comer(boloComSorvete);
        System.out.println(marcos.weight);
    }
    
}
