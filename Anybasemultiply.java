class Solution {
//    public static int searchRangelow(int[] nums, int target) {
//        int l = 0;
//        int h = nums.length-1;
//        int ans = -1;
//        while(l<=h){
//            int mid = (l+h)/2;
//            if(target==nums[mid]){
//                ans = mid;
//                h = mid-1;
//            }else if(target<nums[mid]){
//                h = mid-1;
//            }else if(target>nums[mid]){
//                l = mid+1;
//            }
//        }
//        return ans;
//    }
//    public static int searchRangehigh(int[] nums, int target) {
//        int l = 0;
//        int h = nums.length-1;
//        int ans = -1;
//        while(l<=h){
//            int mid = (l+h)/2;
//            if(target==nums[mid]){
//                ans = mid;
//                l = mid+1;
//            }else if(target<nums[mid]){
//                h = mid-1;
//            }else if(target>nums[mid]){
//                l = mid+1;
//            }
//        }
//        return ans;
//    }
    public static int peak(int[] nums){
//        for (int i = 1; i<nums.length-1; i++){
//            if (nums[i]>nums[i+1] || nums[i]>nums[i-1]){
//                return nums[i];
//            }
//        }
//        return  -1;
        int l = 0;
        int h = nums.length-1;
        while (l<h){
            int mid = (l+h)/2;
             if (nums[mid]<nums[mid+1]) {
                l = mid+1;
            }else {
                 h = mid;
             }
        }
        return l;
    }
    public static void main(String[] args){
        int [] nums = {1,2,9,6,3,0};
        System.out.println(peak(nums));
//        int target = 6;
//        System.out.println(searchRangelow(nums,target));
//        searchRangehigh(nums,target);
    }
}