public class leetcode2486 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "abc";
        int i = 0;
        int j = 0;
        while(j<t.length() && i<s.length()){
            if(t.charAt(j)==s.charAt(i)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        int cnt = t.length()-j;
        System.out.println(cnt);




    }
}
