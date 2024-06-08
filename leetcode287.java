import java.util.Arrays;

public class leetcode287 {
    public static void main(String[] args) {
        int[] nums = {3,3,4,3,3};
//        int[] nums1 = new int[nums.length];
//        int idx = 0;
//        for (int i = 0; i<nums.length; i++){
//            int n = nums[i];
//            nums1[idx++] = n;
//        }
//        Arrays.sort(nums1);
//        int i = 0;
//        int j = 1;
//        while (j<nums1.length){
//            if (nums1[i] == nums1[j]){
//                System.out.print(nums1[i]);
//                break;
//            }else {
//                i++;
//                j++;
//            }
//        }
        int[] arr = new int[nums.length];

        for(int i : nums){
            if(arr[i]!=0){
                System.out.println(i);
                break;
            }else{
                arr[i]=1;
            }
        }
//        return -1;

    }
}
