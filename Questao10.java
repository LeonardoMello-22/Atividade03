import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("informe seu sobrenome: ");
        String sobrenome = leitor.nextLine();

        System.out.println(sobrenome + " " + nome);
        leitor.close();
    }
}