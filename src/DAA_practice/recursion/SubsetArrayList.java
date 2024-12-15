package DAA_practice.recursion;

import java.util.ArrayList;
import java.util.List;

// return a arrayList of arrays containing numbers using recursion
public class SubsetArrayList {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> n : ans){
            System.out.println(n);
        }
    }
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int num: arr){
            int n = ans.size();
            for(int i=0; i<n;i++){
                List<Integer> internal = new ArrayList<>(ans.get(i));
                internal.add(num);
                ans.add(internal);
            }
        }
        return ans;
    }
}
