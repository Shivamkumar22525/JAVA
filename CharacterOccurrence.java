import java.util.*;

public class CharacterOccurrence {
    public static char occurrence(String s){
        int[] arr = new int[26];

        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }

        int max = 0;
        for (int i = 1; i<26; i++){
            if (arr[i]>arr[max]){
                max = i;
            }
        }
//        char s1 = (char) ('a'+max);
        return (char) ('a'+max);


    }
    public static void main(String[] args) {

        String s = "abababzzzzzzzzzzzzzzzzzzzzzzzzzabaaaaaa";

//        char[] s1 = s.toCharArray();

        System.out.println(occurrence(s));

    }
}
