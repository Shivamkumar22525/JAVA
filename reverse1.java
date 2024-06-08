import java.util.*;
import java.util.Scanner;

public class reverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        int l = m;
        int h = arr.size()-1;
        while(l<h){

            Collections.swap(arr, l++, h--);
//            int temp = arr.get(h);
//            arr.set(h,arr.get(l));
//            arr.set(l,temp);
//            l++;
//            h--;

        }
        for (int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+",");
        }

    }
}
