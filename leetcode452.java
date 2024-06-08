import java.util.*;

public class leetcode452 {
    public static void main(String[] args) {
        int[][] arr = {{10,16},{2,8},{1,6},{7,12}};
        Arrays.sort(arr,(x,y)->x[1]-y[1]);
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int end = arr[0][1];
        int cnt = 1;
        for (int i = 1; i<arr.length; i++){
            if (arr[i][0]>end){
                cnt++;
                end = arr[i][1];
            }
        }
        System.out.println(cnt);
    }
}
