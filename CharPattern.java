import java.util.Scanner;

public class CharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        char ch = 'A';

        for (int i = 1; i<=num; i++){

            for (int j =1; j<=i; j++){

                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
