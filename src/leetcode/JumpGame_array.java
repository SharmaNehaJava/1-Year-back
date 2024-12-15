package leetcode;

public class JumpGame_array {
    public static void main(String[] args) {
            int[] nums= {2,3,1,1,4};
            boolean ans = false;

            for(int i=0; i<nums[i];i++){
                int n= nums[i];
                for(int j=i;j<n;j++){
                    int count=0;
                    for(int k=j;k<nums.length;k++){
                        count++;
                    }
                    if(nums[j]==count){
                        ans = true;
                    }
                }
            }
        System.out.println(ans);
    }
}
