package leetcode;

import java.util.*;


public class RomanToInt {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Number using ");
        System.out.println("I,V, X, L, C, D , M only");
        String input = sc.next();
        roman_no(input);

    }
    static void roman_no(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int ans =0;
        for(int i=0; i<str.length()-1; i++){
            if(hm.containsKey(str.charAt(i))){
                if(  hm.get(str.charAt(i))>= hm.get(str.charAt(i+1)) ){
                    ans+= hm.get(str.charAt(i));
                }else{
                    ans-=hm.get(str.charAt(i));
                }

            }
        }
        System.out.println(ans);

    }
}
