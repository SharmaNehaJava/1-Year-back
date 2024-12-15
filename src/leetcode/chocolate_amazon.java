package leetcode;

public class chocolate_amazon {
    public static void main(String[] args) {
        long  arr[] = { 1,2,3};
        int  chocolateMRP=10;
        long b = 0;
        long buy = 0;
        long tch=0;
        long cost;

        for (int i = 0; i < arr.length-1; i++) {
            if (i == 0) {
                buy = arr[0];
            } else if (arr[i] < arr[i-1]) {
                b =arr[i-1]-arr[i];

            } else if(arr[i]>arr[i+1]){
                if(b>arr[i+1]){
                    b-=arr[i+1];
                    break;
                }
                tch=arr[i]-arr[i-1];
                b =( tch -b);
                buy+=b;
            }
        }

        cost = buy * chocolateMRP;
        System.out.println(cost);
    }
}
