import java.util.Arrays;
import java.util.Scanner;

public class Search2DMatrix {
    public static int median(int[][] matrix, int[] arr){
        int m = matrix.length;
        int n = matrix[0].length;
        int idx = (arr.length)/2;
        int target = arr[idx];
        int low = 0;
        int high = 0;
        while(low<m && high<n){

            if(matrix[low][high]==target){
                return matrix[low][high];
            }
            if(matrix[low][high]>target){
                high++;
            }else{
                low++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = 5;
        int n = 5;
        int[][] matrix = new int[m][n];

        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int[] arr = new int[m*n];
        int k = 0;
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                arr[k] = matrix[i][j];
                k++;
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(median(matrix,arr));



    }
}
//        1
//        3
//        5
//        7
//        9
//        2
//        4
//        6
//        8
//        10
//        11
//        13
//        15
//        17
//        19
