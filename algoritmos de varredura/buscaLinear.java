package algoritmos;

import java.util.ArrayList;
import java.util.Scanner;

public class buscaLinear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(6);
        lista.add(7);
        lista.add(4);
        lista.add(5);
        lista.add(2);


        System.out.println(lista);


        // na busca linear e realizado uma varredura na lista a fim de localizar um elemento especifico
        System.out.println("digite o elemento a ser buscado: ");
        Integer elemento = scanner.nextInt();
        boolean elementoEncontrado = false;
        for (int i = 0; i < lista.size(); i ++) {
            if (lista.get(i).equals(elemento)) {
                System.out.println("O elemento buscado esta no indice: " + i);
                elementoEncontrado = true;
                break;
            }
        }
        if (!elementoEncontrado) {
            System.out.println("O elemento nao foi encontrado ");
        }




    }
}
