package leetcode;

import java.util.Stack;

public class ValidAnagram {
    public static void main(String[] args) {
        String s ="a";
        String t ="ab";
        boolean b = isAnagram(s, t);
        System.out.println(b);
    }
    public static boolean isAnagram(String s, String t) {
        Stack<Character> c = new Stack<>();
        for(int i=0; i<t.length(); i++){
            if(!c.contains(t.charAt(i))){
                c.push(t.charAt(i));
            }
        }
        boolean b =true;
        for(int i=0; i<s.length(); i++){
            if(!c.contains(s.charAt(i))){
                b = false;
            }
        }
        return b;
    }
}
