import java.util.Scanner;

public class pep10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int a =1;

        for (int i=1; i<=n; i++) {

            if (i<=n/2) {
                for (int j = 1; j <= n - i - 2; j++) {
                    System.out.print("   ");
                }
//                int b = a;
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print(" " + 1 + " ");
//                    b++;
                }
            }else {
                for (int j = 1; j <=i-3; j++) {
                    System.out.print("   ");
                }
//                int b = a;
                for (int j = 1; j <=(2*i)-1; j++) {

                    System.out.print(" " + 1 + " ");
//                    a--;
                }
            }
            System.out.println();
        }
//            for (int i=1; i<=(n/2)+1; i++) {

    }
}
