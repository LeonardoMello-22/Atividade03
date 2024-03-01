import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe um numero decimal: ");
        float numeroDecimal = leitor.nextFloat();

        float quadrado = numeroDecimal * numeroDecimal;

        System.out.println("O resultado foi:" + quadrado);
        leitor.close();
    }   
}
