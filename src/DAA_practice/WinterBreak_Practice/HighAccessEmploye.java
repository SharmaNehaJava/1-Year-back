//package DAA_practice.WinterBreak_Practice;
//import java.util.*;
////https://leetcode.com/problems/high-access-employees/
//
///*2933. High-Access Employees
//Input: access_times = [["a","0549"],["b","0457"],["a","0532"],["a","0621"],["b","0540"]]
//Output: ["a"]
//Explanation: "a" has three access times in the one-hour period of [05:32, 06:31] which are 05:32, 05:49, and 06:21.
//But "b" does not have more than two access times at all.
//So the answer is ["a"].
// */
//public class HighAccessEmploye {
//    public static void main(String[] args) {
//        List<List<String>> l = new ArrayList<>();
//        l.add(List.of("a","0549"));
//        l.add(List.of("b","0457"));
//        l.add(List.of("a","0532"));
//        l.add(List.of("a","0621"));
//        l.add(List.of("b","0540"));
//        List<String> ans = findHighAccessEmployees(l);
//        System.out.println(ans);
//    }
//    public static List<String> findHighAccessEmployees(List<List<String>> access_times) {
//       HashMap<String, List<Integer>> map = new HashMap<>();
//       List<String> ans = new ArrayList<>();
//
//        for(int i=0; i<access_times.size();i++){
//            if(!map.containsKey(access_times.get(i).get(0))){
//                map.put(access_times.get(i).get(0), new ArrayList<>());
//            }
//            map.get(access_times.get(i).get(0)).add(Integer.parseInt(access_times.get(i).get(1)));
//        }
//
//        for(String k:map.keySet()){
//            List<Integer> l = map.get(k);
//            Collections.sort(l);
//            if(highAccess(l)){
//                ans.add(k);
//            }
//        }
//        return ans;
//    }
//    public static boolean highAccess(List<Integer> l){
//        for(int i=2;i< l.size();i++){
//            int curr = l.get(i);
//            int prev = l.get(i-2);
//            if(prev+99>=curr){
//                return true;
//            }
//        }
//        return false;
//    }
//}
