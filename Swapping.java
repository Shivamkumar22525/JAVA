import java.util.*;
public class Swapping {

    public static void swap(int a,int b){

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("shivam");

        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        swap(a,b);
    }
}
