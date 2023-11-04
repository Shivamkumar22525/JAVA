public class SumofSubarray {
    public static void sum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length;i++){
            int sum = 0;
            for (int j = i; j<arr.length; j++){
                sum+=arr[j];
                System.out.println("sum = " + sum);
                max = Math.max(max,sum);
            }
            System.out.println();
        }
        System.out.println("Max sum = " + max);
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        sum(arr);
    }
}
