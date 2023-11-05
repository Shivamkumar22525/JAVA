import java.util.Arrays;

public class PrefixArray {

    public static void max(int[] arr){
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
        int[] prefix = new int[arr.length];
//        for (int i = 0; i<prefix.length; i++){
//            if(i == 0){
//                prefix[0] = arr[0];
//            }else {
//                prefix[i] = prefix[i - 1] + arr[i];
//
//            }
//        }
//        for (int i = 0; i<prefix.length; i++){
//            System.out.println(prefix[i]);
//        }
//        int idx = 0;
        int k =0;
        for (int i =0;i< arr.length;i++){
            for (int j = 0;j <=i;j++ ) {
                prefix[k] += arr[j];
            }
            k++;
        }
//        for (int i : prefix){
//            System.out.print(i + " , ");
//        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            int sum = 0;
            for (int j = i; j< arr.length;j++){
                sum = i==0?prefix[j]:prefix[j]-prefix[i-1];
                System.out.println("sum = " + sum);
                max = Math.max(max,sum);
            }

        }
        System.out.println("max sum = " + max);


    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        max(arr);
    }
}
