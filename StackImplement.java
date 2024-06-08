//public class StackImplement {
//    public static void main(String[] args) {
//        Stack st = new Stack(5);
//        st.push(13);
//        st.push(12);
//
//        System.out.println(st.peek());
//        st.pop();
//        System.out.println(st.peek());
//        st.isEmpty();
//
//    }
//}
//class Stack{
//    int size;
//    int top;
//    int[] arr;
//
//    Stack(int size){
//        this.size = size;
//        top = -1;
//        arr = new int[size];
//    }
//
//    void push(int el){
//        if(size-top>1){
//            top++;
//            arr[top] = el;
//        }else{
//            System.out.println("Stack overflow");
//        }
//    }
//    void pop(){
//        if(top >=0){
//            top--;
//        }else{
//            System.out.println("Stack underflow");
//        }
//    }
//
//     int peek(){
//        if(top>=0){
//            return arr[top];
//        }else{
//            return top;
//        }
//     }
//
//     boolean isEmpty(){
//        if(top==-1){
//            return true;
//        }else{
//            return false;
//        }
//     }
//
//}
//
