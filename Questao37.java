import java.util.Scanner;
public class Questao37 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe um número decimal: ");
        double numero = leitor.nextDouble();

        long numeroArredondado = Math.round(numero);

        System.out.println("O número inteiro mais próximo é: " + numeroArredondado);

        leitor.close();
    }
}