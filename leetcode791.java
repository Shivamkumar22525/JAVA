public class leetcode791 {
    public static void main(String[] args) {
        String s = "abcd";
        String order = "cba";
        int[] count = new int[26];
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            count[ch-'a']++;
        }
//        for (int i = 0; i<count.length; i++){
//            System.out.println(count[i]);
//        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i<order.length(); i++){
            char ch = order.charAt(i);
            while (count[ch-'a']!=0){
                str.append(ch);
                count[ch-'a']--;

            }
        }
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            while (count[ch - 'a'] != 0) {
                str.append(ch);
                count[ch - 'a']--;

            }
        }
        System.out.println(str.toString());

    }
}
