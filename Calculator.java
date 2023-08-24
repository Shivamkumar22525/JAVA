import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{

            System.out.print("a = ");
            int a = sc.nextInt();

            System.out.print("choose +,-,/,*,% =  ");
            String cal = sc.next();

            System.out.print("b = ");
            int b = sc.nextInt();



            switch(cal)
            {
                case "+" :
                    System.out.println("a + b = " + (a+b));
                    break;

                case "-" :
                    System.out.println("a - b = " + (a-b));
                    break;

                case "*" :
                    System.out.println("a * b = " + (a*b));
                    break;

                case "/" :
                    System.out.println("a / b = " + (a/b));
                    break;

                case "%" :
                    System.out.println("a % b = " + (a%b));
                    break;
            }



        }
    }
}
