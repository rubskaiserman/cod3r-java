package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        
        stack.add("O mais em baixo");
        stack.push("Insira");
        stack.push("O de cima");

        System.out.println(stack.peek());
        System.out.println(stack.peek());

        System.out.println(stack.poll());
        System.out.println(stack.poll());
    }
    
}
