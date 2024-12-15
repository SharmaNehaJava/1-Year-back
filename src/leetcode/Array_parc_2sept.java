package leetcode;

import java.util.*;
public class Array_parc_2sept {
    public static void main(String[] args) {
//        inserting an element in an array
//        int[] arr = {};
//        int[] arr1 = {2};
        int[] arr2 ={23,56,86};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the element you want to insert");
        int i = sc.nextInt();
        System.out.println("Enter the element you want to insert at your given index");
        int e = sc.nextInt();

//        insertion(arr, i,e);
//        insertion(arr1,i,e);
        insertion(arr2,i,e);

    }
    static void insertion(int[] arr, int idx, int e){

        for(int i=arr.length-1; i>=idx;i--){
            arr[i] = arr[i-1];
        }
        arr[idx-1] = e;
        System.out.println(Arrays.toString(arr));
    }

}
