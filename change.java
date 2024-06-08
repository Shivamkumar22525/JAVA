import java.util.*;
public class change {
    public static void main(String[] args) {

        String s = "AbcKJAGSDKaksjfdkafdE";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            int ch = s.charAt(i);
            if (ch>=65 && ch<=90){
                char ch1 = (char)(s.charAt(i)+32);
                str.append(ch1);
            } else if (ch>=97 && ch<=122) {
                char ch1 = (char)(s.charAt(i)-32);
                str.append(ch1);
            }
        }
        System.out.println(str.toString());
    }
}
