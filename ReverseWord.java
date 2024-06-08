import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {

        String s = "  manish kapoor     999     ";
        String[] str = s.split(" ");
        

        StringBuilder s1 = new StringBuilder();
        for (int i = str.length-1; i>=0; i--){
            if (str[i].length()>0){
                s1.append(str[i]);
                s1.append(" ");
            }

        }
        System.out.println(s1.toString().trim());
    }

}
