public class SortedAndRotated {
    public static boolean SAR(int[] arr, int n){
        int count = 0;
        for (int i = 1; i<n; i++){

           if (arr[i-1]>arr[i]){
               count++;
           }
           if (count>1){
               return false;
           }
        }
        if (arr[n-1]>arr[0]){
            count++;
        }

        return count<=1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        int n = arr.length;
        System.out.println(SAR(arr,n));

    }
}
