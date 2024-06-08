public class RotateArray2 {
    public static void rotate1(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] arr, int k, int n) {
        k = k%arr.length;
        if (k<0){
            k = k+arr.length;
        }
        rotate1(arr, 0, n-k);
        rotate1(arr, (n-k)+1, n);
        rotate1(arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length - 1;
        int k = 101;

        rotate(arr, k, n);

        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
