import java.util.*;

public class Spanofarray {
    public static int diff(int[] arr, int n){

//      int max = Integer.MIN_VALUE;
//      int min = Integer.MAX_VALUE;
        int max = arr[0];
        int min = arr[0];
      for (int i = 0; i<arr.length; i++){
//          max = Math.max(max,arr[i]);
//          min = Math.min(min,arr[i]);

          if (max<arr[i]){
              max = arr[i];
          }
          if (min>arr[i]){
              min = arr[i];
          }

      }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

      return max-min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter numbers = ");
        for (int i = 0; i< arr.length; i++){
          arr[i] = sc.nextInt();
        }

        int span = diff(arr,n);
        System.out.println("span = " + span);
    }
}
