class Broken {
    public static void search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;

        while(l<=h){
            int mid = (l+h)/2;

            if(target<nums[mid]){
                h = mid-1;
                ceil = nums[mid];

            } else if (target>nums[mid]) {
                l = mid+1;
                floor = nums[mid];

            }
            else {
                ceil = nums[mid];
                floor = nums[mid];
                break;
            }

        }
        System.out.println("ceil = "+ceil+" and floor = "+floor);


    }
    public static void main(String[] args){

        int[] nums = {10,20,30,40,50};
        int target = 33;
        search(nums,target);
    }
}