import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int a = sc.nextInt();
        int num;

        while (a>0){
            num = a%10;
            System.out.print(num);
            a = a/10;

        }
        System.out.println(" The number has been reversed");
    }
}
