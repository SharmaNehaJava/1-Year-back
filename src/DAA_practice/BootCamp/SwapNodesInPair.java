//package DAA_practice.BootCamp;
//import java.util.*;
//
//public class SwapNodesInPair {
//    public static void main(String[] args) {
//    }
//    public static ListNode swapPairs(ListNode head) {
//        if(head== null || head.next==null){
//            return head;
//        }
//        ListNode temp1 = head;
//        ListNode temp2 = head.next;
//        head = temp2;
//        ListNode temp= null;
//        while(temp2.next!=null && temp1.next.next!=null){
//            temp = temp2.next;
//            temp2.next= temp1;
//            temp1.next=temp;
//
//            //    update
//            temp1= temp1.next.next;
//            temp2= temp.next.next;
//        }
//        temp= null;
//        temp2.next = temp1;
//        temp1.next=null;
//
//
//        return head;
//    }
//}
