import java.util.Scanner;
public class Questao20 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe o dividendo: ");
        float dividendo = leitor.nextFloat();

        System.out.print("Informe o divisor: ");
        float divisor = leitor.nextFloat();

        float resto = dividendo % divisor;

        System.out.println("A area do triângulo é " + resto);

        leitor.close();
    }
;}