public class StackLL {
    public static void main(String[] args) {
        list List = new list();
        List.push(12);
        List.peek();
        List.pop();
        List.push(12);
        List.isEmpty();


    }
}
class op{
    op head;
    op next;
    int data;

}
class list{
    op head;
    op tail;
    int top = -1;

    void push(int data){
        op temp = new op();
        temp.data = data;
        temp.next = null;
        if(top==-1){
            head = temp;
            tail = temp;
            top++;
        }else{
            tail.next = temp;
            tail = temp;
            top++;
        }
    }
    void pop(){
        op temp = head;
        if(temp==null || temp.next==null){
            System.out.println("Stack is Empty");
            return;
        }

        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        top--;
    }

    void peek(){
        op temp = head;
        if(temp==null){
            System.out.println("Stack is Empty");
            return;
        }
        while(temp.next!=null){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    void isEmpty(){
        if(top==-1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}
