public class Palindrome {

    public static void palindrome(int n){

        int rev = 0;

        for (int i = n; i>0; i/=10){
            int LD = i%10;

            rev = (rev*10)+LD;
        }

        if (n == rev){
            System.out.println(n + " is a palindrome number");
        }else {
            System.out.println(n + " is not a palindrome number");
        }

    }
    public static void main(String[] args) {

        palindrome(9);

    }
}
