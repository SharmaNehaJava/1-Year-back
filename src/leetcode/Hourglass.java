package leetcode;

public class Hourglass {
    public static void main(String[] args) {
//        int[] nums ={1,1,2};
//       int a =singleNonDuplicate(nums);
//        System.out.println(a);
//        List<String> words = new ArrayList<>();
//        words.add("an");
//        words.add("apple");
//        String s = "a";
//        boolean b = isAcronym(words, s);
//        System.out.println(b);
//
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int ans = maxSubArray(nums);
//        System.out.println(ans);

        int[] nums = {1,3,5,6};
        int target = 5;
//        output -> 2
        System.out.println(searchInsert(nums,target));;
//        int target1 = 2;
//        output -> 1
//        System.out.println(searchInsert(nums, target1));

    }
    static int searchInsert(int[] nums, int target) {
        int start=0;
        int end = nums.length;
        int ans =0;
        for(int i=0; i<nums.length;i++){
            int mid = start+(end-i)-1/2;
            if(target == mid ){
                ans= i;
            }else if(target>mid){
                start = mid+1;
            }else if(target<mid){
                end = mid-1;
            }else{
                ans = i-1;
            }
        }
        return ans;
    }
//    static int maxSubArray(int[] nums) {
//        int max=nums[0];
//        int sum =0;
//        for(int i=0; i<nums.length;i++){
//            sum +=nums[i];
//            if(max<sum){
//                max = sum;
//            }
//            if(sum<0){
//                sum=0;
//            }
//
//        }
//        return max;
//    }
//    static int maxAscendingSum(int[] nums) {
//        int maxSum = Integer.MIN_VALUE;
//        int csum = 0;
//        for(int i=0; i<nums.length-1; i++){
//
//            if(nums[i]<nums[i+1] ){
//                csum +=nums[i];
//                if(i==nums.length-2 ){
//                    csum += nums[nums.length-1];
//                }
//                if(maxSum<csum){
//                    maxSum=csum;
//                }
//            }else{
//                csum +=nums[i];
//                if(maxSum<csum){
//                    maxSum=csum;
//                }
//                csum=0;
//            }
//        }
//        return maxSum;
//    }
//    static boolean isAcronym(List<String> words, String s) {
//        boolean[] ba = new boolean[s.length()];
//        if(s.length() ==0){
//            String str = words.get(0);
//            if(str.charAt(0)==s.charAt(0)){
//                return true;
//            }
//        }
//        for(int i=0; i<s.length(); i++){
//            String str = words.get(i);
//            if(str.charAt(0) == s.charAt(i)){
//                ba[i] = true;
//            }
//        }
//        for(boolean e : ba){
//            if(!e){
//                return false;
//            }
//        }
//        return true;
//    }
//    static int singleNonDuplicate(int[] nums) {
//        int count =0;
//        int ans=nums[0];
//        for(int i=0; i<nums.length-1; i++){
//
//            if(nums[i]== nums[i+1]){
//                count++;
//                i++;
//            }
//            if(count==0 ){
//                ans =nums[i];
//            }
//            count =0;
//        }
//        return ans;
//    }
}
