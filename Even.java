import java.util.Scanner;

public class Even {

    public static boolean isEven(int num){
        return num % 2 == 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        if (isEven(n)){
            System.out.println(n + " is an even number");
        }else {
            System.out.println(n + " is an odd number");
        }

    }
}
