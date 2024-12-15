package DAA_practice.BootCamp;

public class MaxProdSubArray {
    public static void main(String[] args) {
        int [] nums = {0,2};
        int ans = maxProduct(nums);
        System.out.println(ans);
    }
    public static int maxProduct(int[] nums) {
        int currProd=1;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<nums.length;i++){
            currProd=1;
            for(int j=i;j<nums.length;j++){
                currProd*=nums[j];
                if(currProd> max){
                    max = currProd;
                }
            }
        }
        return max;
    }
}
