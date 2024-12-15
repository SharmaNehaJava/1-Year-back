package leetcode;

import java.util.List;
import java.util.LinkedList;
public class LInkedListTest {
    public static void main(String[] args) {
        List<Integer> l= new LinkedList();
        l.add(12);
        l.add(76);
        l.add(54);
        for(Integer o:l){
            System.out.println(o+1);
        }
    }
}
