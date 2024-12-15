package DAA_practice.BootCamp;

public class MaxIin2Darray {
    public static void main(String[] args){
        int[][] arr ={
                { -9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4 ,0}
        };
        int ans = helper(arr);
        System.out.println(ans);
    }
    public static int helper(int[][] arr){
        int maxSum =Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-3;i++){
            for(int j=0; j<=arr[i].length-3;j++){
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum+=arr[i+1][j+1];
                sum+=(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
                maxSum = Math.max(maxSum, sum);

            }
        }
        return maxSum;
    }
}
