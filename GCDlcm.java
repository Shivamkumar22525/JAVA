import java.util.Scanner;

public class GCDlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        int a = sc.nextInt();

        System.out.print("Enter the second number = ");
        int b = sc.nextInt();

        int n1 = a;
        int n2 = b;

        while (a % b !=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        int GCD = b;
        System.out.println("GCD = " + GCD);


        int LCM = n1*n2/GCD;
        System.out.println("LCM = " + LCM);
    }
}
