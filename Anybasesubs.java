import java.util.Scanner;

public class Anybasesubs {

    public static int subs(int num1, int num2, int base){
        int ans = 0;
        int borrow = 0;
        int pow = 0;

        for (int i = num1,j = num2; i>0 ; i/=10,j/=10 ){
            int rem1 = i%10;
            int rem2 = j%10;

            int sub = 0;

            rem1 = rem1+borrow;

            if (rem1>=rem2){
                borrow = 0;
                sub = rem1-rem2;

            }else {
                borrow = -1;
                sub = (rem1+base)-rem2;

            }

            ans = ans + sub*(int)Math.pow(10,pow);
            pow++;


        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number = ");
        int num2 = sc.nextInt();

        System.out.print("Enter base number = ");
        int base = sc.nextInt();

        System.out.print("Answer = "+subs(num1,num2,base));


    }
}
