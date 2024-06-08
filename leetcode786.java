import java.util.*;

public class leetcode786 {
    public static void main(String[] args) {
        int[] arr = {1,7};
        int k = 1;
        int n = arr.length;
        ArrayList<Double> list = new ArrayList<>();
        int i = 0;
        int j = i+1;

        while(i<(n-1)){
            while(j<n){
                double frac =  ((double) arr[i] /arr[j]);
                list.add(frac);
                j++;
            }
            i++;
            j = i+1;
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Double num = list.get(k-1);
        System.out.println(num);
        int[] arr1 = new int[2];
        i = 0;
        j = i+1;
        int n1 = arr1.length;
        int idx = 0;

        while((i<(n-1))){
            while(j<n){
                double frac =  ((double) arr[i] /arr[j]);
                if(frac==num){
                    arr1[idx] = arr[i];
                    arr1[idx+1] = arr[j];
                }
                j++;
            }
            i++;
            j = i+1;
        }
        for (int p = 0; p<n1; p++){
            System.out.print(arr1[p]+" ");
        }

    }
}
