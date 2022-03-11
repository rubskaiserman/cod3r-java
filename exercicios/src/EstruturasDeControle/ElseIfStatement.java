package EstruturasDeControle;

import javax.swing.JOptionPane;

public class ElseIfStatement {
    public static void main(String[] args) {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota: "));
        
        if(nota >= 8.0){
            System.out.println("A");
        } else if(nota >= 7) {
            System.out.println("B");
        } else if(nota >= 7) {
            System.out.println("C");
        } else if(nota >=6) {
            System.out.println("D");
        } else if(nota >= 5){
            System.out.println("E");
        }else{
            System.out.println("F");
        }
        //É como se tivesse um if e else dentro de um else
        //Abre o bloco do else e ele executa um if
    }
}
