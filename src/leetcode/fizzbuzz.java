package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

//        using diff approach (Optimal soln)
        int fizz =0;
        int buzz =0;
        for(int i=1; i<=n; i++){
            fizz+=1;
            buzz+=1;
            if (fizz ==3 && buzz ==5) {
                System.out.println("FizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz==3){
                System.out.println("Fizz");
                fizz =0;
            } else if (buzz ==5) {
                System.out.println("Buzz");
                buzz=0;
            }else{
                System.out.println(i);
            }
        }



//        HashMap<Integer,String> map = new HashMap<>();
//
//        map.put(3, "Fizz");
//        map.put(5, "Buzz");
//        map.put(35, "FizzBuzz");

//        for(int i=0; i<=n; i++){
//            if(i%3==0 && i%5==0){
//                System.out.println("FizzBuzz");
//            }else if(i%3==0){
//                System.out.println("Fizz");
//            }else if(i%5==0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i+" ");
//            }
//        }
    }
}
