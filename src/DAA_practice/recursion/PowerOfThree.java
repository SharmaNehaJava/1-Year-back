package DAA_practice.recursion;
//https://leetcode.com/problems/power-of-three/
public class PowerOfThree {
    public static void main(String[] args) {
        int n =27;
        boolean b =recursion(n);
        System.out.println(b);
    }
    public static boolean recursion(int n){
        if(n==1){
            return true;
        }else if(n%3!=0 ||n==0){
            return false;
        }
        return recursion(n/3);
    }
}
