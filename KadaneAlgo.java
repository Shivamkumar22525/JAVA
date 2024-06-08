public class KadaneAlgo {
    public static int max(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++){
            sum+=arr[i];
            max = Math.max(max,sum);
            if (sum<0){
                sum = 0;
            }

        }
        System.out.println();
        System.out.println("Max sum = " + max);
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2,-6,-8,-3};

        max(arr);
    }
}
