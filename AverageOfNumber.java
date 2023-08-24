import java.util.*;
public class AverageOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{

            System.out.print("a = ");
            int a = sc.nextInt();

            System.out.print("b = ");
            int b = sc.nextInt();

            System.out.print("c = ");
            int c = sc.nextInt();

            int sum = a + b + c;

            int avg = sum/3;

            System.out.println("average of 3 number = " + avg);

        }
    }
}
