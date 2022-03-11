package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Primeiro da Fila");
        queue.offer("Segundo da fila");
        queue.offer("Terceiro da FIla");

        System.out.println(queue.peek()); //"Primeiro da Fila"
        System.out.println(queue.peek()); //"Primeiro da Fila"

        System.out.println(queue.poll()); //"Primeiro da Fila"
        System.out.println(queue.poll()); //"Segundo da Fila"
        System.out.println(queue.poll()); //"Terceiro da Fila"
        System.out.println(queue.poll()); // null
    }
}
