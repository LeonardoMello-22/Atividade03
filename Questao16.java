import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
   
        System.out.print("Informe seu nome: ");
        String nome = leitor.nextLine(); 

        if (nome.length() > 5){
            System.out.println("Possui mais que 5 caracteres");
        }else if (nome.length() < 5){
            System.out.println("Possui menos que 5 caracteres");
        }else{
            System.out.println("possui 5 caracters");
        }
        leitor.close();
    }
    }
    
