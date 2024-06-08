import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(5);
        arr1.add(7);
        arr1.add(9);



        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(4);
        arr2.add(6);
        arr2.add(8);
        arr2.add(10);

//        arr1.addAll(arr2);
//        Collections.sort(arr1);
//        System.out.println(arr1);

//        ArrayList<Integer> arr3 = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//        while (i < arr1.size() && j < arr2.size() ){
//            if(arr1.get(i)<arr2.get(j)){
//                int p = arr1.get(i++);
//                arr1.add(p);
//            }else {
//                int q = arr2.get(j++);
//                arr1.add(q);
//            }
//        }
//        while(i<arr1.size()){
//            arr1.add(arr1.get(i++));
//        }
//
//        while(j<arr2.size()){
//            arr1.add(arr2.get(j++));
//        }
//        System.out.println(arr1);
        int i = 0;
        int j = 0;
        while(i<arr1.size()){
            if(arr1.get(i)>arr2.get(j)){
                arr1.add(i,arr2.get(j));
                j++;
            }else {
                i++;
            }

        }
        while(j<arr2.size()){
            arr1.add(arr2.get(j++));
        }
        System.out.println(arr1);





    }
}
