public class RecursiveInsertionSort {
    public static void sort(int[] arr,int n){
        if (n<=1){
            return;
        }
        sort(arr,n-1);
        int i = arr[n-1];
        int j = n-2;
        while(j>=0 && arr[j]>i){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = i;
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
