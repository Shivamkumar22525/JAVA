import java.util.*;

public class Functions {

    public static void printhello(){
        System.out.println("Shivam");
        System.out.println("Shivam");
        System.out.println("Shivam");
        System.out.println("Shivam");


    }

    public static int calculatesum(int a,int b){

        int sum = a+b;
        System.out.println("sum = " + sum);
        return sum;
    }

    public static int calculatesum1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        int sum1 = a+b;
        System.out.println("sum1 = "+sum1);

        return sum1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        calculatesum(5,10);
        calculatesum1();

    }
}
