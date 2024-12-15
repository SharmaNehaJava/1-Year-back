package leetcode;

//reversing a string
public class String_builder_prb1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Maruti");

        for(int i=0; i<sb.length()/2;i++){
            int l = sb.length()-1-i;
            char first = sb.charAt(i);
            char back = sb.charAt(l);

            sb.setCharAt(i, back);
            sb.setCharAt(l,first);

        }
        System.out.println(sb);
    }
}
