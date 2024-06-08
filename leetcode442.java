import java.util.*;

public class leetcode442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        if (nums.length<=1){
            System.out.println(new ArrayList<>());
        }
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        for (int key :freq.keySet() ){
            if (freq.get(key)>=2){
                arr.add(key);
            }
        }
        System.out.println(arr);
    }
}
