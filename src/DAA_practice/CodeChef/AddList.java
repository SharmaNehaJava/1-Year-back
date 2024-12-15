package DAA_practice.CodeChef;
import java.util.*;
public class AddList {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t;i++){
            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int j=0; j<n;j++){
                arr[j]=sc.nextInt();
            }
            helper(arr);
        }
    }
    public static void helper(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        boolean b = false;
        if(arr.length==1){
            System.out.println(0);
            return;
        }
        else{
            for(int i=0; i<arr.length;i++){
                if(s.contains(arr[i])){
                    b=true;
                    break;
                }
                s.add(arr[i]);
            }
        }
        if(s.size()==1){
            System.out.println(0);
            return;
        }else if(s.size()>1 && b){
            System.out.println(arr.length-1);
            return;
        }
        System.out.println(-1);

    }
}
