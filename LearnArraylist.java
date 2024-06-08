import java.util.ArrayList;

public class LearnArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
//        System.out.println(list);

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        arr.add(500);
        arr.add(600);

        list.add(1,arr.get(2));
        System.out.println(list);

//        list.remove(5);
//        System.out.println(list);



//        list.addAll(arr);
//        System.out.println(list);

//        System.out.println(list.contains(600));

//        System.out.println(list.get(8));

//        list.remove(Integer.valueOf(600));
//        System.out.println(list);



    }
}
