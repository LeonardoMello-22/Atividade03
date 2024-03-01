import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String numeroString = leitor.nextLine();

        int numeroInt = Integer.parseInt(numeroString);

        int soma = numeroInt + 10;

        String resultado = Integer.toString(soma); 

        System.out.println(resultado);

        leitor.close();
    }
}