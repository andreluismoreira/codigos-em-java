import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado= new  Scanner (System.in);
        System.out.println("digite o seu nome:" );
        String nome = teclado.next ();
        System.out.println(" digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println(" O nome digitado foi: "+ nome);
        System.out.println(" A idade digitada  foi: "+ idade);

    }
}
