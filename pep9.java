import java.util.Scanner;

public class pep9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        for (int i=1; i<=10; i++){

            for (int j =0; j<1; j++){
                int a = n*i;
                System.out.print(n + " * " + i + " = " + a);

            }
            System.out.println();
        }
    }
}
