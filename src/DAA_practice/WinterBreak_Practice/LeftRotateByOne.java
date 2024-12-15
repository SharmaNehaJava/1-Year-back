package DAA_practice.WinterBreak_Practice;
import java.util.Arrays;
//Left Rotate the array by one place
public class LeftRotateByOne {
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        leftRotateByOnePlace(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void leftRotateByOnePlace(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[ arr.length-1] = temp;
    }
}
