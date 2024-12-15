package leetcode;

import java.util.*;
public class prac_23 {
    public static void main(String[] args) {
//        java method to print the multiplication table of a given nnumber
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        int num = sc.nextInt();
//        mul(num);

//        print pattern left triangle
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//        pattern1(n);

//        print pattern downwards left triangle
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//        pattern2(n);


//        recursive function to calculate the sum of first n natural number
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter a number ");
//        int n = sc.nextInt();
//        natural(n);

//        printing the n th term of fibonacci series using recursion
//        fibonacci series = sum of previous two numbers
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter a number-->");
//        int n = sc.nextInt();
//        System.out.println( fibbo(n));

//        largest 3 elements in an array
        int[] arr= {90,10, 4, 3, 50, 23};

        System.out.println(Arrays.toString(large(arr)));


    }
    static int[] large(int[] arr) {
        int[] max = new int[3];
        if(arr.length<3){
            System.out.println("invalid input");
            return max;
        }
        for (int i = 0; i < arr.length; i++) {
                int m = 0;

                if (arr[i] > arr[m]) {
                    m = i;
                }
                if (i >= arr.length - 3) {
                    max[arr.length-i-1] = arr[m];

                }

        }
        return max;
    }
    static void mul(int num){
        if(num<0){
            System.out.println("Enter a positive number , please:) ");
            return;
        }
        for(int i =1; i<=10; i++){
            System.out.println(num +" * "+ i + " = "+ num*i);
        }
    }

    static void pattern1(int n ){
        for(int i=0; i<n;i++){
            for(int j=0; j<=i;j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void natural(int n){
        if(n<=0){
            System.out.println("Enter a natural number , greater than 0.");
        }
        int sum =0;
        for(int i=1; i<=n;i++){
            sum +=i;
        }
        System.out.println("The sum of first "+ n+" natural number is "+sum);
    }

    static void pattern2(int n){
        for(int i=n; i>0;--i){
            for(int j=i; j>0; --j){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static int fibbo( int n){
        if(n<0){
            return -1;
        }
        if(n==0 || n==1 ){
            return n;
        }
        int ans =0;
        ans = fibbo(n - 1) + fibbo(n - 2);

        return ans;
    }


}
