
import java.util.ArrayList;
import java.util.Scanner;

class ListaCompras {
    private ArrayList <String> lista = new ArrayList <>();
    private Scanner scanner = new Scanner(System.in);

    private String mostrarMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Digite o comando desejado: \n");
        sb.append("1-Ver a lista;\n");
        sb.append("2-Adicionar item a lista;\n");
        sb.append("3-Remover item da lista;\n");
        sb.append("4-Limpar lista;\n");
        sb.append("5-Sair;\n");
        System.out.println(sb.toString());

        return scanner.nextLine();
    }

    public void iniciar() {
        String opcao = mostrarMenu();
        while (!opcao.contentEquals("5"));
            switch (opcao){
                case "1":
                    System.out.println(lista);
                    opcao = mostrarMenu();
                    break;
                case "2":
                    System.out.println("digite o item para adicionar na lista: ");
                    String item = scanner.nextLine();
                    lista.add(item);
                    System.out.println(lista);

                    opcao = mostrarMenu();

                    break;
                case "3":
                    System.out.println("Digite o indice do item que sera removido: ");
                    int indice = Integer.valueOf(scanner.nextLine());
                    lista.remove(indice);
                    System.out.println(lista);
                    break;
                case "4":
                    lista.clear();
                    System.out.println(lista);
                    opcao = mostrarMenu();
                    break;
                default:
                    System.out.println("Opção invalida");
                    mostrarMenu();
                    opcao = scanner.nextLine();
            }

        scanner.close();
        System.out.println("Obrigado !!!");
    }
}

