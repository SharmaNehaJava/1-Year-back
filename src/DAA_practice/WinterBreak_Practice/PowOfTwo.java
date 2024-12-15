package DAA_practice.WinterBreak_Practice;

public class PowOfTwo {
    public static void main(String[] args) {
        int n =3;
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n/2!=1 && n>=2){
            return false;
        }else if(n/2==1 &&n%2==0){
            return true;
        }
        return isPowerOfTwo(n/2);
    }
}
