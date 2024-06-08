import java.util.HashMap;
import java.util.HashSet;

public class leetcode260 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(map.contains(nums[i])){
                map.remove(nums[i]);
            }else{
                map.add(nums[i]);
            }
        }
        System.out.println(map);

        int[] arr = new int[2];
        int idx = 0;
        for(Integer key : map){
            arr[idx++] = key;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
