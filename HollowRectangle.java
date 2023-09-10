import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        for (int i = 1; i<=(num-2); i++){
            for (int j = 1; j<=num; j++){
                if ((i==1) || (i==(num-2))){
                    System.out.print("* ");
                 }
                 else if ((j==1) || (j==num)){
                    System.out.print("* ");
                 } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
