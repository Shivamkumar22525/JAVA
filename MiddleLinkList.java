public class MiddleLinkList {

    static int total(Node4 head){
        int count = 0;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;

    }

    static Node4 middle(Node4 head){
        int count = total(head);
        int position;
        if (count/2==0){
            position = (count/2)+1;
        }else {
            position = count/2;
        }
        int cnt = 0;
        Node4 temp = head;
        while(cnt<position){
            temp = temp.next;
            cnt++;
        }
        return temp;
    }
    static Node4 reverse(Node4 head,int k){
        if(head==null){
            return null;
        }

        Node4 previous = null;
        Node4 curr = head;
        Node4 next = null;

        int count = 0;

        while(curr!=null && count<k){
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
            count++;
        }

        if(next!=null){
           head.next =  reverse(curr,k);
        }
        return previous;

    }
    public static void main(String[] args) {
        middleLL list = new middleLL(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
//        list.insert(60);

        list.print();
        int count = 0;
        System.out.println();
//        System.out.println(middle(list.head).data);
        Node4 temp = reverse(list.head,3);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }
}
class Node4{
    int data;
    Node4 next;
    Node4(int d){
        this.data = d;
        this.next = null;
    }
}
class middleLL{
    Node4 head;
    Node4 tail;
    int size;

    middleLL(int data){
        head = new Node4(data);
        tail = head;
        size = 1;
    }

    void insert(int data){
        Node4 temp = new Node4(data);
        tail.next = temp;
        tail = temp;
        size++;
    }


    void print(){
        Node4 temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


}

