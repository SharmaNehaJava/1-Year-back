package DAA_practice.WinterBreak_Practice;

import java.util.Arrays;

public class Sort_DutchFlag {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        // using dutch national flg algorithm
        int low =0;
        int mid =0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==2){
                // swap
                swap(nums,mid, high);
                high--;
            }else if(nums[mid]==0){
                // swap
                swap(nums, mid, low);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }
    public static void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
