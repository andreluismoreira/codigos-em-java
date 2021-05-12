package View;

import Model.AbstractMazeFactory;
import Model.EnchantedMazeFactory;
import Model.MazeFactory;
import Model.MazeGame;

import java.util.Scanner;

public class App {

    public static MazeGame Creator(String typo) {
        AbstractMazeFactory amf = null;
        if (typo.compareTo("common") == 0)
            amf = new MazeFactory();

        else if (typo.compareTo("enchanted") == 0)
            amf = new EnchantedMazeFactory();


        MazeGame  mazeGame = amf.getmaze();
        return mazeGame;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tipo de labirinto que voce deseja montar [common|enchanted]: ");
        String typo = sc.nextLine();

        MazeGame mazeGame = Creator(typo);


        sc.close();
    }


}
