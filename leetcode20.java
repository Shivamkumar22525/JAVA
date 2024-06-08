import java.util.*;
public class leetcode20 {
    public static void main(String[] args) {
        String s = ")";
        Stack<Character> building = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                building.push(ch);
            }
            if(building.isEmpty()){
                System.out.println(false);
                break;
            }else if(ch==')'){
                if(building.peek()=='('){
                    building.pop();
                }else{
                    System.out.println(false);
                    break;
                }
            }else if(ch=='}'){
                if(building.peek()=='{'){
                    building.pop();
                }else{
                    System.out.println(false);
                    break;
                }
            }else if(ch==']'){
                if(building.peek()=='['){
                    building.pop();
                }else{
                    System.out.println(false);
                    break;
                }
            }
        }
        System.out.println(building.empty());

    }
}
