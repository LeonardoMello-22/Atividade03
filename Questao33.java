import java.util.Scanner;
public class Questao33 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe a base: ");
        float base = leitor.nextFloat();

        System.out.print("Informe a altura: ");
        float altura = leitor.nextFloat();

        float area = (base + altura)*2;

        System.out.println("O perimetro do retângulo é " + area);

        leitor.close();
    }
}