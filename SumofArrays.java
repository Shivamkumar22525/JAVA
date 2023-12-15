import java.util.*;
public class SumofArrays {

    public static void sum(int[] arr1,int[] arr2){

        for (int i = 0; i<arr1.length; i++){
                System.out.print(arr1[i] + arr2[i] +",");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length = ");
        int n = sc.nextInt();

        System.out.print("Enter elements for arr1 = ");
        int[] arr1 = new int[n];
        for (int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter elements for arr2 = ");
        int[] arr2 = new int[n];
        for (int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        sum(arr1,arr2);


    }
}
