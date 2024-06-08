import java.util.Scanner;

public class StringPalindrome3 {
    public static int Lowercase(char str) {
        if (str >= 'a' && str <= 'z') {
            return str;
        } else {
            return str - 'A' + 'a';
        }
    }

    public static boolean checkPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(str.charAt(i))){
                i++;
            } else if (!Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            } else if (Lowercase(str.charAt(i)) != Lowercase(str.charAt(j))) {
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
