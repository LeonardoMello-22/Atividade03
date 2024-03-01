import java.util.Scanner;
public class Questao36 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe o valor em R$: ");
        int real = leitor.nextInt();

        double dolar = (real / 4.95);

        System.out.println("Você tem " + dolar + " dolares.");

        leitor.close();
    }
}