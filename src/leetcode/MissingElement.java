package leetcode;//given a square matrix , template the absolute difference bw the sum of its diagonals

public class MissingElement {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,5};
//        int[] nums = {2,3,5,2,4};
        int[] arr =new int[nums.length];

        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
               max = nums[i];
            }
        }
        int r=0;
        for(int j=1; j<=max;j++ ){
            arr[r] = j;
            r++;
        }
//        boolean[] b = new boolean[arr.length];
        int[] missing_e = new int[0];
        int q=0;
        for(int i=0; i<nums.length; i++){
//            b[i] = true;
            for(int j=0; j<nums.length; j++){
                if(nums[i]!=arr[j]){
//                    b[i] = false;
                    missing_e[q] = arr[j];
                    q++;
                }else{
                    break;
                }

            }
        }
//        for(boolean e : b){
//            if(e ==false){
//
//            }
//        }

    }
}
