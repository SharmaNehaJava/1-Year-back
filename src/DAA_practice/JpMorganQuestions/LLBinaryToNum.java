package DAA_practice.JpMorganQuestions;
import java.util.*;

public class LLBinaryToNum {
    public static void main(String[] args){
//        Linked List = [1→ 0 → 1 → 1 → 0]

        LinkedList<Integer> l = new LinkedList<>();
        l.addFirst(0);
        l.addFirst(1);
        l.addFirst(1);
        l.addFirst(0);
        l.addFirst(1);

        helper(l);
    }
    public static void helper(LinkedList<Integer>l){
        String s ="";
        for(int i: l){
            s+=i;
        }
        int num =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                int p =(int) Math.pow(2,s.length()-i-1);
                num+=p;
            }
        }
        System.out.println(num);
    }

}
