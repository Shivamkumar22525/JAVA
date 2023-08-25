import java.util.Scanner;

public class PrintFever {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Temp = ");
        double temp = sc.nextDouble();

        if (temp>=100 && temp<=104){
            System.out.println("You have fever");
        } else {
            System.out.println("You don't have fever");
        }
    }
}
