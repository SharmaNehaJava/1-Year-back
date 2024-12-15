package DAA_practice.recursion;

public class reduce_no_0 {
    public static void main(String[] args){
        int num =123;
        int n = numberOfSteps(num);
        System.out.println(n);
    }
    public static int count=0;
    public static int numberOfSteps(int num) {
        if(num==0){
            return count;
        }
        if(num%2 ==0){
            num /=2;
            count++;
        }else{
            --num;
            count++;
        }
        numberOfSteps(num);
        return count;
    }
}
