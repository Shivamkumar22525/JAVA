import java.util.*;

public class DoublyLinkList {
    public static void main(String[] args) {

        DLL list = new DLL(10);
//        System.out.println(list.head.previous);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.insertAtHead(60);

        list.print();
        System.out.println("head = "+list.head.data);
        System.out.println("tail = "+list.tail.data);
        System.out.println("Size = "+list.size);

        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtTail(70);

        list.print();
        System.out.println("head = "+list.head.data);
        System.out.println("tail = "+list.tail.data);
        System.out.println("Size = "+list.size);

        list.insertAtIndex(2,100);
        list.print();
        System.out.println("head = "+list.head.data);
        System.out.println("tail = "+list.tail.data);
        System.out.println("Size = "+list.size);


        list.deleteAtIndex(7);
        list.print();
        System.out.println("head = "+list.head.data);
        System.out.println("tail = "+list.tail.data);
        System.out.println("Size = "+list.size);


        list.deleteAtIndex(11);
        list.print();
        System.out.println("head = "+list.head.data);
        System.out.println("tail = "+list.tail.data);
        System.out.println("Size = "+list.size);



    }
}
class Node1{
    int data;
    Node1 previous;
    Node1 next;

    Node1(int d){
        this.data = d;
        this.previous = null;
        this.next = null;
    }
}

class DLL{
    Node1 head;
    Node1 tail;
    int size;

    DLL(int d){
        head = new Node1(d);
        tail = head;
        size = 1;
    }

    void insertAtHead(int d){

            Node1 temp = new Node1(d);
            temp.next = head;
            head.previous = temp;
            head = temp;


        size++;
    }

    void insertAtTail(int d){

            Node1 temp = new Node1(d);
            tail.next = temp;
            temp.previous = tail;
            tail = temp;


        size++;
    }

    void insertAtIndex(int idx, int data){
        if (idx == 1){
            insertAtHead(data);
            return;
        }
        Node1 temp = head;
        int cnt = 1;
        while (cnt<idx-1){
            temp = temp.next;
            cnt++;
        }
        if (temp.next == null){
            insertAtTail(data);
            return;
        }
        Node1 temp2 = new Node1(data);
        temp2.next = temp.next;
        temp.next.previous = temp2;
        temp.next = temp2;
        temp2.previous = temp;

        size++;
    }

    void deleteAtIndex(int d){
        if (d==1){
            Node1 temp = head;
            temp.next.previous = null;
            head = temp.next;
            temp.next = null;
            if (size==1){
                tail = head;
            }
        }else {
            Node1 pre = null;
            Node1 curr = head;
            int cnt = 1;
            while(cnt<d){
                pre = curr;
                curr = curr.next;
                cnt++;
            }if (curr.next==null){
                pre.next = null;
                if (d==size){
                    tail = pre;
                }

            }else {
                curr.previous = null;
                pre.next = curr.next;
                curr.next.previous = pre;
                curr.next = null;


            }

        }

        size--;

    }

    public void print(){
        Node1 temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}

