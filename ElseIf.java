import java.util.*;
public class ElseIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{

            System.out.print("Age = ");
            int A = sc.nextInt();
            if(A>=18){
                System.out.println("Adult");
            } else if(A>12 && A<18){
                System.out.println("Teenager");
            } else{
                System.out.println("Child");
            }
        }
    }

}
