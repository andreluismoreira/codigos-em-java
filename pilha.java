import java.util.Stack;

public class pilha {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Stack<String> stackVazia = new Stack<>();
        stack.add("livro01");
        stack.add("livro02");
        stack.add("livro03");
        stack.add("livro04");
        stack.add("livro05");

        System.out.println(stack);
        System.out.println("elemento removido: " + stack.pop());
        System.out.println("elemento verificado: " + stack.peek());
        System.out.println(stack.search("livro02"));
        System.out.println(stack.isEmpty());
        System.out.println(stackVazia.isEmpty());
        System.out.println(stack);
    }
}
