package DAA_practice.BootCamp;

import java.util.Arrays;

public class LongestConsecutiveSubseq {
    public static void main(String[] args) {
        int[] arr ={9,5,4,9,10,10,6};
        int n = arr.length;
        int ans =lengthOfLongestConsecutiveSequence(arr, n);
        System.out.println(ans);
    }
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        Arrays.sort(arr);
        int count=0;
        int ans =1;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]==arr[i+1])continue;
            if(arr[i]+1==arr[i+1]){
                count++;
            }else{
                count=0;
            }
            if(count>ans){
                ans = count;
            }
        }
        if(ans>1){
            ans++;
        }

        return ans;


    }
}
