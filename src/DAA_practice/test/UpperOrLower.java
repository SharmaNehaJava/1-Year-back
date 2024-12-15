package DAA_practice.test;

public class UpperOrLower {
    public static void main(String[] args) {
        String s = "aBZac";
        String ans = uppercaseORLowercase(s.length(), s);
        System.out.println(ans);
    }
    static String uppercaseORLowercase(int n, String s) {
        // Write your code here.
        String newS = s.toLowerCase();
        System.out.println(newS);
        int i =0;
        int lower =0;
        int upper =0;
        while(i<s.length()){

                if(newS.charAt(i) == s.charAt(i)){
                    lower++;
                }else{
                    upper++;
                }
            i++;
        }
        if(lower> upper){
            newS.toLowerCase();
        }else{
            newS.toUpperCase();
        }
        return newS;
    }
}
