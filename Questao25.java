import java.util.Scanner;
public class Questao25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o ano de seu nascimento: ");
        String ano = leitor.nextLine();

        String mensagem = ("Bem vindo ao nosso programa, nascido em " + ano);
        System.out.println(mensagem);

        leitor.close();
    }
}