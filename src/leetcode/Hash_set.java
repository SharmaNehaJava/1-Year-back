package leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

//        adding element in hash set.
        hs.add(6);
        hs.add(5);
        hs.add(2);
        hs.add(9);
        hs.add(2);

//        printing hashset
//        set do not contains duplicate values.
        System.out.println(hs);

//        removing an element
        hs.remove(2);
        System.out.println(hs);

//        searching an element
        if(hs.contains(6)){
            System.out.println("I do contains 6 :)");
        }
        if(!hs.contains(2)){
            System.out.println("I do not contain 2 ;)");
        }

//            size of hash set
        System.out.println("The size of your hash set is "+ hs.size());

//        Iterator
        Iterator it = hs.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
