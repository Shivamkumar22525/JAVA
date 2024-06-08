import java.util.HashMap;

public class SinglyLinkList {
//    static boolean check(Node head) {
//        if (head == null) {
//            return false;
//        }
//        if (head.next == null) {
//            return false;
//        }
//        Node slow = head;
//        Node fast = head;
//        while (fast!=null && fast.next!=null) {
//            slow = slow.next;
//            fast = fast.next;
//            if (fast.next!=null){
//                fast = fast.next;
//            }
////            fast = fast.next.next;
//            if (slow == fast) {
//                return true;
//            }
//
//        }
//
//        return false;
//    }
//    static Node removeLoop(Node head) {
//        // Write your code here.
//        HashMap<Node,Boolean> map = new HashMap<>();
//        Node pre = null;
//        Node temp = head;
//        while(temp!=null){
//            if(map.containsKey(temp)==true){
//                pre.next  = null;
//                break;
//            }else{
//                map.put(temp,true);
//            }
//            pre = temp;
//            temp = temp.next;
//        }
//        return head;
//    }
//    static Node insert(Node tail, Node curr){
//        tail.next = curr;
//        tail = curr;
//        return tail;
//    }
    static Node sortList(Node head) {
        if(head.next ==null){
            return head;
        }
//        HashMap<Integer,Integer> map = new HashMap<>();
//        Node temp = head;
//        while(temp!=null){
//            if(map.containsKey(temp.data)){
//                map.put(temp.data,map.get(temp.data)+1);
//            }else{
//                map.put(temp.data,1);
//            }
//            temp = temp.next;
//        }
//        Node temp1 = head;
//        for(Integer key : map.keySet()){
//            int count = map.get(key);
//            while(count>0){
//                temp1.data = key;
//                map.put(key,count-1);
//                temp1 = temp1.next;
//                count--;
//            }
//        }
//        int zeros = 0;
//        int ones = 0;
//        int twos = 0;
//        Node temp = head;
//        while(temp!=null){
//            if(temp.data==0){
//                zeros++;
//            }else if(temp.data==1){
//                ones++;
//            }else if(temp.data==2){
//                twos++;
//            }
//            temp = temp.next;
//        }
//        temp = head;
//        while(temp!=null){
//            if(zeros!=0){
//                temp.data = 0;
//                zeros--;
//            }else if(ones!=0){
//                temp.data = 1;
//                ones--;
//            }else if(twos!=0){
//                temp.data = 2;
//                twos--;
//            }
//            temp = temp.next;
//        }
//        return head;
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;

        Node curr = head;

        while(curr!=null){
            if(curr.data==0){
                zeroTail.next = curr;
                zeroTail = curr;
            } else if (curr.data==1) {
                oneTail.next =curr;
                oneTail = curr;
            } else {
                twoTail.next =curr;
                twoTail = curr;
            }
            curr = curr.next;
        }

        zeroTail.next = oneHead.next;
        oneTail.next = twoHead.next;
        twoTail.next = null;

        return zeroTail.next;

    }
    public static void main(String[] args) {
        LL list = new LL(1);
        list.insertAtHead(0);
        list.insertAtHead(2);
        list.insertAtHead(1);
        list.insertAtHead(0);
        list.insertAtHead(2);
        list.insertAtHead(1);
//        list.tail.next = list.head;

        list.print();

//        list.insertAtIndex(3,22);
//        list.print();
//        list.insertAtIndex(3,21);
//        list.print();
//        System.out.println(list.head.data);
//        System.out.println(list.tail.data);
//        list.deleteIndex(2);

        list.print();
        
        System.out.println(sortList(list.head).data);
        System.out.println(list.head.data);
        list.print();

//        System.out.println("head: "+list.head.data);
//        System.out.println("tail: "+list.tail.data);
//        System.out.println(removeLoop(list.head));
//
//        if (check(list.head)){
//            System.out.println("A circular link list");
//        }else {
//            System.out.println("Not a circular");
//        }



    }
}
class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}
class LL{
    Node head;
    Node tail;
    int size;

    LL(int data){
        head = new Node(data);
        tail = head;
        size = 1;
    }

    public void insertAtHead(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        size++;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertAtTail(int data){
        Node temp = new Node(data);
        tail.next = temp;
        tail = temp;
        size++;
    }

    public void insertAtIndex(int idx,int data){
        if (idx == 1){
            insertAtHead(data);
            return;
        }
            Node temp = head;
            int cnt = 1;
            while (cnt<idx-1){
                temp = temp.next;
                cnt++;
            }
            if (temp.next == null){
                insertAtTail(data);
                return;
            }
            Node temp2 = new Node(data);
            temp2.next = temp.next;
            temp.next = temp2;

            size++;

    }

    public void deleteIndex(int idx){
        if (idx==1){
            head = head.next;
            if (size==1){
                tail = null;
            }
        }else{
            Node pre = null;
            Node curr = head;
            int cnt = 1;
            while(cnt<idx){
                pre = curr;
                curr = curr.next;
                cnt++;
            }
            pre.next = curr.next;
            if (idx==size){
                tail = pre;
            }
        }
        size--;

    }
}
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}