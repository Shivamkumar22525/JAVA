import java.util.*;
public class LargestOf3Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{

            System.out.print("a = ");
            int a = sc.nextInt();

            System.out.print("b = ");
            int b = sc.nextInt();

            System.out.print("c = ");
             int c = sc.nextInt();

            if (a>b && a>c){
                System.out.println("a is greatest number");
            } else if (b>a && b>c){
                System.out.println("b is the greatest number");
            }else{
                System.out.println("c is the greatest number");

            }

        }
    }

}
