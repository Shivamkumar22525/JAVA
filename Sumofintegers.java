import java.util.Scanner;

public class Sumofintegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int SumofEven = 0;
        int SumofOdd = 0;

        for (int i = 0; true; i++){
            System.out.print("enter the number = ");
            int a = sc.nextInt();

            if (a<1){
                System.out.println("You have entered number less than 1");
                break;
            }

            if (a%2==0){
                SumofEven = SumofEven+a;

            }else {
                SumofOdd = SumofOdd+a;

            }
        }
        System.out.println("SumofEven = " + SumofEven);
        System.out.println("SumofOdd = " + SumofOdd);
    }
}
