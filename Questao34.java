import java.util.Scanner;
public class Questao34 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe o primeiro número: ");
        float numero1 = leitor.nextFloat();

        System.out.print("Informe o segundo número: ");
        float numero2 = leitor.nextFloat();

        System.out.print("Informe o terceiro número: ");
        float numero3 = leitor.nextFloat();

        float media = (numero1 + numero2 + numero3)/3;

        System.out.println("A média dos números é " + media);

        leitor.close();
    }
}