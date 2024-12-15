package DAA_practice.CodeChef;

import java.util.*;
public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= {1,1,3,3};
        helper(arr);
    }
    public static void helper(int[]arr){
        int e =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[e]){
                e++;
                int temp = arr[e];
                arr[e] = arr[i];
                arr[i]= temp;
            }
        }

        System.out.println(e);
        for(int i=0;i<e;i++){
            System.out.println(arr[1] +" ");
        }
        System.out.println();
    }
}
