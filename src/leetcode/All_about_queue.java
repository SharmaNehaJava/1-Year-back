package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class All_about_queue {
    public static void main(String[] args) {
////        declaration of queue
//        Queue<Integer> q = new LinkedList<>();
//
////        adding element in queue
//        q.add(46);
//        q.add(89);
//        q.add(-3);
//        q.add(0);
//
////        printing an element from queue without deleting
////        System.out.println(q.peek());
//
////        removing an element in queue
//        System.out.println(q.remove());
//        System.out.println(q.remove());

        Queue <Integer> q = new LinkedList<>();

        q.add(3);
        q.offer(5);
        int a = q.remove();
        System.out.println(a);
        int b= q.poll();
        System.out.println(b);
        System.out.println(q.isEmpty());
        q.add(3);
        q.peek();
        q.element();
        System.out.println(q.isEmpty());


    }
}
