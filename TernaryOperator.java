import java.util.*;
public class TernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{

//            int a = 20, b = 30;
//            String con1 = "true",con2 = "false";
//
//
//            String var = (a>=b)?con1:con2;
//            System.out.println(var);

            System.out.print("a = ");
            int a = sc.nextInt();

            String check = (a%2 == 0)?"even":"odd";
            System.out.println(check);
        }
    }
}
