public class RotateArray {
    public static void reverse(int[] nums, int start, int end){

        while (start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k){
        k = k%nums.length;
        if (k<0){
            k = k+nums.length;
        }
        reverse(nums,0,nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);

    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;


        rotate(nums,k);
        for (int i = 0; i<nums.length; i++){
            System.out.print(nums[i]+",");
        }
    }
}
