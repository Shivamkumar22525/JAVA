import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number = ");
        int a = sc.nextInt();
        int flag = 1;

        for (int i = 2; i<=(a-1); i++){
            flag = 0;
            if(a == 1){
                System.out.println("it's a natural number");
                break;
            }
            if(a == 2){
                System.out.println("number is prime");
                break;
            }

            if (a%i==0){
                flag =1;
                break;
            }
        }
        if (flag == 1){
            System.out.println("number is not prime");
        }else {
            System.out.println("number is prime");
        }

    }
}
