package classes.produto;

public class Produto{
    public String name;
    public double price;
    public static double discount = 0.25;

    public Produto(String name, double price){
        this.name = name;
        this.price = price * (1 - discount);
    }
}