package DAA_practice.BootCamp;
import java.util.*;

public class unionSortedArray {
    public static void main(String[] args) {
        int[] a={1,2,3,3};
        int[] b ={2,2,4};

        List l = sortedArray(a,b);
        System.out.println(l);
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        List<Integer> l = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j] && !l.contains(a[i])){
                l.add(a[i]);
                i++;
            }else if(b[j]<a[i] && !l.contains(b[j])){
                l.add(b[j]);
                j++;
            }else{
                l.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<a.length){
            l.add(a[i]);
        }
        while(j<b.length){
            l.add(b[j]);
        }
        return l;
    }
}
