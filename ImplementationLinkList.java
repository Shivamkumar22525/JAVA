//public class ImplementationLinkList {
//    public static void main(String[] args) {
//        LinkList list = new LinkList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(50);
//        list.addLast(60);
//        list.display();
////        System.out.println(list.size());
////        list.removeFirst();
////        System.out.println(list.size());
////        list.display();
////        System.out.println(list.getFirst());
////        System.out.println(list.getLast());
////        System.out.println(list.getIndex(5));
////        list.addFirst(100);
////        list.display();
//        list.addIndex(3,70);
//        list.display();
////        System.out.println(list.size());
////        list.removeLast();
////        list.display();
////        System.out.println(list.size());
//        list.reverseNode();
//        list.display();
//
//
//
//    }
//}
//class Node{
//    Node head;
//    int data;
//    Node next;
//}
//
//class LinkList{
//    Node head;
//    Node tail;
//    int size;
//
//    public void addLast(int val){
//        Node temp = new Node();
//        temp.data = val;
//        temp.next = null;
//        if (size==0){
//            head = temp;
//            tail = temp;
//        }else {
//            tail.next = temp;
//            tail = temp;
//        }
//        size++;
//    }
//    public void addFirst(int newNum){
//        Node temp = new Node();
//        temp.data = newNum;
//        temp.next = head;
//        head = temp;
//        if (size==0){
//            tail = temp;
//        }
//        size++;
//    }
//
//    public void addIndex(int newIdx,int newVal){
//        if (newIdx<0){
//            System.out.println("Invalid argument");
//        } else if (newIdx==0) {
//            addFirst(newVal);
//        } else if (newIdx==size) {
//            addLast(newVal);
//        }else{
//            Node temp = head;
//            for (int i = 0; i<newIdx-1; i++){
//                temp = temp.next;
//            }
//            Node node = new Node();
//            node.data = newVal;
//            node.next = temp.next;
//            temp.next = node;
//            size++;
//        }
//
//    }
//
//    int getFirst(){
//        if (size==0){
//            System.out.println("List is Empty");
//            return -1;
//        }else {
//            return head.data;
//        }
//    }
//
//    int getLast(){
//        if (size==0){
//            System.out.println("List is empty");
//            return -1;
//        }else{
//            return tail.data;
//        }
//    }
//
//    int getIndex(int idx){
//        if (size==0){
//            System.out.println("List is empty");
//            return -1;
//        } else if (idx<0 || idx>=size) {
//            System.out.println("Invalid arguments");
//            return -1;
//        }else{
//            Node temp = head;
//            for (int i = 0; i<idx; i++){
//                temp = temp.next;
//            }
//            return temp.data;
//        }
//    }
//
//    public void display(){
//        Node temp = head;
//        while (temp!= null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    public void removeFirst(){
//        if (size==0){
//            System.out.println("List is empty");
//        } else if (size == 1) {
//            head= null;
//            tail= null;
//            size=0;
//        }else {
//            head = head.next;
//            size--;
//        }
//    }
//    public int size(){
//        return size;
//    }
//
//    public void removeLast(){
//        if (size==0){
//            System.out.println("List is empty");
//        } else if (size == 1) {
//            head= null;
//            tail= null;
//            size=0;
//        }else {
//            Node temp = head;
//            for (int i = 0; i<size-2; i++){
//                temp = temp.next;
//            }
//            tail = temp;
//            temp.next = null;
//            size--;
//        }
//    }
//
//    private Node getNode(int idx){
//        Node temp = head;
//        for (int i = 0; i<idx; i++){
//            temp = temp.next;
//        }
//        return temp;
//    }
//    public void reverseNode(){
//        int li = 0;
//        int ri = size-1;
//        while(li<ri){
//            int temp = getNode(li).data;
//            getNode(li).data = getNode(ri).data;
//            getNode(ri).data = temp;
//            li++;
//            ri--;
//        }
//    }
//
//
//}