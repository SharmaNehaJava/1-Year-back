package DAA_practice.test;

public class Post_Neg_Subseq {
    public static void main(String[] args){
        int[] a = {1,-5,5,-10};
        int x =-7;
        int y = 9;
        int n =a.length;
        System.out.println(minimumSubarray(n,x,y,a));
    }
//    public static int minimumSubarray(int n, int x, int y, int[] a) {
//        // Write your code here.
//        int count=0;
//        int ans =n;
//        int j=0;
//        for(int i=0; i<n;i++){
//            if(a[i]<= x ){
//                j=i+1;
//                while(j<n){
//                    if(a[j]>=y){
//                        count = j-i+1;
//                    }
//                }
//            }else if(a[i] >=y){
//                count++;
//                j =i+1;
//                while(j<n){
//                    if(a[j]<=x){
//                        count =j-i+1;
//                    }
//                }
//            }
//
//            if(count<ans){
//                ans = count;
//            }
//            count=0;
//        }
//        return ans;
//    }
    public static int minimumSubarray(int n, int x, int y, int[] a) {
        // Write your code here.
        int i=0;
        int j=n-1;
        int count =0;
        int ans =n;
        while(i<n){
            if(a[i]<=x && a[i]>=y){
                count++;
            }
            while(j>i){
                if((a[i]<=x && a[j]>=y) || (a[i]<=y && a[j]>=x )){
                    count =j-i+1;
                }
                j--;
            }
            if(count<ans){
                ans = count;
            }
            i++;
        }
        return ans;
    }
}
