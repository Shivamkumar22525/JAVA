import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int i = 1;

        System.out.print("n = ");
        int n = sc.nextInt();

        int sum = 0;

        while (i<=n){
            sum = sum + i;

            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
