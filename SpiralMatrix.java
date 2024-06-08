import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 3;
        int[][] matrix = new int[n][m];
        for (int r = 0; r<n; r++){
            for (int c = 0; c<m; c++){
                matrix[r][c] = sc.nextInt();
            }
        }
        for (int r = 0; r<n; r++){
            for (int c = 0; c<m; c++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
        if(n<1 || m<1) return;
//        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        int total = n*m;
        int col = 0;
        int colLength = m-1;
        int row = 0;
        int rowLength = n-1;
        int[] arr = new int[n*m];

        while(count<total) {
            for (int idx = col; count < total && idx <=colLength; idx++) {
//                arr.add(matrix[row][idx]);
                System.out.print(matrix[row][idx]);
                count++;
            }

            row++;

            for (int idx = row; count < total && idx <=rowLength; idx++) {
//                arr.add(matrix[idx][colLength]);
                System.out.print(matrix[idx][colLength]);
                count++;
            }
            colLength--;

            for (int idx = colLength; count < total && idx >= col; idx--) {
//                arr.add(matrix[rowLength][idx]);
                System.out.print(matrix[rowLength][idx]);
                count++;
            }
            rowLength--;

            for (int idx = rowLength; count < total && idx >= row; idx--) {
//                arr.add(matrix[idx][col]);
                System.out.print(matrix[idx][col]);
                count++;
            }
            col++;

            //            -41 334 169
//            478 962 -705
//                    -281 -961 995
        }
//        int[] arr1 = new int[n*m];
//        for(int val:arr1){
//            System.out.print(arr1[val]);
//        }
//        System.out.println(arr);
    }
}
