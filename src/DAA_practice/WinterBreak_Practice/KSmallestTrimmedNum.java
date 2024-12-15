package DAA_practice.WinterBreak_Practice;

import java.util.Arrays;
import java.util.Comparator;

public class KSmallestTrimmedNum {
    public static void main(String[] args) {
//        String[] nums = {"102","473","251","814"};
//        int[][] queries = {{1,1},{2,3},{4,2},{1,2}};

        String[] nums ={"24","37","96","04"};
        int[][] queries = {{2,1},{2,2}};
//        Output [0,0]
//        Expected [3,0]
//        int k=1;
//        int trim = 1;
//        int val = sortTrimFindInOriginal(k, trim,nums);
//        System.out.println(val);
        int[] ans =smallestTrimmedNumbers(nums, queries);
        System.out.println(Arrays.toString(ans));
//        Output [2,0,0,0]
//        Expected [2,2,1,0]
    }
    public static int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int m =0;
        for(int i=0;i<queries.length; i++){
            int k = queries[i][0];
            int trim = queries[i][1];
            int val = sortTrimFindInOriginal(k, trim,nums);
            ans[m++]=val;
        }
        return ans;
    }
    public static int sortTrimFindInOriginal(int k, int trim , String[] nums){
        String[] temp = nums.clone();
        for(int i=0; i<nums.length;i++){
            int length = nums[i].length();
            temp[i]  = temp[i].substring(length-trim);
        }
        String[] n = temp.clone();
        Arrays.sort(temp, Comparator.comparingInt(Integer::parseInt));
        String val = temp[k-1];
        for(int i=0; i<temp.length;i++){
            if(val.equals(n[i])){
                return i;
            }
        }
        return 0;
    }
}
