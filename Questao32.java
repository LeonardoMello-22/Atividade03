import java.util.Scanner;
public class Questao32 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe o raio: ");
        float raio = leitor.nextFloat();

        double perimetro = 2 * 3.14 * raio;

        System.out.println("O perimetro da circunferência é " + perimetro);

        leitor.close();
    }
}