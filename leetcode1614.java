public class leetcode1614 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int depth = 0;
        int open = 0;
        for (char ch: s.toCharArray()){
            if (ch=='('){
                open++;
            }
            if (ch==')'){
                open--;
            }
            depth = Math.max(depth,open);
        }
        System.out.println(depth);
    }
}
