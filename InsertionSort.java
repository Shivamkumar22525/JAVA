public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,6,4,7};
        int n = arr.length;

        int i = 1;
        while(i<n){
            int temp = arr[i];
            int j = i-1;
            while(j>=0){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
                j--;
            }
            arr[j+1] = temp;
            i++;
        }

        for (int k = 0; k<n; k++){
            System.out.print(arr[k]+",");
        }
    }
}
