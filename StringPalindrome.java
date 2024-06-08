import java.util.Scanner;

public class StringPalindrome {
    public static int lowercase(char ch){
        if (ch>='a'&& ch<='z'){
            return ch;
        }else {
//            int temp = ch-'A'+'a';
//            return temp;
            return ch-'A'+'a';
        }
    }
    public static boolean palindrome(char[] ch,int i,int j){
        while(i<j){
            if((ch[i]>=32 || ch[i]<=47) && (ch[j]>=32 || ch[j]<=47)){
                i++;
                j--;
            }else if (lowercase(ch[i])!=lowercase(ch[j])){
                return false;
            }else {
                i++;
                j--;
            }            //str.charAt(i)
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] ch = sc.next().toCharArray();
        int i = 0;
        int j = ch.length-1;
        if(palindrome(ch,i,j)){
            System.out.println("Yes,it is palindrome");
        }else{
            System.out.println("No,it's not palindrome");
        }



    }
}
