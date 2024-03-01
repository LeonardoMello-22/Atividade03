import java.util.Scanner;
public class Questao30 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe um número ");
        int numero1 = leitor.nextInt();

        System.out.print("Informe outro número: ");
        int numero2 = leitor.nextInt();

        int soma = numero1 + numero2;
        int diferença = numero1 - numero2;
        int produto = numero1 * numero2;
        int quociente = numero1 / numero2;

        System.out.println("A soma deu: " + soma);
        System.out.println("A diferença deu: " + diferença);
        System.out.println("O produto deu: " + produto);
        System.out.println("O quociente deu: " + quociente);

        leitor.close();
    }
;}