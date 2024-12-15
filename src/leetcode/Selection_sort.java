package leetcode;// Selection Sort
//      Maximum value of an array will swap it's position with the last value.

import java.util.Arrays;
public class Selection_sort {
    public static void main(String[] args) {
//        int[] arr = {3,1,5,4,2};
//        int[] arr = {1};
//        int[] arr = {};
//        int[] arr = {6,4};
        int[] arr = {2,-45,-32,0,78,1};

        System.out.println("Before Selection Sort--> "+ Arrays.toString(arr));

        SelectionSort(arr);
        System.out.println("After Selection Sort--> "+ Arrays.toString(arr) );


    }
    static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int s =0;
            int e =arr.length-i-1;

            int max = max(arr, s, e);
            swap(arr, max, e);
        }

    }

    static int max(int[] arr, int s , int e){
        int maxI = s;
        for(int i=s; i<=e;i++){
            if(arr[i]>arr[maxI]){
                maxI= i;
            }
        }
        return maxI;
    }

    static void swap(int[] arr,int m,int e){
       int temp = arr[m];
       arr[m] = arr[e];
       arr[e] = temp;
    }
}
