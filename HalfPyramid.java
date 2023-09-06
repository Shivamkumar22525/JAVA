import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        for (int i =1; i<=num; i++){
            for (int n = 1; n<=i; n++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
