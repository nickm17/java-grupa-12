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
        deque.add(9);// adauga in coada
        deque.offer(5);// adauga in coada

        System.out.println(deque.poll());// Returneaza si sterge urmatorul element din coada, null daca e goala
        System.out.println(deque.poll());
        System.out.println(deque.remove());// Returneaza si sterge urmatorul element din coada, NoSuchElementExceptie daca e goala

        System.out.println(deque.peek());// Returneaza dar NU sterge urmatorul element din coada, null daca e goala
        System.out.println(deque.element());// Returneaza dar NU sterge urmatorul element din coada, NoSuchElementExceptie daca e goala


        System.out.println("=======================");
        deque.forEach(System.out::println);

    }

}
