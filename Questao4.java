import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = leitor.nextInt();
        
        System.out.print("Informe o valor de B: ");
        int b = leitor.nextInt();

        int soma = a + b;
        System.out.println("A soma deu: " + soma);

        leitor.close();
    }
    
}
