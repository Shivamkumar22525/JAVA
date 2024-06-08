import java.util.Arrays;

public class StringCompression {
    public static int comp(char[] s){
        int i = 0;
        int idx = 0;
        while(i<s.length){
            int j = i+1;
            while(j<s.length && s[i]==s[j]){
                j++;
            }
                s[idx++] = s[i];
            int count = j-i;
            if (count>1){
                String str = String.valueOf(count);
                char[] chArray = str.toCharArray();
                for (char ch:chArray){
                    s[idx++] = ch;
                }
//
            }
            i=j;
        }

        return idx;
    }
    public static void main(String[] args) {
        char[] s = {'a','a','b','b','c','c','c'};
//        for (String ch:s){
//            System.out.print(ch);
//        }
        System.out.println(comp(s));
//        for (int i = 0; i<comp(s); i++){
//            System.out.print(s);
//        }
        System.out.println(s);
        for (char ch:s){
            System.out.print(ch);
        }


    }
}
