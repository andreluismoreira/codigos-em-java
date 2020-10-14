package JogoVelha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class jogoDaVelha {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
    private void imprimeMatriz () {
        for( int i = 0; i < matriz.size(); i ++) {
            System.out.println(matriz.get(i));
        }
    }
    private String solicitarJogada (){
        imprimeMatriz();
        System.out.println("vamos jogar ? utilize apenas numeros seguindo o modelo(linha desejada-coluna desejada)");
        return scanner.nextLine();
    }

    public void iniciar(){
        ArrayList<String> linha1 = new ArrayList<String>(Arrays.asList("-", "-", "-"));
        ArrayList<String> linha2 = new ArrayList<String>(Arrays.asList("-", "-", "-"));
        ArrayList<String> linha3 = new ArrayList<String>(Arrays.asList("-", "-", "-"));

        matriz.add(linha1);
        matriz.add(linha2);
        matriz.add(linha3);

        boolean houveVencedor = false;
        boolean vezJogador1 = true;
        for (int i = 0; i < 9; i ++) {
            String jogada = solicitarJogada();
            // quebra os valores digitados para linha e coluna da matriz
            Integer linha = Integer.valueOf(jogada.split("-")[0]);
            Integer coluna = Integer.valueOf((jogada.split("-")[1]));

            if (vezJogador1) {
                matriz.get(linha).set(coluna,"X");
            } else {
                matriz.get(linha).set(coluna,"O");
            }
            if (verificarVencedor()) {
                houveVencedor = true;
                String vencedor = vezJogador1 ? "1" : "2";
                imprimeMatriz();
                System.out.println("o jogador" + vencedor + ", Venceu !!!");
                break;
            }
            vezJogador1 = !vezJogador1;
            }
            if (!houveVencedor) {
                imprimeMatriz();
                System.out.println("Empate, não houve vencedor");
            }
        }

    private boolean verificarVencedor() {
        for (int i = 0; i < 3; i++) {
            //verificando vitoria na horizontal
            String horizontal1 = matriz.get(i).get(0);
            String hotizontal2 = matriz.get(i).get(1);
            String horizontal3 = matriz.get(i).get(2);

            if (!horizontal1.equals("-") && horizontal1.equals(hotizontal2) && horizontal1.equals(horizontal3)) {
                return true;
            }
            //verificando vitoria na vertical
            String vertical1 = matriz.get(0).get(i);
            String vertical2 = matriz.get(1).get(i);
            String vertical3 = matriz.get(2).get(i);

            if (!vertical1.equals("-") && vertical1.equals(vertical2) && vertical1.equals(vertical3)) {
                return true;
            }
        }

        String diagonal1 = matriz.get(0).get(0);
        String diagonal2 = matriz.get(1).get(1);
        String diagonal3 = matriz.get(2).get(2);

        if (!diagonal1.equals("-") && diagonal1.equals(diagonal2) && diagonal1.equals(diagonal3)) {
            return true;
        }

        String diagonalInvertida1 = matriz.get(0).get(2);
        String diagonalInvertida2 = matriz.get(1).get(1);
        String diagonalInvertida3 = matriz.get(2).get(0);

        if (!diagonalInvertida1.equals("-") && diagonalInvertida1.equals(diagonalInvertida2) && diagonalInvertida1.equals(diagonalInvertida3)) {
            return true;
        }


        return false;
    }
}



