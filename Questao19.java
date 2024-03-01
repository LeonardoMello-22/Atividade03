import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o nome da cidade: ");
        String nomeCidade = leitor.nextLine().trim(); // Remover espaços em branco

        char letra = 's';

        if (!nomeCidade.isEmpty() && Character.toUpperCase(nomeCidade.charAt(0)) == Character.toUpperCase(letra)) {
            System.out.println("O nome da cidade começa com a letra " + letra);
        } else {
            System.out.println("O nome da cidade não começa com a letra " + letra);
        }

        leitor.close();
    }
}