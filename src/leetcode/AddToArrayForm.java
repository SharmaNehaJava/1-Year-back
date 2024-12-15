package leetcode;

import java.util.*;
public class AddToArrayForm {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int n = rob(nums);
        System.out.println(n);
//        int[] numbers = {5,25,75};
//        int target = 100;
//        output = [1,2]
//        int[] ans = twoSum(numbers, target);
//        System.out.println(Arrays.toString(ans));

//        List<Integer> l = new ArrayList<>();
//        int[] num ={2,1,5};
//        int k =806;
//
//        for(int i= num.length-1;i>=0;i--){
//            l.add(0,(num[i]+k)%10);
//            k = (num[i]+k)/10;
//        }
//        while(k>0){
//            l.add(0, k%10);
//            k/=10;
//        }
//        System.out.println(l);
    }
    static int rob(int[] nums) {
        int sum = 0;
        int max=0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum=nums[i];
            for (int j = i+2; j < nums.length; j++) {
                sum += nums[j];
                j += 2;
                if(sum>max){
                    max= sum;
                }
            }
            sum=0;
        }
        return max;
    }
//    static int[] twoSum(int[] numbers, int target) {
//        int[] ans = new int[2];
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                int sum = numbers[i] + numbers[j];
//                if (sum == target && i != j) {
//                    ans[0] = i + 1;
//                    ans[1] = j + 1;
//                }
//            }
//        }
//        return ans;
//    }
}