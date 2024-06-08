import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        int[] arr = {4,1,1,2,3,3,1,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int least = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            least = Math.min(least,value);
        }
        least--;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == least + 1) {
                entry.setValue(least);
                break; // Break after updating the first occurrence
            }
        }
        System.out.println(map);

    }
}
