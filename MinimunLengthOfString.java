public class MinimunLengthOfString {
    public static void main(String[] args) {
        String s = "aabccabbaa";

        int i = 0;
        int j = s.length()-1;
        while(i<j && s.charAt(i)==s.charAt(j)){
            char ch = s.charAt(i);
            while(i<=j && s.charAt(i)==ch){
                i++;
            }
            while (j>=i && s.charAt(j)==ch){
                j--;
            }
        }
        if (i>j){
            System.out.println(0);
        }else {
            System.out.println(j-i+1);
        }



    }
}
