import java.io.PrintStream;
import java.util.Scanner;

public class Barchart {

    public static void asterik(int[] arr,int n){

        int max = 0;
        for (int i = 0; i<arr.length; i++){
//            max = Math.max(max,arr[i]);
            if (max<arr[i]){
                max = arr[i];
            }
        }


        for (int i = max; i>=1; i--){
            for (int j = 0; j<arr.length; j++){
                if (arr[j]>=i){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length = ");
        int n = sc.nextInt();

        System.out.print("Enter elements = ");
        int[] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        asterik(arr,n);
    }
}
