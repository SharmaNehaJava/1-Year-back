package DAA_practice.WinterBreak_Practice;

import java.util.ArrayList;

public class SentencePalindrome {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String  s ="0P";
        boolean b = isPalindrome(s);
        System.out.println(b);
    }
    public static boolean isPalindrome(String s) {
        ArrayList<Character> c = new ArrayList<>();
        for(char i: s.toCharArray()){
            if(i>='A'&& i<='Z' || i>='a'&& i<='z'||i>='0' && i<=9){
                c.add(i);
            }
        }
        char[] n = new char[c.size()];
        int j=0;
        for(char i:c){
            n[j++]=Character.toLowerCase(i);
        }
        int i=0;
        j=c.size()-1;
        while(i<j){
            if(n[i]!=n[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
