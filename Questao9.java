import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
   
        System.out.print("Informe o animal: ");
        String animal = leitor.nextLine(); 

        System.out.println("O animal escolhido foi: " + animal);
        leitor.close();
    }
}