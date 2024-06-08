import java.util.Scanner;

public class Anybaseadd {

    public static int addition(int n1, int n2, int base){
        int ans = 0;
        int carry = 0;
        int pow = 0;
        for (int i = n1,j = n2; i>0 || carry>0; i/=10,j/=10){
            int rem1 = i%10;
            int rem2 = j%10;

            int add = rem1+rem2+carry;
            carry = add/base;

            add = add%base;

            ans+=add*(int)Math.pow(10,pow);
            pow++;


        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number = ");
        int n1 = sc.nextInt();

        System.out.print("Enter your second number = ");
        int n2 = sc.nextInt();

        System.out.print("Enter base = ");
        int base = sc.nextInt();

        System.out.println(addition(n1,n2,base));



    }
}
