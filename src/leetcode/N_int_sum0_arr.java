package leetcode;//        https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
//        n unique integer sums upto zero

import java.util.*;
public class N_int_sum0_arr {
    public static void main(String[] args) {
        int n =5;
//        int n = 3;

        Sol s = new Sol();
        int[] arr = new int[n];
        arr = s.sumZero(n);
        System.out.println(Arrays.toString(arr));

    }
    static class Sol {
        public int[] sumZero(int n) {
            int[] arr = new int[n];
            int sum =0;
            int j=1;

            for(int i=0; i<arr.length; i++){
                // check if the n is odd or even
                if(n%2 !=0 && i==0){
                    // odd
                    arr[0] =0;
                    continue;
                }
                while(i<n) {
                    arr[i] = j;
                    arr[i + 1] = -j;
                    j++;
                    i += 2;
                }
            }
            return arr;
        }
    }
}
