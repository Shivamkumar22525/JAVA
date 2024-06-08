public class ReverseStringRecursion {
    public static void reverse(char[] ch,int i,int j){
        if (i>j){
            return ;
        }
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        i++;
        j--;
        reverse(ch,i,j);
    }
    public static String check(String s){
        char[] ch = s.toCharArray();
        System.out.println();
        int i = 0;
        int j = ch.length-1;
        reverse(ch,i,j);
        String str = new String(ch);

        return str;
    }
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(check(s));



    }
}
