package leetcode;

import java.util.Arrays;

public class target_sumArr {
    public static void main(String[] args) {
        int[] nums = {8,7,2,5,3,1};
        int target = 10;
        int[] ans =new int[nums.length];
        int q=0;
        for(int i =0; i<nums.length-1; i++){
            for(int j=i+1;j<nums.length; j++){
                if((nums[i]+nums[j] )== target){
                    ans[q] = nums[i];
                    ans[q+1]= nums[j];
                    q+=2;
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
