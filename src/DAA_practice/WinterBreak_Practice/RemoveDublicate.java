package DAA_practice.WinterBreak_Practice;
import java.util.Arrays;
public class RemoveDublicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int idx = removeDub(arr);
        for(int i=0; i<idx; i++){
            System.out.print(arr[i]);
        }
    }
    public static int  removeDub(int[] arr){
//        two pointer approach
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i]!= arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
