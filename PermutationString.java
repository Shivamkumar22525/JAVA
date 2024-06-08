public class PermutationString {
    public static boolean checkequal(int[] count1,int[] count2){
        for (int i = 0; i<26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean permutation(String s1,String s2){
        int[] count1 = new int[26];
        for (int i = 0; i<s1.length(); i++){
            int ch1 = s1.charAt(i)-'a';
            count1[ch1]++;
        }


        int i = 0;
        int window = s1.length();
        int[] count2 = new int[26];
        while (i<window && i<s2.length()){
            int ch2 = s2.charAt(i)-'a';
           count2[ch2]++;
           i++;
        }
        if (checkequal(count1,count2)){
            return true;
        }

        while(i<s2.length()){
            int newch = s2.charAt(i)-'a';
            count2[newch]++;

            int oldch = s2.charAt(i-window)-'a';
            count2[oldch]--;
            i++;

            if (checkequal(count1,count2)){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean s = permutation(s1,s2);
        System.out.println(s);
    }
}
