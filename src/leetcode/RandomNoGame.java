package leetcode;///guessing the number

import java.util.Scanner;
import java.util.Random;
public class RandomNoGame {
    public static void main(String [] args){
        int count = 0;
        Random r = new Random();
        int random_no = r.nextInt(101);
//        System.out.println(random_no);

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, to the Game :)");
        System.out.println("Guess the number, and it's from 0 to 100");
        System.out.println("Enter your number ");
        int input_no = sc.nextInt();

        while(input_no != random_no){
             if(input_no > random_no){
                 System.out.println("Lower number please :)");
             }else {
                System.out.println("Higher number please :)");
            }
             count ++;
            System.out.println("Enter the number again :)");
            input_no = sc.nextInt();
        }
        System.out.println("Yeah you Won !!!!");
        System.out.println("Your total number of attempts to win the game is "+ count);

    }
}
