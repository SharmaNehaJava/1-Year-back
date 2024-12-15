package leetcode;

import java.util.Arrays;

public class sort_all {
    public static void main(String[] args) {
//        int[] arr = {6,3,9,5,2,8};
//        int n = arr.length;
//        divide(arr, 0, n-1);
//        System.out.println(Arrays.toString(arr));

        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
//        Output: [1,2,2,3,5,6]
        merge(nums1, m,nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
//    https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] narr  = new int[m];
        for(int i = 0; i<m; i++){
            narr[i] = nums1[i];
        }
        int index1 = 0;
        int index2 = 0;
        int x=0;
        while(index1<m && index2 <n){
            if(narr[index1]<=nums2[index2]){
                nums1[x++] = narr[index1++];
            }else{
                nums1[x++] = nums2[index2++];
            }
        }
        while(index1<m){
            nums1[x++] = narr[index1++];
        }
        while(index2<n){
            nums1[x++] = nums2[index2++];
        }

    }
//    merge sort
    static void divide(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int mid = start +(end - start)/2;

        divide(arr, start,mid);
        divide(arr, mid+1, end);
        conquer(arr, start, mid, end);
    }
    static void conquer(int[] arr, int start, int mid, int end){
        int[] merged = new int[end-start+1];
        int index1 =start;
        int index2 = mid+1;
        int x =0;

        while(index1<=mid && index2<=end){
            if(arr[index1]<=arr[index2]){
                merged[x++] = arr[index1++];
            }else{
                merged[x++] = arr[index2++];
            }
        }

        while(index1<=mid){
            merged[x++] = arr[index1++];
        }
        while(index2<=end){
            merged[x++] = arr[index2++];
        }

        for(int i=0, j = start;i<merged.length; i++, j++ ){
            arr[j] = merged[i] ;
        }
    }
}
