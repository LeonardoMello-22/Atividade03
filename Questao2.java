import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        String idadeTexto = leitor.nextLine();

        int idade = Integer.parseInt(idadeTexto);
        System.out.println("A idade informada foi:" +idade); 
        leitor.close();
    
}
}