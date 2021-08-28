package fundamentos;

import javax.swing.JOptionPane;

public class StringToNum {
    public static void main(String args[]){
        String string1 = JOptionPane.showInputDialog("Primeiro Número:");
        String string2 = JOptionPane.showInputDialog("Segundo Número:");
        System.out.println(string1 + string2);
        double num1 = Double.parseDouble(string1);
        double num2 = Double.parseDouble(string2);
        System.out.println(num1 + num2);
    }
}
