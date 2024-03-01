import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numeroInteiro  = leitor.nextInt();

        float numeroFloat = (float) numeroInteiro;
        System.out.println(+numeroFloat); 
        leitor.close();
    }   
}
