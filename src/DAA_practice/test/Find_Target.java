package DAA_practice.test;

public class Find_Target {
    public static void main(String[] args) {
        int[] nums = {4, 10};
        int target = 1;
        int ans = search(nums, target);
        System.out.println(ans);
    }
    public static int search(int []nums, int target) {
        // Write your code here.
        int s = 0;
        int e = nums.length-1;
        int mid = -1;
        while(s<=e){
            mid = s+(e-s)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target> nums[mid]){
                s = mid+1;

            }else if (target <nums[mid]){

                e = mid-1;

            }
            if(s == e && nums[s] != target){
                return -1;
            }
        }
        return mid;
    }
}
