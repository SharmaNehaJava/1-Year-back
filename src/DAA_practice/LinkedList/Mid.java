package DAA_practice.LinkedList;

import java.util.List;

public class Mid {
    public static void main(String[] args) {
       LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(5);

        list.insertLast(6);

        list.insert(3, 8);
        list.display();
    }
}
class Node{
    Node next;
    int data;

    Node(int data){
        this.data= data;
        this.next= null;
    }
    Node(int data, Node node){
        this.data= data;
        this.next= node;
    }
}

class LL{
    Node head;
    int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next= head;
        head= node;

        size++;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next= node;
    }

    public void insert(int idx, int val){
        Node node = new Node(val);

        Node temp = head;
        int i=1;
        while(i<idx){
            temp=temp.next;
            i++;
        }
        node.next= temp.next;
        temp.next= node;

    }



    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }

}
