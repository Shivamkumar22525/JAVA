import java.util.Scanner;

public class Wave2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 3;
        int n = 2;
        int[][] arr = new int[m][n];
        int colLength = arr[0].length;
        System.out.println(colLength);
        for (int r = 0; r<3; r++){
            for (int c = 0; c<3; c++){
                arr[r][c] = sc.nextInt();
            }

        }
        for (int r = 0; r<3; r++){
            for (int c = 0; c<3; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
        int[] Array = new int[m*n];
        int i = 0;

        for (int c = 0; c<3; c++){
            if (c%2!=0){
                  for (int r = 3-1; r>=0; r--){
                       Array[i] = arr[r][c];
                       i++;
                  }
            }else {
                for (int r = 0; r < 3; r++) {
                    Array[i] = arr[r][c];
                    i++;
                }
            }
        }

        for (int j = 0; j<Array.length; j++){
            System.out.print(Array[j]+" ");
        }



    }
}
