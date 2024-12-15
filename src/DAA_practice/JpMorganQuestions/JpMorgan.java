package DAA_practice.JpMorganQuestions;
import java.util.*;

public class JpMorgan {
    public static void main(String[] args){
        String[] Tools = {"saw", "hammer", "mallet",
                "file", "saw", "ladder", "scissor"};
        int Idx = 6;
        String Find = "saw";

        helper(Tools, Idx, Find);
    }
    public static void helper(String[] str, int idx, String f){
        int min =Integer.MAX_VALUE;

        for(int i=0;i<str.length;i++){
            if(str[i]==f){
                int t = idx-i;
                int t2 = (idx % idx)+i+1;
                t = Math.min(t,t2);
                min = Math.min(t, min);
            }
        }
        System.out.println(min);
    }
}
