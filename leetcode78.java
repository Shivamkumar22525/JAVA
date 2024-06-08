import java.util.*;


public class leetcode78 {
    public static void solve(int[] nums, List<List<Integer>> ans, List<Integer> output, int idx){
        if (idx>=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        solve(nums,ans,output,idx+1);

        int el = nums[idx];
        output.add(el);
        solve(nums,ans,output,idx+1);
        output.remove(output.size()-1);

    }
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        int idx =0;
        solve(nums,ans,new ArrayList<>(),idx);
        ans.remove(0);
        return ans;
    }
    public static void main(String[] args) {
       int[] nums = {1,2,3};
        System.out.println(subsets(nums));

    }
}
