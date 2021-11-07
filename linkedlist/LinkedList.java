package linkedlist;

import java.awt.event.ItemEvent;

public class LinkedList {
    private class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    private Node head;
    public void addAtFirst(int data ){
        Node nn = new Node(data);
        nn.next=head;
        head=nn;
    }
    public void printList(){
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+"->");
            tmp=tmp.next;
        }
        System.out.print("null\n");
    }
    public void addAtEnd(int data){
        Node nn =new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        Node tmp=head;
        while(tmp.next!=null) tmp=tmp.next;
        tmp.next=nn;
    }
    public void addAtMiddle(int idx, int data){
        if(idx<0) return;
        if(idx==0){
            addAtFirst(data);
            return;
        }
        Node tmp=head;
        for(int i=0;i<idx-1;i++) tmp=tmp.next;
        Node nn = new Node(data);
        nn.next=tmp.next;
        tmp.next=nn;
    }
    public void deleteAtFirst(){head=head.next;}
    public void deleteAtEnd(){
        Node tmp=head;
        while(tmp.next.next!=null) tmp= tmp.next;
        tmp.next=null;
    }
    public void deleteAtIndex(int idx){
        if(idx==0) deleteAtFirst();
        Node tmp=head;
        for (int i = 0; i < idx-1; i++) tmp=tmp.next;
        tmp.next=tmp.next.next;
    }
    public void nthFromEnd(int n){
        Node tmp1=head;
        Node tmp2=head;
        for (int i=1;i<n;i++) tmp2=tmp2.next;
        while(tmp2.next!=null){
            tmp1=tmp1.next;
            tmp2=tmp2.next;
        }
        System.out.println(tmp1.data);

    }


    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
        for (int i = 7; i >=1 ; i--) {
            ll.addAtFirst(i);
        }
        ll.nthFromEnd(2);
        ll.addAtFirst(101);
        ll.addAtEnd(111);
        ll.deleteAtFirst();
        ll.deleteAtEnd();
        ll.addAtMiddle(3,333);
        ll.deleteAtIndex(3);
        ll.printList();
    }


}
