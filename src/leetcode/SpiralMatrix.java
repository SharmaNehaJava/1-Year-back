package leetcode;

import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {

//        int[] prices = {7,1,5,3,6,4};
//        int n =maxProfit(prices);
//        System.out.println(n);


//        int[] l = spiralOrder(matrix);
//        rotate(matrix);

//        String s ="abcabcbb";
//        String s ="pwwkew";
        String s = "dvdf";
        int n = lengthOfLongestSubstring(s);
        System.out.println(n);
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = 1;
        int max=n;
        boolean b =true;
//        int p=0;
        int q=1;

        if(s.length()==0){
            return 0;
        }
        for(int i=q;i<s.length();i++){
            for(int j=i-1;j>=q;j--){
                if(s.charAt(i)==s.charAt(j)){
                    b=false;
                    q =j+1;
                    break;
                }
            }
            if(b== true){
                n++;
                if(n>max){
                    max= n;
                }
            }else{
                n=1;
//                p=i;
                b= true;
            }
        }
        return  max;
    }

////buy and sell
//    public static int maxProfit(int[] prices) {
//        int max_Profit =0;
//        for(int i=0; i<prices.length-1;i++){
//            if(prices[i+1]-prices[i] >max_Profit){
//                max_Profit = prices[i+1]-prices[i];
//            }
//        }
//        return max_Profit;
//    }

//     ans.set(matrix[i][j]);
//    public static int[] spiralOrder(int[][] matrix) {
//
//        int n = matrix.length;
//        int m = matrix[0].length;
//        int[] ans = new int[n*m];
//        System.out.println(n );
//        System.out.println(m);
//
//
//        return ans;
//    }
//    public void rotate(int[][] matrix) {
//        int n = matrix.length;
//        // Transpose
//        for(int i=0; i<n-1;i++){
//            for(int j=i+1; j<n;j++){
//                // Swap
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//
//        // Reverse
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n/2;j++){
//                // Swap
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[i][n-i-1];
//                matrix[i][n-i-1] = temp;
//            }
//        }
//    }

}

