package leetcode;

public class Bit_manipulation {
    public static void main(String[] args) {
        int n =5;
        int pos= 2;
//        int bitmask =1<<pos;

//        get bit
//        if((bitmask & n) ==0){
//            System.out.println("This bit was 0");
//        }else{
//            System.out.println("This bit was 1");
//        }

//        set bit
//        int bitMask = 1<<pos;
//        int ans = bitMask | n;
//        System.out.println(ans);

//        clear bit
        int bitmask =1<<pos;
        int notBit = ~(bitmask);
        int ans = notBit & n;
        System.out.println(ans);
    }
}
