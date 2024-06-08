import java.util.Arrays;

public class techfest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.sort(arr);
        int minSum = 0;
        for (int i = 0; i<arr.length-1; i++){
            minSum+=arr[i];
        }
        int maxSum = 0;
        for (int i = 1; i<arr.length; i++){
            maxSum+=arr[i];
        }
        System.out.println("minSum = "+minSum+" and "+"maxSum = "+maxSum);
    }
}
