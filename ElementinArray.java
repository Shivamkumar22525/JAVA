import java.util.Scanner;

public class ElementinArray {

    public static int element(int[] a, int d){

        for (int i = 0; i<a.length; i++){
            if (d == a[i]){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the length = ");
        int n = sc.nextInt();


        System.out.print("Enter the elements = ");
        int[] a = new int[n];
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the number = ");
        int d = sc.nextInt();

        System.out.println(element(a,d));
    }
}
