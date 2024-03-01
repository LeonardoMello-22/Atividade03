import java.util.Scanner;
public class Questao15 {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite a altura: ");
    float altura = leitor.nextFloat();

    System.out.print("Digite o peso: ");
    float peso = leitor.nextFloat();

    float imc = peso/(altura*altura);

    System.out.println("O imc é: " + imc);

    leitor.close();
    }
}
