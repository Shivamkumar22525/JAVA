import java.util.Scanner;

public class breakofloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number = ");
        int n = sc.nextInt();

        int a = 0;

        int sum = 0;

        for (a=0;a<=n;a++){

            sum = sum + a;


            if (a==4){
                break;
            }

        }
        System.out.println("Sum = " + sum);
    }
}
