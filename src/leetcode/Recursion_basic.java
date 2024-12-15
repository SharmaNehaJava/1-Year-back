package leetcode;

import java.util.Scanner;
public class Recursion_basic {
    public static void main(String[] args) {
//        SumOfNaturalNo(10,0);
//        System.out.println(Factorial(5));

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number upto to which you want the fibonacci series ");
//        int n = sc.nextInt();
//        if(n==0){
//            System.out.println(n);
//            return;
//        }else if(n==1){
//            System.out.println(n-1);
//            System.out.println(n);
//            return;
//        }
//        int a=0;
//        int b=1;
//        fib(a,b,n);

//        int x= 4;
//        int n=3;
//        System.out.println(power(x, n));

        System.out.println(pow(2,2));

    }

//    sum of first n natural numbers
    static void SumOfNaturalNo(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
         sum +=n;
        SumOfNaturalNo(n-1, sum);
    }

//    Factorial of a number n
    static int  Factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact = n * Factorial(n-1);
        return fact;
    }

//    print Fibonacci series
//    Fibonacci series = sum of previous two numbers
    static void fib(int f, int s, int n){
        if(f==0){
            System.out.println(f);
            System.out.println(f+1);
            n-=2;
        }
        if(n==0){
            return;
        }
        int c = f +s;
        System.out.println(c);
        fib(s,c,n-1);

    }

//    x^2 with (stack height = n)
    static int power(int x, int n){
        if(x==0){
            return 0;
        }
        if(n ==0){
            return 1;
        }

        int last_pow = power(x,n-1);
        int ans = x* last_pow;
        return ans;
    }

//    power of x^2 with (stack power = log n)
    static int pow(int x, int n){
        int ans=0;
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }

        if(n%2 ==0){
             ans = pow(x, n/2)* pow(x, n/2);
        }else{
             ans = pow(x, n/2)* pow(x, n/2)*x;
        }
        return ans;
    }
}
