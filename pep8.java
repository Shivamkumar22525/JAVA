import java.util.Scanner;

public class pep8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num =5;

        for (int i=0; i<num; i++){
            int icj =1;
            for (int j=0; j<=i; j++){

                System.out.print(icj+" ");

                int icj1 = icj*(i-j)/(j+1);

                icj=icj1;

            }
            System.out.println();
        }
    }
}
