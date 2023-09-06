import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        for (int i =1; i<=num; i++){
            for (int n = 1; n<=(num-i+1); n++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
