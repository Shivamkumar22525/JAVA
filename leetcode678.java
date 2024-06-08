public class leetcode678 {
    public static boolean check(String s,int open,int close,int ast){
        if(open==close){
            return true;
        }
        for (int i = 0; i<=ast; i++){
            if (open+i==close){
                return true;
            } else if (close+i==open) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        int open = 0;
        int close = 0;
        int ast = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                open++;
            }else if(ch==')'){
                close++;
            }else if(ch=='*'){
                ast++;
            }
        }
        System.out.println(check(s,open,close,ast));

    }

}
