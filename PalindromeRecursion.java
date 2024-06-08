public class PalindromeRecursion {
    public static boolean check(char[] ch,int i){
        if (i>ch.length-1){
            return false;
        }
        if (ch[i]==ch[ch.length-i-1]){
            i++;

            check(ch,i);
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "helleh";
        char[] ch = s.toCharArray();
        int i = 0;
//        int j = ch.length-1;
        System.out.println(check(ch,i));
        System.out.println(ch[ch.length-1]);


    }
}
