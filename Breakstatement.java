import java.util.Scanner;

public class Breakstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int a = sc.nextInt();
        int i;
        for (i=0; i<=a; i++){
            if (i==10){
                break;
            }
            System.out.println(i);
        }
    }
}
