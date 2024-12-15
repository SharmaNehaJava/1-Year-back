package leetcode;

import java.util.*;
public class Lucky_no_Arr {
    public static void main(String[] args) {
//       int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
//        int[][] matrix = {{3,6},{7,1},{5,2},{4,8}};
//        int[][] matrix ={{3,7,8},{9,11,13},{15,16,17}};
        int[][] matrix = {{76618,42558,65788,20503,29400,54116}};
        Solution s = new Solution();
        List<Integer> list = new ArrayList<>();
        list = s.luckyNumbers(matrix);
        System.out.println(list);
    }

    static class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            int m = matrix.length;
            int n= matrix[0].length;
            int max=0;
            int row=0;

            List<Integer> ans = new ArrayList<>();
            // giving the max element in the array
            for(int i=0; i<m; i++){
                for(int j=0; j<n;j++){
                    if(matrix[i][j]>max){
                        max = matrix[i][j];
                        row = i;
                    }
                }
            }
            // minimum element in the row that has max element
            int min = matrix[row][0];
            int c =0;
            for(int i=0; i<matrix[row].length;i++){
                if(matrix[row][i]<min){
                    min = matrix[row][i];
                    c = i;
                }
            }
            // now check if the min element of the row is the maximum element in the col or not

            int q= 0;
            for(int i=0; i<m; i++){
                if(q<matrix[i][c]){
                    q = matrix[i][c];
                }
            }
            if(q == min){
                ans.add(min);
            }
            return ans;
        }
    }
}
