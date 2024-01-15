public class PivotIndex {

    public static int pivot(int[] arr, int n){
//        int[] leftsum = new int[n];
//        int sum = 0;
//        for (int i = 0; i<n; i++){
//            leftsum [i] = sum;
//            sum = sum +arr[i];
////            System.out.print(leftsum[i]+",");
//        }
//        System.out.println();
//        int sum1 = 0;
//        int[] rightsum = new int[n];
//        for (int i = n-1; i>=0; i--){
//            rightsum[i] = sum1;
//            sum1 = sum1 + arr[i];
////            System.out.print(rightsum[i]+",");
//        }
//        for (int i = 0; i<n; i++){
//            if (leftsum[i]==rightsum[i]){
//                return i;
//            }
//        }
        int postSum = 0;
        for (int i = 0; i<n; i++){
            postSum = postSum + arr[i];
        }


        System.out.println(postSum);
        int preSum = 0;
        for (int i = 0; i<n; i++){
            if (preSum==postSum-arr[i]){
                return i;
            }else {
                preSum = preSum + arr[i];
                postSum -= arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {-1,-1,0,0,-1,-1};
        int n = arr.length;
        System.out.println(pivot(arr,n));
    }
}
