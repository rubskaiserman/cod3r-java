package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args){
        
        byte anosDeEmpresa = 127; //Range = -128 -- +127
        short numeroDeVoos = 32767; //range = -32768 -- +32767
        int id = 2147483647; //range = -2147483647 -- +2147483647
        long pontosAcumulados = 2939896365373289129L; //Range = Muita coisa

        float salario = 12346.95F; //Tem que ter o F no final
        double kmPercorrido = 98765671209936612.5; //Range = 2float

        boolean ferias = true; //aceita somente true or false. Nada de 0 ou 1

        char nota = 'S'; //Somente um caracter

        System.out.println("Id: " + id);        
        System.out.println("Dias de empresa: " + (anosDeEmpresa * 365));
        System.out.println("Numero de Voos: " + numeroDeVoos);
        System.out.println("Pontos acumulados: " + pontosAcumulados);
        System.out.println("Salário: " + salario);
        System.out.println("Distância percorrida: " + kmPercorrido);
        System.out.println("Situação: " + ferias);
        System.out.println("Nota: " + nota);
        
    }
    
}
