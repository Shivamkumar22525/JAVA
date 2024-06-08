import java.util.Scanner;

public class RotateImage {
    public static int[][] insert(int[] arr, int[][] matrix,int m,int n){
        int row = 0;
        int rowLength = n-1;
        int col = 0;
        int colLength = m-1;
        int count = 0;
        int total = m*n;
        int i = 0;
        System.out.println(arr[0]);
        while(count<total){
            for (int idx = row; count<total && idx<=rowLength; idx++){
                matrix[idx][colLength] = arr[i];
                count++;
                i++;
            }
            colLength--;

            for (int idx = colLength; count<total && idx>=col; idx--){
                matrix[rowLength][idx] = arr[i];
                count++;
                i++;
            }
            rowLength--;

            for (int idx = rowLength; count<total && idx>=row; idx--){
                matrix[idx][col] = arr[i];
                count++;
                i++;
            }
            col++;

            for (int idx = col; count<total && idx<=colLength; idx++){
                matrix[row][idx] = arr[i];
                count++;
                i++;
            }
            row++;
        }

        return matrix;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int[][] matrix = new int[n][m];
        int[] arr = new int[n*m];
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
//        if(n<1 || m<1) return;

        int count = 0;
        int total = n*m;
        int col = 0;
        int colLength = m-1;
        int row = 0;
        int rowLength = n-1;
        int i = 0;


        while(count<total) {
            for (int idx = col; count < total && idx <=colLength; idx++) {
                arr[i] = matrix[row][idx];
                count++;
                i++;
            }

            row++;

            for (int idx = row; count < total && idx <=rowLength; idx++) {
                arr[i] = matrix[idx][colLength];
                count++;
                i++;
            }
            colLength--;

            for (int idx = colLength; count < total && idx >= col; idx--) {
                arr[i] = matrix[rowLength][idx];
                count++;
                i++;
            }
            rowLength--;

            for (int idx = rowLength; count < total && idx >= row; idx--) {
                arr[i] = matrix[idx][col];
                count++;
                i++;
            }
            col++;
        }
        System.out.println();

        for (int j = 0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        insert(arr,matrix,m,n);

        for (int r = 0; r<n; r++){
            for (int c = 0; c<m; c++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }



    }
}
