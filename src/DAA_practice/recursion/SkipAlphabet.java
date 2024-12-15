package DAA_practice.recursion;

public class SkipAlphabet {
    public static void main(String[] args) {
        String s = "Aami tomake bhalo bhashi";
        System.out.println(s);
        recursion('a', "", s);
        String ans = recursion('a',s);
        System.out.println(ans);
    }
//    string as a return type
    public static String recursion(char c,String s){
        if(s.isEmpty()){
            return "";
        }
        char curr = s.charAt(0);
        if(curr==c){
            return recursion(c, s.substring(1));
        }else{
            return curr+ recursion(c, s.substring(1));
        }
    }
//  void as a return type
    public static void recursion(char c,String empty, String given){
        if(given.isEmpty()){
            System.out.println(empty);
            return;
        }
        char curr = given.charAt(0);
        if(curr==c){
            recursion(c,empty,given.substring(1));
        }else{
            recursion(c, empty+curr, given.substring(1));
        }
    }

}
