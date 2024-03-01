import java.util.Scanner;
public class Questao38 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = leitor.nextInt();

        System.out.print("Informe o terceiro número: ");
        int numero3 = leitor.nextInt();

        int conta = (numero1 + numero2) * numero3;

        System.out.println("O resultado deu:" + conta);

        leitor.close();
    }
}