package leetcode;

import java.util.Arrays;

public class PracticeSorting {
    public static void main(String[] args) {
//        int[] arr = {3,1,5,4,2};
////        int[] arr = {1};
////        int[] arr = {};
////        int[] arr = {6,4};
////        int[] arr = {2,-45,-32,0,78,1};
        int[] arr = {1,2,3,4,5};
        System.out.println("Array before Sorting--> "+ Arrays.toString(arr) );
//
        InsertionSort(arr);
//        BubbleSort(arr);
//        SelectionSort(arr);

    }

    static int max(int[] arr, int s, int e) {
        int max = s;
        for (int i = s; i < e; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

     static void Swap(int[] arr, int p , int q ){
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    Stable
//    Insertion Sort	Best-->Ω(n)	   worst-->O(n^2)     Space-->O(1)
    static void InsertionSort(int[] arr){

        for (int i=0; i<arr.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    Swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println("Array after Insertion Sort--> "+ Arrays.toString(arr));

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    bubble sort is also known as Sinking Sort and Exchange Sort :)
//    also known as in-place Sorting Algorithm :)
//    Stable
//    Bubble Sort	Best-->Ω(n)		Worst-->O(n^2)	Space Complexity-->O(1)
    static void BubbleSort(int[] arr){
        Boolean Sorted;
        for(int i=0; i<arr.length;i++){
            Sorted = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    Swap(arr, j, j-1);
                    Sorted = true;
                }
            }
            if(!Sorted){
                break;
            }
        }
        System.out.println("Array after Bubble Sort--> "+ Arrays.toString(arr) );

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    Selection Sort	Best--> Ω(n^2)	Worst-->O(n^2)	Space Complexity-->O(1)
//    not stable
    static void SelectionSort(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            int e = arr.length-i-1;
            int m = max(arr, 0, e);
            Swap(arr, m, e);
        }
        System.out.println("Array after Selection Sort--> "+ Arrays.toString(arr) );

    }

//    static void SelectionSort(int[] arr){
//        for(int i=0; i<arr.length-1;i++){
//           int max = arr[i];
//           for(int j=1; i<arr.length-i;j++){
//               if(arr[j]<)
//           }
//        }
//        System.out.println("Array after Selection Sort--> "+ Arrays.toString(arr) );
//
//    }
}
