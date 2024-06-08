public class leetcode1249 {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";

        char[] ch = s.toCharArray();
        int open = 0;
        int close = 0;

        for (int i = 0; i<ch.length; i++){
            if (ch[i]=='('){
                open++;
            }else if (ch[i]==')'){
                if (open>0){
                    open--;
                }else {
                    ch[i] = 0;
                }
            }

        }
        for (int i = ch.length-1; i>=0; i--){
            if (ch[i]==')'){
                close++;
            }
            if (ch[i]=='('){
                if (close>0){
                    close--;
                }else {
                    ch[i] = 0;
                }
            }

        }

        StringBuilder str = new StringBuilder();
        for (char ch1 : ch){
            if (ch1!=0){
                str.append(ch1);
            }
        }



        System.out.println(str);
    }
}
