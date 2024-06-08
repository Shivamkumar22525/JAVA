import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class leetcode1002 {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        int[] count = new int[26];
        String s = words[0];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            count[ch-'a']++;
        }
        for(int i = 1; i< words.length; i++){
            int[] count1 = new int[26];
            String s1 = words[i];
            for(int j = 0; j<s1.length(); j++){
                char ch = s1.charAt(j);
                count1[ch-'a']++;
            }
            for(int k = 0; k<count1.length; k++){
                int min = Math.min(count[k],count1[k]);
                count[k] = min;
            }
        }
        for (int i = 0; i<count.length; i++){
            System.out.print(count[i]+" ");
        }
        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<count.length; i++){
            if (count[i]>0){
                for(int j = 0; j<count[i]; j++){
                    char ch = (char)('a'+i);
                    list.add("" + ch);
                }
            }
        }
        System.out.println(list);

    }
}
