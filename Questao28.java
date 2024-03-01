import java.util.Scanner;
public class Questao28 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado = leitor.nextInt();

        int numero = numeroDigitado * 2;

        String mensagem = "Você tinha " + numeroDigitado + ", e ficou com " + numero + ".";
        System.out.println(mensagem);

        leitor.close();
    }
}