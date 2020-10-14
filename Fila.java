import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args){
        Queue<String> fila = new LinkedList<>();
        fila.add("pessoa 1");
        fila.add("pessoa 2");
        fila.add("pessoa 3");
        fila.add("pessoa 4");
        fila.add("pessoa 5");
        System.out.println(fila);
        System.out.println("Na primeira remoção saiu o elemento: "+ fila.remove());
        System.out.println("verifica o elemento na ordem de eliminação: " + fila.peek());
        System.out.println("verifica se elemento existe na fila: " + fila.contains("pessoa 3"));
        System.out.println("retorna tamanho da fila: " + fila.size());
        System.out.println("A fila esta vazia ?: " + fila.isEmpty());
       fila.clear();

    }
}
