import java.util.Scanner;

public class Arrays2D {
    public static boolean check(int[][] arr, int r,int c, int num){
        for (int i = 0; i<r; i++){
            for (int j = 0; j<c; j++){
                if (num==arr[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        for (int r = 0; r<3; r++){
            for (int c = 0; c<2; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        for (int r = 0; r<3; r++){
            for (int c = 0; c<2; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }


        System.out.print("Enter number to search = ");
        int num = sc.nextInt();
        if (check(arr,3,2,num)){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
    }
}
