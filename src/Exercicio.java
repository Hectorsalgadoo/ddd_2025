import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bom dia digite o valor que deseja sacar !");
        int valor;
        valor = leitor.nextInt();

        int notasDeCinquenta = valor/50;
        int resCinquenta= valor%50;
        System.out.println("Serao apenas "+notasDeCinquenta+" notas de $50 reias");


        int notasDeVinte = resCinquenta/20;
        int restoVinte = resCinquenta%20;
        System.out.println("Serao apenas "+notasDeVinte+" notas de $20 reias");


       int notasDeDez = restoVinte/10;
       System.out.println("Serao apenas "+notasDeDez+" notas de $10 reias");


    }
}
