import java.util.Scanner;

public class pep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number = ");
        int n = sc.nextInt();

        if (n%2!=0) {
            for (int i = 0; i < n; i++) {
                if (i < n / 2) {

                    for (int j = 0; j < (n / 2 - i); j++) {
                        System.out.print("   ");
                    }
                    for (int j = 0; j < (2 * i + 1); j++) {
                        System.out.print(" * ");
                    }
                } else {
                    for (int j = 0; j < (2 * i - n + 1) / 2; j++) {
                        System.out.print("   ");
                    }
                    for (int j = 0; j < (2 * (n - i) - 1); j++) {
                        System.out.print(" * ");
                    }
                }

                System.out.println();
            }
        }else {
            System.out.println("Error!!!!! \nYou entered an even number");
        }

    }
}
