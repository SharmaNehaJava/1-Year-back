package leetcode;

import java.util.*;
public class Soldier_prb {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of weakest country you want--> ");
        int k = sc.nextInt();
        int sum = 0;
        int[] ans = new int[4];

// clculating the sum of each element in a row and assigning to an array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            ans[i] = sum;
            sum = 0;
        }

//key value pair for the array having sum of all elements in each row, associated with their row number.
        Hashtable<Integer, Integer> hash_table = new Hashtable<>();
        for (int i = 0; i < ans.length; i++) {
            hash_table.put(ans[i], i);
        }

// sorting of the array having sum of elements in each rows.
        for (int i = 0; i < ans.length; i++) {
            for (int j = i + 1; j < ans.length; j++) {
                if (ans[i] > ans[j]) {
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }

        for(int i=0; i<k; i++){
            System.out.print(hash_table.get(ans[i])+" ");
        }


    }
}






