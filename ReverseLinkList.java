public class ReverseLinkList {
//    public static Node3 reverse(Node3 previous, Node3 curr){
//        if (curr==null){
//            return previous;
//        }
//        Node3 forward = curr.next;
//        curr.next = previous;
//        return reverse(curr,forward);
//    }

    static Node3 reverse1(Node3 head){
        if (head==null || head.next==null){
            return head;
        }

        Node3 subHead = reverse1(head.next);
        head.next.next = head;

        head.next = null;
        return subHead;
    }

    public static void main(String[] args) {
        reverseLL list = new reverseLL(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.print();
//        list.reverse();
//        Node3 previous = null;
//        Node3 curr = list.head;
//        System.out.println(reverse(previous,curr).data);
        reverse1(list.head);

            list.print();

    }
}
class Node3{
    int data;
    Node3 next;
    Node3(int d){
        this.data = d;
        this.next = null;
    }
}
class reverseLL{
    Node3 head;
    Node3 tail;
    int size;

    reverseLL(int data){
        head = new Node3(data);
        tail = head;
        size = 1;
    }

    void insert(int data){
        Node3 temp = new Node3(data);
        tail.next = temp;
        tail = temp;
        size++;
    }

    void reverse(){
        Node3 previous = null;
        Node3 curr = head;
        Node3 forward;

        while(curr!=null){
            forward = curr.next;
            curr.next = previous;
            previous = curr;
            curr = forward;
        }
        Node3 temp2 = previous;
        while (temp2!=null){
            System.out.print(temp2.data+" ");
            temp2 = temp2.next;
        }
        System.out.println();
    }



    void print(){
        Node3 temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


}
