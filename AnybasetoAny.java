import java.util.Scanner;

public class AnybasetoAny {

    public static int AtoA(int num,int base1,int base2){
        int ans = 0;
        int pow = 0;
        for (int i = num; i>0; i/=base2){
            int rem = i%base2;
            ans= ans+rem*(int)Math.pow(base1,pow);
            pow++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to change = ");
        int num = sc.nextInt();

        System.out.print("Enter base2 number = ");
        int base2 = sc.nextInt();

        System.out.print("Enter power of base1 = ");
        int base1 = sc.nextInt();

        System.out.println(AtoA(num,base1,base2));
    }
}
