import java.util.Scanner;

public class InverseArray {

    public static int[] inverse(int[] a, int n){
        int[] inv = new int[n];
        for (int i = 0; i<inv.length; i++){
            int v = a[i];
            inv[v] = i;
        }
        return inv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter length = ");
        int n = sc.nextInt();

        System.out.print("enter elements = ");
        int[] a = new int[n];
        for (int i = 0; i<a.length;i++){
            a[i] = sc.nextInt();
        }


        int[] inv = inverse(a,n);
        for (int i = 0; i<inv.length; i++){
            System.out.print(inv[i]+",");
        }

    }
}
