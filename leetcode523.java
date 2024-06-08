import java.util.HashMap;

public class leetcode523 {
    public static void main(String[] args) {
        int[] nums = {5,0,0,0};
        int k = 3;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            int rem = sum%k;
            if(map.containsKey(rem)){
                if(i-(map.get(rem))>=2){
                    System.out.println(true);
                    break;
                }
            }else {
                map.put(rem,i);
            }
        }
    }
}
