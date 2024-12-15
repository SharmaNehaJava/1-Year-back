package leetcode;

import java.sql.SQLOutput;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tonny");
        System.out.println(sb);

//        find the character at index
        System.out.println(sb.charAt(0));

//        set the character or replace the character with another one
        sb.setCharAt(0,'H');
        System.out.println(sb);

//        insert a character
        sb.insert(0, 'P');
        System.out.println(sb);

//        delete a character
//        here 2 is exclusive
        sb.delete(1,2);
        System.out.println(sb);

//        append = inserting a character at the end
        sb.append('i');
        sb.append('e');
        System.out.println(sb);

//        printing the length
        System.out.println(sb.length());
    }
}
