package DAA_practice.Graph;
import java.util.*;
public class Center {
    public static void main(String[] args){
        int[][] edges = {{1,2},{2,3},{4,2}};
        int ans = findCenter(edges);
        System.out.println(ans);
    }
    public static int findCenter(int[][] edges) {
        int[] arr = new int[edges.length+2];

        for(int i=0; i<edges.length;i++){
            arr[edges[i][0]]++;
            arr[edges[i][1]]++;
        }

        for(int i=1; i<arr.length;i++){
            if(arr[i]==arr.length-1)return i;
        }
        return 1;
    }
}
