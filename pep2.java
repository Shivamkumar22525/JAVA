import java.util.Scanner;

public class pep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the odd number = ");
        int n = sc.nextInt();

        if (n%2!=0) {
            for (int i = 0; i < n / 2 - 1; i++) {

                for (int j = 0; j < n / 2 - i; j++) {
                    System.out.print(" * ");
                }
                for (int j = 0; j <= 2 * i; j++) {
                    System.out.print("   ");
                }
                for (int j = 0; j < n / 2 - i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" * ");
                }
                for (int j = 0; j < n - 2 * i - 2; j++) {
                    System.out.print("   ");
                }
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Error!!!!🤯🤯 \nEnter the odd number");
        }

    }
}
