package DAA_practice.BootCamp;
import java.util.*;
public class ProdArrayExceptSelf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr= {1,2,3,4};
        int[] num = productExceptSelf(arr);
        System.out.println(Arrays.toString(num));
    }
    public static int[] productExceptSelf(int[] nums) {
        int pref=1;
        int suff=1;

        int[] arr = new int[nums.length];
        arr[0]=1;
        for(int i=0;i<nums.length-1;i++){
            pref*=nums[i];
            arr[i+1]=pref;
        }

        for(int i=nums.length-1;i>0;i--){
            suff*=nums[i];
            arr[i-1]*=suff;
        }
        return arr;
    }
}
