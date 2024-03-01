import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
   
        System.out.print("Informe seu nome: ");
        String nome = leitor.nextLine(); 

        System.out.println("Bem-vindo: " + nome);
        leitor.close();
    }
}