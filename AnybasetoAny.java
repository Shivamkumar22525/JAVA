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

//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int sourceBase = scn.nextInt();
//        int  destBase = scn.nextInt();
//
//        int res = getValue(n, sourceBase, destBase);
//        System.out.println(res);
//    }
//    public static int getValue(int n, int b1, int b2) {
//        int dec = getValueInDecimal(n, b1);
//        int dn = getValueInBase(dec, b2);
//        return dn;
//    }
//    public static int getValueInBase(int n, int b) {
//        int rv = 0;
//        int p = 1;
//        while (n > 0) {
//            int dig = n % b;
//            n = n / b;
//            rv = rv + (dig * p);
//            p = p * 10;
//        }
//        return rv;
//
//    }
//    public static int getValueInDecimal(int n, int b) {
//        int rv = 0;
//        int p = 1;
//
//        while (n > 0) {
//            int dig = n % 10;
//            n = n / 10;
//            rv = rv + (dig * p);
//
//            p = p * b;
//        }
//        return rv;
//    }
}
