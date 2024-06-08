import java.util.Scanner;

public class Average {

    public static double average(double a, double b, double c){
        double average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();

        System.out.print("b = ");
        double b = sc.nextDouble();

        System.out.print("c = ");
        double c = sc.nextDouble();

        System.out.println("Average = " + average(a,b,c));

    }
}
