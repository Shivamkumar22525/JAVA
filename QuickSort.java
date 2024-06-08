import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    public static int partition(List<Integer> arr,int low,int high){
        int pivot = arr.get(low);
        int cnt = 0;
        for (int i = low+1; i<=high; i++){
            if (arr.get(i)<pivot){
                cnt++;
            }
        }
        int shift = low+cnt;
        Collections.swap(arr,shift,low);

        int i = low;
        int j = high;
        while(i<shift && j>shift){
            while (arr.get(i)<pivot){
                i++;
            }
            while(arr.get(j)>pivot){
                j--;
            }
            if (arr.get(i)>arr.get(j)){
                Collections.swap(arr,i,j);
            }
            i++;
            j--;
        }
        return shift;
    }
    public static List<Integer> quick(List<Integer> arr,int low,int high){
        if (low>=high){
            return new ArrayList<>();
        }

        int part = partition(arr,low,high);
        quick(arr,low,part);
        quick(arr,part+1,high);
        return arr;
    }
    public static void main(String[] args) {
//        int[] arr = {5,1,1,3,8,2,1};
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(80);
        arr.add(30);
        arr.add(90);
        arr.add(40);
        arr.add(50);
        arr.add(70);

        quick(arr,0,arr.size()-1);
        for (int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }

    }
}
