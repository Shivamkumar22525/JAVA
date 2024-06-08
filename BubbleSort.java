import java.util.Scanner;

public class BubbleSort {

    public static void Sort(int[] arr){

        for (int i = 0; i<arr.length-1; i++){
            int count = 0;
            for (int j = 0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    count++;
                }

            }
            if (count==0) {
                break;
            }
            System.out.println(count);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5,3,8,2,1};
        Sort(arr);

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }
    }
}
