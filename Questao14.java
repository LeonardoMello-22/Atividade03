import java.util.Scanner;
public class Questao14 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero1 = leitor.nextInt();

    System.out.print("Digite o segundo número");
    int numero2 = leitor.nextInt();

    int maiorNumero = Math.max(numero1 , numero2);

    System.out.println("O maior número é: " + maiorNumero);

    leitor.close();
    }
}
