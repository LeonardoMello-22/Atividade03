import java.util.Scanner;
public class Questao39 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe a temperatura em celsius: ");
        int celsius = leitor.nextInt();

        double fahrenheit = (celsius*9/5)+32.;

        System.out.println("está " + fahrenheit + " graus Fahrenheit.");

        leitor.close();
    }
}