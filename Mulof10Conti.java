import java.util.Scanner;

public class Mulof10Conti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MAX_VALUE;

        for (int i = 0; i<max; i++){
            System.out.print("enter the number = ");
            int a = sc.nextInt();

            if (a%10==0){
                continue;
            }
            System.out.println("successful  " + a);
        }

    }
}
