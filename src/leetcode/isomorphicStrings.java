package leetcode;

import java.util.HashMap;

public class isomorphicStrings {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";

        boolean b = isIsomorphic(s, t);
        System.out.println(b);
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for(int i =0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i)) || map.get(s.charAt(i))== t.charAt(i)){
                map.put(s.charAt(i), t.charAt(i));
            }else{
                return false;
            }
        }
        return true;
    }
}
