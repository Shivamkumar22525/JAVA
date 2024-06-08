public class RecursiveSelectionSort {
    public static void sort(int[] arr,int n,int start){
        if (start >= n-1){
            return;
        }
        int min = start;
        int j = start+1;
        while(j<n){
            if (arr[j]<arr[min]){
                min = j;
            }
            j++;
        }
        int temp = arr[min];
        arr[min] = arr[start];
        arr[start] = temp;
        sort(arr,n,start+1);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,2,1};
        int n = arr.length;
        int start = 0;
        sort(arr,n,start);
        for(int val : arr){
            System.out.print(val+" ");
        }
    }
}
