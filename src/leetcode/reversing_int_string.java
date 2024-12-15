package leetcode;

import java.util.*;
public class reversing_int_string {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//        Reversing a string
        String str = "Neha " , abc ="";
        char ch;
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            abc = ch+abc;
        }
        System.out.println(abc);


//        System.out.println("Original number "+num);

//         reversing a number
//         int sum =0;
//        while(num!=0) {
//            int r = num % 10;
//            sum = sum*10+r;
//            num = num / 10;
//        }
//        System.out.println("After reversing "+sum);

//     counting the number of integer in a given number
//        int ans=0;
//        if(num==0){
//            ans++;
//        }else if(num<0){
//            num = num*-1;
//        }
//        while(num!=0){
//            num = num/10;
//            ans++;
//        }
//        System.out.println("Total number of integer in your input is "+ans);
    }
}
