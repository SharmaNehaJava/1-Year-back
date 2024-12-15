package DAA_practice.recursion;

public class ArraySortedOrNot {
    public static void main(String[] args){
        int[] arr={1,2,9,3,4,5,6};
        System.out.println(order(arr,0));
    }
    public static boolean order(int[] arr, int idx){
        if(idx==arr.length-1)return true;
        return arr[idx]<arr[idx+1] && order(arr, idx+1);
    }
}
