package DAA_practice.BootCamp;
import java.util.*;
public class NTestCaseIspalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            LinkedList<Integer> l = new LinkedList<>();
            while(true){
                int val = sc.nextInt();
                if(val==-1){
                    break;
                }
                l.add(val);
            }
            if(l.size()<=1){
                System.out.println("true");
                break;
            }else{
                reverseHalf(l);
                isPalindrome(l);
            }
            // reverseHalf(l);
            // isPalindrome(l);
        }
    }
    public static void reverseHalf(LinkedList<Integer> l){
        int mid = l.size()/2;

        for(int i=mid;i<l.size()-i;i++){
            int temp = l.get(l.size()-i+1);
            l.set(i, l.get(l.size()-i+1));
            l.set(l.size()-i+1,temp);
        }

    }
    public static void isPalindrome(LinkedList<Integer> l){
        int mid =l.size()/2;
        for(int i=0;i<mid;i++){
            if(!l.get(i).equals(l.get(mid+i))){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}

