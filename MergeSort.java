public class MergeSort {
    public static void merge(int[] arr,int low,int high){
        int mid = low+(high-low)/2;
        int len1 = mid-low+1;
        int len2 = high-mid;


        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        int idx = low;
        for (int i = 0; i<len1; i++){
            arr1[i] = arr[idx++];
        }
        idx = mid+1;
        for (int i = 0; i<len2; i++){
            arr2[i] = arr[idx++];
        }

        int i = 0;
        int j = 0;
        idx = low;

        while (i<len1 && j<len2){
            if (arr1[i]<arr2[j]){
                arr[idx++] = arr1[i++];
            }else {
                arr[idx++] = arr2[j++];
            }
        }
        while (i<len1){
            arr[idx++] = arr1[i++];
        }
        while (j<len2){
            arr[idx++] = arr2[j++];
        }
    }
    public static void sort(int[] arr,int low,int high){
        if (low>=high){
            return;
        }
        int mid = low+(high-low)/2;

        sort(arr,low,mid);

        sort(arr,mid+1,high);

        merge(arr,low,high);
    }
    public static void main(String[] args) {
        int[] arr = {8,3,5,1,4,9,2};
        int n = arr.length;
        sort(arr,0,n-1 );
       for (int i = 0; i<arr.length; i++){
           System.out.print(arr[i]+" ");
       }

    }
}
