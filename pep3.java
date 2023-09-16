import java.util.Scanner;

public class pep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (j==i){
                    System.out.print("  *   ");
                }else {
                    System.out.print("      ");
                }

            }
            for (int j=0; j<n; j++) {
                if (j == (n - i-1)){
                    System.out.print("  *   ");
                }else {
                    System.out.print("      ");
                }
            }

//            for (int j=0; j<n-i; j++){
//                System.out.print("   ");
//            }
//            for (int j=0; j<1;j++){
//                System.out.print(" * ");
//            }
            System.out.println();
        }
    }
}
