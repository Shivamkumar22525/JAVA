import java.util.Scanner;

public class InvertedBar {

    public static void ast(int[] arr){
        int min = 0;
        int max = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>=max){
                max = arr[i];
            }
        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<=min){
                min = arr[i];
            }
        }
        for (int i = min; i<max; i++){
            for (int j = 0; j<arr.length; j++){
                if (arr[j]>i){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5,6,0,3,5,2};
        ast(arr);
    }
}
