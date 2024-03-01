import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma sequência de caracteres: ");
        String sequencia = leitor.nextLine();

        int quantidadeCaracteres = sequencia.length();

        System.out.println("Quantidade de Caracteres digitados: " + quantidadeCaracteres);

        leitor.close();
    }
}