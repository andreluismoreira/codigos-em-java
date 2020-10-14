import java.util.ArrayList;
import java.util.Arrays;

public class matriz {
    public static void main (String [] args) {
        ArrayList<ArrayList<Double>> matriz = new ArrayList<ArrayList<Double>>();

        // criando linha adicionando itens e inserindo na matriz
        ArrayList<Double> linha1 = new ArrayList<>();
        linha1.add(8.0);
        linha1.add(10.0);
        linha1.add(7.0);
        linha1.add(6.5);
        matriz.add(linha1);

        // forma mais rapida de criar ArraydeArray e inserir na matriz
        ArrayList<Double> linha2 = new ArrayList<>(Arrays.asList(7.0, 9.0, 5.0,4.0));
        matriz.add(linha2);

        ArrayList<Double> linha3 = new ArrayList<>(Arrays.asList(4.0, 8.0, 6.0,9.0));
        matriz.add(linha3);

        System.out.println(matriz);

        // imprimindo 1 item da matriz (1 = linha/2 = coluna)
        System.out.println(matriz.get(1).get(2));

        // alterando valor da matriz
        matriz.get(1).set(2, 10.5);

        System.out.println(matriz);

        for (int i = 0; i < matriz.size(); i ++) {
            ArrayList<Double> linha = matriz.get(i);
            System.out.println(matriz.get(i));

            for (int j = 0; j < matriz.size(); j++) {
                System.out.println(matriz.get(j));
            }
        }
    }
}
