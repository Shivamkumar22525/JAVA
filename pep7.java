import java.util.Scanner;

public class pep7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c = a + b;
        int n = 5;



        for (int i = 0; i < n ; i++) {

                for (int j = 0; j<=i; j++) {
                    System.out.print(a + "  ");
                    int temp = c;
                    a = b;
                    b = temp;
                    c = a + b;
                }




            System.out.println();
        }
    }
}
