import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        float numeroFloat = leitor.nextFloat();

        int numeroInt = (int) numeroFloat;
        System.out.println("O inteiro do número é: " + numeroInt);

        leitor.close();
    }
}