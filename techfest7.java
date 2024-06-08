public class techfest7 {
    public static int reverse(int a){
        int res = 0;
        while(a!=0){
            int dig = a%10;
            res = res*10+dig; //previous operator was subs
            a = a/10; // changes to divide operator
        }
        return res;
    }
    public static void main(String[] args) {
        int a = 1221234234;
        int b = reverse(a);
        if (a==b){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
