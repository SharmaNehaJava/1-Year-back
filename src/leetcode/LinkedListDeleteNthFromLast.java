package leetcode;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class LinkedListDeleteNthFromLast {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        l.add(23);
        l.add(67);
        l.add(90);
        l.add(21);

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=l.size(); i>0;i--){
            if (i==l.size()-n){
                System.out.println(l.get(i));
            }

        }

    }
}
