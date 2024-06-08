import java.util.Scanner;

public class StringPalindrome2 {
    public static int lowercase(char str){
        if(str>='a'&& str<='z'){
            return str;
        }else{
            return str-'A'+'a';
        }
    }

    public static boolean checkPalindrome(String str) {

        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if((str.charAt(i)<=47) || (str.charAt(i)>=58 && str.charAt(i)<=64)|| (str.charAt(i)>=91 && str.charAt(i)<=96)|| (str.charAt(i)>=123 && str.charAt(i)<=126)){
                i++;
            }else if(str.charAt(j)<=47 || (str.charAt(j)>=58 && str.charAt(j)<=64)|| (str.charAt(j)>=91 && str.charAt(j)<=96)|| (str.charAt(j)>=123 && str.charAt(j)<=126)){
                j--;
            }else if(lowercase(str.charAt(i)) != lowercase(str.charAt(j))){
                return false;
            }else {
                i++;
                j--;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkPalindrome(str));


    }
}
