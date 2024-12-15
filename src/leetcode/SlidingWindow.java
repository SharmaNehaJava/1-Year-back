package leetcode;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] nums = { 2,3};
        int k = 3;

        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean b = false;
        int j;
        for(int i=0; i<nums.length-k;i++){
            j = i+1;
            while(j<nums.length){
                if(nums[i]== nums[j] && Math.abs(i-j) <=k){
                    b = true;
                    break;
                }
                j++;
            }
            j=i+1;
        }

        return b;
    }
}
