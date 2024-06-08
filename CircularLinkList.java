import java.util.*;
public class CircularLinkList {
    static boolean check(Node2 head){
        if (head==null){
            return false;
        }
        if (head.next==null){
            return false;
        }
        Node2 slow = head;
        Node2 fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next;
            if (fast.next!=null){
                fast = fast.next;
            }
//            fast = fast.next.next;
            if (slow==fast){
                return true;
            }

        }

            return false;
//        }
//        Node2 temp = head;
//        HashMap<Node2,Boolean> map = new HashMap<>();
//        while(temp!=null){
//            if (map.containsKey(temp)){
//                return true;
//            }else {
//                map.put(temp,true);
//            }
//            temp = temp.next;
//        }
//
//        return false;

    }
    public static Node2 removeLoop(Node2 head) {
        // Write your code here.
        HashMap<Node2,Boolean> map = new HashMap<>();
        Node2 pre = null;
        Node2 temp = head;
        while(temp!=null){
            if(map.containsKey(temp)==true){
                pre.next  = null;
                break;
            }else{
                map.put(temp,true);
            }
            pre = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertNode(9,5);
        list.insertNode(5,6);
        list.insertNode(5,9);
        list.insertNode(6,12);

//        System.out.println(check(list.tail));
//        if (check(list.tail)){
//            System.out.println("A circular link list");
//        }else {
//            System.out.println("Not a circular");
//        }
//
//
//        list.print();
        Node2 temp2 = removeLoop(list.tail);
        while(temp2!=null){
            System.out.print(temp2.data+" ");
            temp2 = temp2.next;
        }
        System.out.println();
        if (check(list.tail)){
            System.out.println("A circular link list");
        }else {
            System.out.println("Not a circular");
        }

//        list.delete(5);
//        list.print();

    }
}
class Node2{
    int data;
    Node2 next;

    Node2(int data){
         this.data = data;
         this.next = null;
    }
}
class CLL{
    Node2 head;
    Node2 tail;
    int size;

    CLL(){
        head = null;
        tail = null;
        size = 1;
    }

    void insertNode(int element,int d){
        if (tail==null){
            Node2 node  = new Node2(d);
            tail = node;
            node.next = node;
            size = 1;
        }else {
            Node2 curr = tail;

            while(curr.data!= element){
                curr = curr.next;
            }
            Node2 temp = new Node2(d);
            temp.next = curr.next;
            curr.next = temp;
            size++;
        }
    }

    void delete(int element){
        if (tail== null){
            System.out.println("List is empty");
            return;
        }else {
            Node2 previous = tail;

            Node2 curr = previous.next;

            while(curr.data!=element){
                previous = curr;
                curr = curr.next;

            }
            previous.next = curr.next;
            if (previous==curr){
                tail = null;
            }else if (curr == tail){
                tail = previous;
            }
            curr.next = null;
        }
    }

    void print(){
        if (tail==null){
            System.out.println("List is empty");
            return;
        }
        Node2 temp = tail;

        do {
            System.out.print(tail.data+" ");
            tail = tail.next;
        }while (tail!=temp);
        System.out.println();
    }


}
