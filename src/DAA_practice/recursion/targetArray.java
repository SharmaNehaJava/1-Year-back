package DAA_practice.recursion;

public class targetArray {
    public static void main(String[] args){
        int[] arr = {8,56,34,8,2,1};
        int target1=34;
        int target2=8;

        System.out.println(search(arr, target1,0));
        System.out.println(search(arr, target2,0));
    }
    public static boolean search(int[] arr, int t, int idx){
        if(idx==arr.length)return false;
        return arr[idx]==t || search(arr, t, idx+1);
    }
}
