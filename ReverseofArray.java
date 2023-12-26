import java.util.*;
public class ReverseofArray {

    public static void reverse(int[] arr){

//        for (int i = arr.length-1; i>=0; i--){
//            System.out.print(arr[i]+",");
//        }
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length = ");
        int n = sc.nextInt();

        System.out.print("Enter the elements = ");
        int[] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] +",");
        }

    }
}
