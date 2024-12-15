package DAA_practice.WinterBreak_Practice;

public class MinimizeTheMaximumOfTwoArray {
    public static void main(String[] args) {
        int divisor1 = 12;
        int divisor2 = 3;
        int uniqueCnt1 = 2;
        int uniqueCnt2 = 10;
        int ans = minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2);
        System.out.println(ans);
    }
    public static int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int[] arr1 = new int[uniqueCnt1];
        int[] arr2 = new int[uniqueCnt2];


        int i=1;
        int j=0;
        while(j<uniqueCnt1){
            if((i%divisor1) !=0){
                arr1[j++]=i++;
            }else{
                i++;
            }
        }

        i=1;
        j=0;
        while(j<uniqueCnt2){
            if(i%divisor2 !=0 && search(i, arr1)){
                arr2[j++]=i++;
            }else{
                i++;
            }
        }

        if(arr1[uniqueCnt1-1]>arr2[uniqueCnt2-1]){
            return arr1[uniqueCnt1-1];
        }else{
            return arr2[uniqueCnt2-1];
        }
    }
    public static boolean search(int i, int[] arr){
        for(int j=0; j<arr.length; j++){
            if(arr[j]==i){
                return false;
            }
        }
        return true;
    }
}
