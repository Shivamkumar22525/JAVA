import java.util.*;


public class CreateLinkList {
    public static class Node{
        Node node1;
        int data;
        Node next;

    }
    public static class LinkList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            if (size==0){
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                head = temp;
                tail = temp;
                size++;
            }else {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                tail.next= temp;
                tail = temp;
                size++;
            }

            //Another way to add new node at last or make a new node as a head if size = 0.

//            Node temp = new Node();
//            temp.data = val;
//            temp.next = null;
//            if (size==0){
//                head = temp;
//                tail = temp;
//            }else {
//                tail.next= temp;
//                tail = temp;
//            }
//            size++;
        }

        public int size(){
            return size;
        }
        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }


    }
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addLast(10);
        list.addLast(20);
        System.out.println(list.size());
        list.display();


    }
}

