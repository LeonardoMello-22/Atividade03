import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma sequencia de números");
        String sequencia = leitor.nextLine();

        String[] numeros = sequencia.split(" ");
        int quantidadeNumeros = numeros.length;

        System.out.println("Quantidade de números digitados: " + quantidadeNumeros);

        leitor.close();
    }
}
    