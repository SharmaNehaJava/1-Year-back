package leetcode;

//      https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public static void main(String[] args) {
        String s ="0P";
        boolean b = isPalindrome(s);
        System.out.println(b);
    }
    public  static boolean isPalindrome(String s) {
        String a = s.toLowerCase();
        String ns = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                ns += a.charAt(i);
            }
        }
//        if(ns.length()==1 && ns.charAt(0)!>='a' && ns.charAt(0)!<='z'){
//            return false;
//        }
        boolean b = true;
        for (int i = 0; i < ns.length() ; i++) {
            if (ns.charAt(i) != ns.charAt(ns.length() - i - 1)) {
                b = false;
            }
        }
        return b;
    }
}
