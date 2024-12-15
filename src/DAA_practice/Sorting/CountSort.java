package DAA_practice.Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args){
        int[] arr = {6,3,10,9,4,3,6,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int[] countArray = new int[largest+1];
        for(int e : arr){
            countArray[e]++;
        }
        int i=0;
        for(int j =0; j<countArray.length; j++){
            while(countArray[j]>0){
                arr[i] = j;
                i++;
                countArray[j]--;
            }
        }
    }
}
