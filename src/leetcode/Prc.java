package leetcode;//    write a program to input n numbers from users and check the number which is palindrome
//    filter out palindrome numbers from the array and store it in different array

//take input of 2 *2 matrix

//first name ,last name
//str = RAM KUMAR
//str1 = RAMUK RAM

import java.util.*;
public class Prc {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = 153;
//        armstring(num);
//        int[][] arr1 =   {{1,1,1},{2,2,2},{3,3,3}};
//        int[][] arr2 =  {{1,1,1},{2,2,2},{3,3,3}};
//        6 6 6    output
//        12 12 12
//        18 18 18
//        upperTriangleMatrix(arr1, arr2);

        String str = "RAM KUMAR";

    }
    static void upperTriangleMatrix(int[][] arr1, int[][] arr2){
        int sum=0;
        int[] ans = new int[0];
        int[][] arr_new= new int[3][3];
        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr1[i].length;j++){
                for(int k=0; k<3; k++){
                    arr_new[i][j]=0;
                    arr_new[i][j] += arr1[i][k]*arr2[k][i];
                }
            }
        }
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++) {
              if(i==0 ||i==j||j==arr_new.length-1){
                  ans[i] = (arr_new[i][j]);
              }
            }
        }
        System.out.println(Arrays.toString(ans));

    }
//    static void armstring(int num){
//        int t=num;
//        int temp= num;
//        int count =0;
//        while(num>0){
//            count++;
//            num/=10;
//        }
//        int sum =0;
//        int mul =1;
//        while(temp>0){
//            int r =temp%10;
//            for(int q=0; q<count; q++){
//                 mul = r*count;
//            }
//
//            temp/=10;
//            sum +=mul;
//            mul=1;
//        }
//        if(t == sum){
//            System.out.println("Yes, your given number is an Armstrong number");
//        }
//    }
}
