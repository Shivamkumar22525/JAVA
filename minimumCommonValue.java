import java.util.HashMap;
import java.util.HashSet;

public class minimumCommonValue {
    public static int check(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int min = Math.min(arr1.length,arr2.length);
        while (j<min){
           if (arr2[j]==arr1[i]){
               return arr2[j];
           }
           if (arr2[j]>arr1[i]){
               i++;
           }else {
               j++;
           }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {10,11,12,13,14,15,16,17,18,19,20};
        int[] arr2 = {3,4,5,6,7,8,9,20};
        System.out.println(check(arr1,arr2));

    }
}
