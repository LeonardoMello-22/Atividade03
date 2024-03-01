import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe seu estado civil: ");
        String estadoCivil = leitor.nextLine();

        if("casado" .equalsIgnoreCase(estadoCivil)){
            System.out.println("Você é casado");
        }else if("solteiro".equalsIgnoreCase(estadoCivil)){
            System.out.println("Você é solteiro");
        }else if("divorciado" .equalsIgnoreCase(estadoCivil)){
            System.out.println("Você é divorciado");  
        }else if("viuviuvovo" .equalsIgnoreCase(estadoCivil)){
            System.out.println("Você é viúvo");
        }else{
            System.out.println("Estado civil não reconhecido");
        }
    leitor.close();
    }
}
