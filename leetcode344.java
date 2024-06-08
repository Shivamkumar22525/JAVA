import java.util.*;
public class leetcode344 {
    public static void reverse(char[] s){
//        int i = 0;
//        int j = s.length-1;
//        while(i<=j){
//            char ch  = s[i];
//            s[i] = s[j];
//            s[j] = ch;
//            i++;
//            j--;
//        }
        Stack<Character> str = new Stack<>();

        for(int i = 0; i<s.length; i++){
            str.push(s[i]);
        }
        for (int i = 0; i<s.length; i++){
            s[i] = str.peek();
            str.pop();
        }


    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
//        reverse(s);
        reverse(s);
        for(int i = 0; i<s.length; i++){
            System.out.print(s[i]+" ");
        }

    }
}
