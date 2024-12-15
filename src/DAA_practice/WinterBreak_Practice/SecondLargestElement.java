package DAA_practice.WinterBreak_Practice;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {-10, -40, -25, -12, -25, -10};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }
    public static int secondLargest(int[] arr){
        int l =arr[0];
        int sl = -1;
        for(int i =1; i<arr.length; i++){
            if(arr[i]>l){
                sl = l;
                l = arr[i];
            }else if(arr[i]<l && arr[i]>sl) {
                sl = arr[i];
            }
        }
        return sl;
    }
}
