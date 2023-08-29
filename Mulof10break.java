import java.util.Scanner;

public class Mulof10break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MAX_VALUE;



        for (int i = 0;i<20;i++){
            System.out.print("Enter number = ");
            int a = sc.nextInt();
            if (a%10==0){
                break;
            }
            System.out.println(a);
        }
        System.out.println("Please enter a valid number!!!");
    }
}
