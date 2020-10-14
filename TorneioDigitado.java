import java.util.Scanner;

public class TorneioDigitado {
    public static void main(String[] args) {
        Scanner input= new  Scanner (System.in);
        System.out.println("Digite seu Nome: ");
        String nome = input.next ();
        System.out.println("Digite sua Idade: ");
        int idade = input.nextInt();
        if (idade <= 10) {
            System.out.println(nome + " Categoria Infantil");
        } else if ((idade >= 11) && (idade <= 15)) {
            System.out.println(nome + " categoria Juvenil");
        } else if (idade > 15 && (idade <= 19)) {
            System.out.println(nome + " Categoria Pré Adulto");
        }else {
            System.out.println( nome + (" Categoria Adulto"));
        }
    }
}

