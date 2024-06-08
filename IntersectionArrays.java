import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionArrays {
    public static int[] intersection(int[] arr1, int[] arr2){
       Arrays.sort(arr1);
       Arrays.sort(arr2);
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]==arr2[j]){
                set.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]>arr2[j]){
                j++;
            }else {
                i++;
            }

        }
        int[] array = new int[set.size()];
        int idx = 0;
        for (int val : set){
            array[idx++] = val;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,1,1,7};
        int[] arr2 = {5,6,7};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));

    }
}
