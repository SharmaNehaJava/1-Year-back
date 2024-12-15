package leetcode;

public class R1_towerOfHanoi {
    public static void main(String[] args) {
        hanoi(3, "S","H", "D");

    }
    static void hanoi(int n, String source, String helper, String destination){
        if(n ==1){
            System.out.println("Transfer Disk "+n+" from "+ source+ " to "+ destination);
            return;
        }
        hanoi(n-1, source,destination , helper);
        System.out.println("Transfer Disk "+ n+" from "+source+" to "+destination);
        hanoi(n-1, helper, source, destination);
    }
}
