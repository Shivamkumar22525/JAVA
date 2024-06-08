import java.util.*;

public class leetcode46 {
    public static void solve(int[] nums, List<List<Integer>> ans,int idx){
        if (idx>=nums.length){
           List<Integer> temp = new ArrayList<>();
           for(int el : nums) temp.add(el);
           ans.add(temp);
            return;
        }

        for (int i = idx; i<nums.length; i++){
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;

            solve(nums,ans,idx+1);

            int temp1= nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp1;

        }
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        int idx = 0;
        solve(nums,ans,idx);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(2);
//        nums.add(3);

        System.out.println(permute(nums));
//        System.out.println(nums);

    }
}
