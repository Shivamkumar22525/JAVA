public class KadaneAlgo2 {
    public static int smallest(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            sum+=arr[i];
            max = Math.max(max,sum);
            if (sum<0){
                sum = 0;
            }

        }
        System.out.println();
        System.out.println("Smllest sum = " + max);
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4,-5};
        smallest(arr);
    }
}
