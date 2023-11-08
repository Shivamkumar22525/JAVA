import java.util.Scanner;

public class decbasetoany {

    public static int dectoany(int dec,int base2){
        int ans = 0;
        int pow = 0;
        for (int i = dec; i>0; i/=base2){
            int rem = i%base2;
            ans = ans + rem * (int) Math.pow(10,pow);
            pow++;
        }
      return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your decimal number = ");
        int dec = sc.nextInt();

        System.out.print("Enter base number = ");
        int base2 = sc.nextInt();

        System.out.println(dectoany(dec,base2));

    }
}