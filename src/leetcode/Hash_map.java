package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_map {
    public static void main(String[] args) {
//        Key-Value
//        Cartoon-WinGame
        HashMap<String, Integer> hm = new HashMap<>();

//        Insertion
//        Hash map are unordered set, means order of the set is not maintained
        hm.put("Superman", 2);
        hm.put("Shinchan", 3);
        hm.put("Oggie", 1);
        hm.put("Hagimaru", 6);

//        if key already present then update otherwise create a new one.
        hm.put("Oggie", 8);
        hm.put("Shaktimaan", 10);

//        print map
        System.out.println(hm);

//        Searching, is key present or not?
//        this function returns the boolean value
        if(hm.containsKey("Shaktimaan")){
            System.out.println("Jai Mata Dii !!, Me Present:) ");
        }

//        Printing value of key
//        if present then output is Value
//        otherwise null
        System.out.println(hm.get("Superman"));
        System.out.println(hm.get(("Doraemon")));

//        Iteration in normal loop
//        1st Method
//        int[] arr = {2,34,8,73,5};
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();

//        2nd Method, Enhanced for loop
//        for(int i :arr){
//            System.out.print(i+" ");
//        }

//        similarly using the Enhanced for loop we iterate over hashmap:)
        for(Map.Entry<String, Integer> e : hm.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println();

//              or (other way to iterate, using set for keys and values with the help of that key:)
        Set<String> keys = hm.keySet();
        for(String key :keys){
            System.out.println(key + " "+ hm.get(key));
        }


    }
}
