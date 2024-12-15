package DAA_practice.WinterBreak_Practice;

import java.util.Arrays;
public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int arr[] = {2,2};
        int n =2;
        int[] ans = findTwoElement(arr, n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findTwoElement(int arr[], int n) {
        int ans[] = new int[2];
        int j = 0;
        if (n == 1) {
            ans[j++] = arr[0];
            ans[j] = 1;
            return ans;
        }
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                ans[j++] = arr[i];
                ans[j] = arr[i] - 1;
            }
        }
        return ans;
    }
}
