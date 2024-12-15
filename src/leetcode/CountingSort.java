package leetcode;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4,2,2,8,3,3,1};
//        int m = max(arr);
//        int[] countArr = new int[m];
//        countArr = countElement(arr);
        System.out.println(Arrays.toString(count(arr)));

    }

    static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

//    static int[] countElement(int[] arr, int[] ce){
//        for(int i=0;i<ce.length;i++){
//            arr[i]=0;
//            int counte = 0;
//            for(int j=0; j<arr.length;j++){
//
//
//            }
//        }
//
//    }
    static int[] count(int[] arr){
        int[] c = new int[arr.length];
        int count=0;
        for(int i=0; i<arr.length; i++){
            for (int j =i+1;j<arr.length; j++){
                if(arr[i]== arr[j]){
                    count++;
                }
            }
            c[i]= count;
            count=0;
        }
        return c;
    }
}
