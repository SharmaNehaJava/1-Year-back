package DAA_practice.WinterBreak_Practice;

public class Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean b = isSubsequence(s,t);
        System.out.println(b);
    }
    public static boolean isSubsequence(String s, String t) {
//        what is the use of this temp variable
        boolean b=false;
        int count=0;
        int temp=0;
        for(int i=0; i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j) && (j>temp || j==0)){
                    count++;
                    temp=j;
                    break;
                }
            }
        }
        if(count==s.length()){
            b=true;
        }
        return b;
    }
}
