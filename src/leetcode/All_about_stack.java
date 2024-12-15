package leetcode;

import java.util.Stack;

public class All_about_stack {
    public static void main(String[] args) {
//        declaration of stack
//        last in last out
//        eg--> stack of plates, bolls in a cylindrical bottle
        Stack<Integer> s = new Stack<>();

//        pushing/ putting element in stack
        s.push(3);
        s.push(65);
        s.push(86);
        s.push(-2);
        s.push(0);

//        popping elment
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

//        as the stack is empty now, so the next pop function will give an error/ exception
//        s.pop();


    }
}
