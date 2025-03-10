import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 2 valores para serem mostrados");
        int primeiroNumero ;
        int segundoNumero ;
        int varTermp;

        primeiroNumero=leitor.nextInt();
        segundoNumero=leitor.nextInt();

        System.out.println("O primeiro valor informado foi de "+primeiroNumero);
        System.out.println("O segundo valor informado foi de "+segundoNumero);

        System.out.println("Trocando os valores");

        varTermp= primeiroNumero;
        primeiroNumero=segundoNumero;
        segundoNumero=varTermp;

        System.out.println("O primeiro valor informado foi de "+primeiroNumero);
        System.out.println("O segundo valor informado foi de "+segundoNumero);
    }
}
