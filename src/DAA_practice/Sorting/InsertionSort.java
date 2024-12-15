package DAA_practice.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }else{
                    break;
                }
            }
        }
    }
}
