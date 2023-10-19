import java.util.Scanner;

public class Methods {

    public static int max_library(int x, int y){

        return Math.max(x,y);
    }
//
    public static int min_library(int x, int y){

        return Math.min(x,y);
    }

    public static double sqrt_library(double x){

        return Math.sqrt(x);
    }

    public static double pow_library(double x, double y){


        return  Math.pow(x,y);
    }

    public static int abs_method(int x){
        return Math.abs(x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x = ");
        int x = sc.nextInt();

        System.out.print("y = ");
        int y = sc.nextInt();



        System.out.println("Max = " + max_library(x,y));
        System.out.println("Min = " + min_library(x,y));
        System.out.println("Square root of " + x + " = " + sqrt_library(x));
        System.out.println("Ans = " + pow_library(x,y));
        System.out.println("Absolute value of " + x + " = " + abs_method(x));

    }
}
