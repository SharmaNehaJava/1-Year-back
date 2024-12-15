package DAA_practice.test;

import java.util.ArrayList;

public class RotateArrayByOne {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int n = arr.size();
        rotate(arr, n);
        System.out.println(arr);
    }
    public static void rotate(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int temp1 = arr.get(n - 1);
        int temp2;
        for (int i = 0; i < n; i++) {
            temp2 = arr.get(i);
            arr.set(i, temp1);
            temp1 = temp2;
        }
    }
}
