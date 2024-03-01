import java.util.Scanner;
public class Questao26 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu numero da sorte: ");
        int numero = leitor.nextInt();

        leitor.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        String mensagem = "Olá " + nome + ", seu número da sorte é " + numero + ".";
        System.out.println(mensagem);

        leitor.close();
    }
}