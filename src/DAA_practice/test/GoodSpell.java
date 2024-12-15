package DAA_practice.test;

public class GoodSpell {
    public static void main(String[] args){
        String s ="12346221";
        int n =8;
        System.out.println(goodSpell(n, s));
    }
    static int goodSpell(int n, String s) {
        // Write your code here.
        int mul1=1;
        int mul2=1;
        int ans =0;
        for(int i=0; i<s.length(); i++){
            if(i<n/2){
                mul1 *= s.charAt(i);
            }else{
                mul2 *= s.charAt(i);
            }
        }
        if(mul1 == mul2){
            ans =1;
        }
        return ans;
    }
}
