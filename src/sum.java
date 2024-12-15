public class sum {
    public static void main(String[] args) {
//        int sum=0;
//        int num =1234;
//        int n = rec(num, sum);
//        System.out.println(n);

        int num = 123454321;
        boolean ans = palindrome(num);
        System.out.println(ans);

    }

//    palindrome using recursion
    public static boolean palindrome(int num){
        boolean ans = false;
       String str = String.valueOf(num);
       for(int i=0; i<str.length()/2;i++){
           if(str.charAt(i)==str.charAt(str.length()-1-i)){
               ans = true ;
           }
       }
       return ans;
    }

//    sum of digits of number using recursion
    public static int rec(int num, int sum){
        if(num==0){
            return sum;
        }

        while(num%10!=0) {
            int r = num % 10;
            sum = sum + r;
            num = num / 10;
            rec(num, sum);
        }
        return sum;
    }
}
