package fundamentos;

public class ConverteTemperatura {
    public static void main(String[] args){
        final double MULTIPLY = 5/9.0; 
        final int SUBTRACTION = 32;
        double fahrenheit = 78;
        double celcius = (fahrenheit - SUBTRACTION) * MULTIPLY;

        System.out.println("°Celcius = " + celcius);
        
    }
}
