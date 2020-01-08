package ro.siit.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueExamples {

    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.add(5);
        deque.add(8);
        deque.add(9);
        deque.offer(5);

        System.out.println(deque.poll());
        System.out.println(deque.poll());
        System.out.println(deque.remove());// Exceptie

        System.out.println(deque.peek());
        System.out.println(deque.element());// Exceptie


        System.out.println("=======================");
        deque.forEach(System.out::println);

    }

}
