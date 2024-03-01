import java.util.Scanner;
public class Questao35 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("informe sua idade: ");
        int idade = leitor.nextInt();

        int dias = idade * 365;

        System.out.println("Você viveu " + dias + " dias.");

        leitor.close();
    }
}