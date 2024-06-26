public class RecrusionBubbleSort {
    public static void sort(int[] arr,int n){
        if (n==0 || n==1){
            return;
        }
        for (int i = 0; i<n-1; i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        sort(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,2,1};
        int n = arr.length;
        sort(arr,n);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
