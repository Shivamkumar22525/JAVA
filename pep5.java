import java.util.Scanner;

public class pep5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            if (i<n/2){
                for (int j = 0; j < n; j++) {
                    if (j == n-i) {
                        System.out.print("  *   ");
                    } else {
                        System.out.print("      ");
                    }

                }
                for (int j = 0; j < n; j++) {
                    if (j == i) {
                        System.out.print("  *   ");
                    } else {
                        System.out.print("      ");
                    }
                }
            }else {
                for (int j=0; j<n; j++){
                    if (j==i+1){
                        System.out.print("  *   ");
                    }else {
                        System.out.print("      ");
                    }
                }
                for (int j=0; j<n; j++){
                    if (j==n-i-1){
                        System.out.print("  *   ");
                    }else {
                        System.out.print("      ");
                    }
                }
            }
            System.out.println();
        }

    }
}
