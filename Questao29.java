import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
   
        System.out.print("Informe seu email: ");
        String email = leitor.nextLine(); 

        System.out.println("Bem-vindo " + email + " sua presença faz nossa alegria." );
        leitor.close();
    }
}