import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][3];
        for (int r = 0; r<5; r++){
            for (int c = 0; c<3; c++){
                arr[r][c] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int r = 0; r<5; r++){
            int sum = 0;
            for (int c = 0; c<3; c++){
                System.out.print(arr[r][c]+" ");
                sum+=arr[r][c];
            }
            System.out.print(" = " +sum);
            if (sum>max){
                max = sum;
                count = r;
            }
            System.out.println();
        }
        System.out.println("Index of row = "+ count);
        System.out.println("largest sum of row = "+max);


        System.out.println();

//        Columns sum

        for (int c = 0; c<3; c++){
            int sum = 0;
            for (int r = 0; r<5; r++){
                sum+=arr[r][c];
            }
            System.out.print(sum+" ");
        }
    }
}
