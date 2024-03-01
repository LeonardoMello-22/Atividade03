import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o ano: ");
        int ano = leitor.nextInt();

        int idade = 2024 - ano;

        System.out.println("A idade é: " + idade + " anos");
        leitor.close();
    }
}
