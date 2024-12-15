package DAA_practice.WinterBreak_Practice;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean b = wordPattern(pattern, s);
        System.out.println(b);
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> m = new HashMap<>();
        int j=0;
        String temp="";
        for(int i=0; i<pattern.length(); i++){
            if(s.charAt(j)==' '){
                j++;
            }
            while(s.charAt(j)!=' ' && j<=s.length()-1){
                temp+=s.charAt(j);
                if(j!=s.length()-1){
                    j++;
                }

            }
//            if(j==s.length()-2){
//                temp+=s.charAt(s.length()-1);
//            }
            if(m.containsKey(pattern.charAt(i))){
                if(!m.get(pattern.charAt(i)).equals(temp)){
                    return false;
                }
            }
            else{
                // if(m.containsValue(temp)){
                //     return false;
                // }
                m.put(pattern.charAt(i),temp);
            }
            temp="";
            // j++;
        }
        return true;
    }
}
