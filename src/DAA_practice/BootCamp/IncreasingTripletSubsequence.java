package DAA_practice.BootCamp;

public class IncreasingTripletSubsequence {
    public static void main(String[] args){
        int[] nums2 = {1,2,3,4,5};
        int [] nums= {5,4,3,2,1};
        System.out.println(increasingTriplet(nums));
    }

        public static  boolean increasingTriplet(int[] nums) {
            int smallest = Integer.MIN_VALUE;
            int scndSmallest = Integer.MIN_VALUE;

            for(int num: nums){
                if(num<=smallest){
                    smallest = num;
                }else if(num<=scndSmallest){
                    scndSmallest = num;
                }else{
                    return true;
                }
            }
            return false;
        }

}
