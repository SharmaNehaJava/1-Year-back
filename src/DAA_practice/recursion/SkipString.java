package DAA_practice.recursion;

public class SkipString {
    public static void main(String[] args) {
        String s = "Aami tomake bhalo bhashi";
        String p = "tomake";
        System.out.println(s);

        String ans = recursion(p,s);
        System.out.println(ans);
    }
    //    string as a return type
    public static String recursion(String c,String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith(c)){
            return recursion(c,s.substring(c.length()+1));
        }else{
            char curr = s.charAt(0);
            return curr + recursion(c, s.substring(1));
        }
    }
}
