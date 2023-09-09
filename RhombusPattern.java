import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        for (int i=0; i<num; i++){
            for (int j=0; j<(num-i+1); j++){
                System.out.print(" ");
            }
            for (int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
