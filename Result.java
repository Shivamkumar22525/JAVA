import java.util.*;
public class Result {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{

            System.out.print("a = ");
            int a  = sc.nextInt();

            String Result = (a>=33)?"Pass":"Fail";
            System.out.println("Result = " + Result);
        }
    }
}
