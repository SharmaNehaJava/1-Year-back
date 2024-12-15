// ans =4 ................. but wrong ans is coming i.e 5

package DAA_practice.test;
import java.util.*;
public class TCS_Vechiles {

        public static void main(String[] args){
            int[] arr1 = {4, 2, 8, 5, 1, 3, 6};
            int W1 = 8;
            int[] arr2 ={4, 7, 9, 11, 6, 8, 3};
            int W2 = 12;

            int ans1 = minNoVechile(arr1, W1);
            int ans2 = minNoVechile(arr2, W2);

            System.out.println(ans1);
//            System.out.println(ans2);
        }
        public static int minNoVechile(int[] arr, int W){
            int[] arr_new  = new int[arr.length];

            ArrayList<Integer> temp = new ArrayList<>();
            int j;
            int maxW=0;
            int count=0;
            int t = -1;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] == W){
                    temp.add(arr[i]);
                }
                j=i+1;
                while(j<arr.length){
                    if(arr[i] + arr[j] <W && arr[i] + arr[j] > maxW && arr_new[j] ==0 && arr_new[i] ==0 ){
                        maxW = arr[i] +arr[j];
                        t = j;
                    }
                    j++;
                }
                arr_new[t] =-1;
                temp.add(maxW);
                count++;
                maxW =0;
            }
            return count;
        }
}
