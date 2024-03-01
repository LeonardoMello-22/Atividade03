import java.util.Scanner;
public class Questao18 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int base = 12;

        int altura = 14;

        int area = (base * altura)/2;

        System.out.println("A area do triângulo é " + area);

        leitor.close();
    }
;}