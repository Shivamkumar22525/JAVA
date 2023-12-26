import java.util.*;
public class SubArray2 {

    public static void sub(int[] arr,int n){
        for (int i = 0; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                for (int k = i ; k<=j; k++){
                    System.out.print(arr[k] + ",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length = ");
        int n = sc.nextInt();

        System.out.print("Enter elements = ");
        int[] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        sub(arr,n);
    }
}
