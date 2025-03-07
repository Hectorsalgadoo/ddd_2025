import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //comentario de lina
        /*
        comentario
         de bloco
         */

        //sout
        Scanner leitor = new Scanner(System.in);
        System.out.println("bom dia!");
        System.out.println("Digite seu nome:");
       // System.out.println("Digite seu telefone:");
        System.out.println("Digite seu idade:");
        String nome, telefone;
        int idade;

        nome = leitor.nextLine();
        //telefone = leitor.next();
        idade = leitor.nextInt();

        System.out.println("Bom dia seu nome e "+nome+"!");
        //System.out.println(telefone);
        System.out.println("Seu telefone e " +idade);

    }

}
