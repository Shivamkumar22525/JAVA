import java.util.Scanner;

public class Anybasetodec {

    public static int basetodec(int num, int dec, int base){
        int ans = 0;
        int pow = 0;
        for (int i = num; i>0; i/=dec){
            int rem = i%dec;
            ans = ans + rem*(int)Math.pow(base,pow);
            pow++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to change = ");
        int num = sc.nextInt();

        int dec = 10;

        System.out.print("Enter base power = ");
        int base = sc.nextInt();

        System.out.println(basetodec(num,dec,base));

    }
}
