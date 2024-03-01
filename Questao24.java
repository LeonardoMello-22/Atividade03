import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome da sua cidade: ");
        String cidade = leitor.nextLine();

        System.out.print("Digite o nome do seu estado: ");
        String estado = leitor.nextLine();

        String mensagem = "Você mora em " + cidade + ", " + estado + ".";
        System.out.println(mensagem);

        leitor.close();
    }
}