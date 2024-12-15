package DAA_practice.BootCamp;
import java.util.*;
public class TwoLinkedListSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("n");
//        int n1= sc.nextInt();
        LinkedList<Integer> l1= new LinkedList<>();
        l1.add(3);
        l1.add(5);
        l1.add(4);
//        int i=0;
//        while(i<n1){
//            int val = sc.nextInt();
//            l1.add(val);
//            i++;
//        }
//        System.out.println("n");
//        int n2= sc.nextInt();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);
//        i=0;
//        while(i<n2){
//            int val = sc.nextInt();
//            l2.add(val);
//            i++;
//        }

        // sol
        sum(l1,l2,l1.size(),l2.size());
        display(l1);
    }
    public static void sum(LinkedList<Integer> l1, LinkedList<Integer> l2, int n1, int n2){
        int sum =0;
        int count=0;
        for(int i=0;i<l1.size();i++){
            sum=0;
            sum+=l1.get(i);
            if(i<l2.size()){
                sum+=l2.get(i);
            }
            if(count!=0){
                sum+=count;
            }
            l1.set(i,sum%10);
            count=sum/10;
        }
        int i=l2.size();
        if(i<l2.size()){
            if(count!=0){
                l1.add(l2.get(i)+count);
            }
            l1.add(l2.get(i));
        }
        if(count!=0){
            l1.add(count);
        }
    }
    public static void display(LinkedList<Integer> l) {
        for (int e : l) {
            System.out.print(e + " ");
        }
    }
}
