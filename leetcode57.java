import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode57 {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] arr1 = {4,5};
        List<int[]> result = new ArrayList<>();
        for (int[] i:arr){
            if (i[1]<arr1[0]){
                result.add(i);
            } else if (i[0]>arr1[1]){
                result.add(arr1);
                arr1 = i;
            }else {
                arr1[0] = Math.min(arr1[0],i[0]);
                arr1[1] = Math.max(arr1[1],i[1]);
            }
        }
        result.add(arr1);
        for (int[] i:result){
            System.out.print(Arrays.toString(i)+" ");
        }
    }
}
