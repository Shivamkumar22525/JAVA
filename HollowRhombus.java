import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        for (int i=0; i<=num; i++) {
            for (int j = 0; j <=(num - i + 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=num; j++) {
                if (i==0 || i==(num)){
                    System.out.print("* ");
                }else if(j==0 || j==num){
                    System.out.print
                            ("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
