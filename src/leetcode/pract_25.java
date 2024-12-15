package leetcode;

public class pract_25 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = nums[0];
        int max=nums[0];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++) {
                sum += nums[i];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(sum);
    }
}
