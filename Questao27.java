import java.util.Scanner;
public class Questao27 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = leitor.nextLine();

        System.out.print("Digite o preço do produto: ");
        float numero = leitor.nextFloat();

        leitor.nextLine();

        String mensagem = "O(A) " + produto + ", custa R$" + numero;
        System.out.println(mensagem);

        leitor.close();
    }
}