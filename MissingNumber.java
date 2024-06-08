public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(check(nums));

    }
    public static int check(int[] nums){
       for(int i = 1;i<=nums.length;i++){
           int flag =0;
           for(int j = 0;j< nums.length;j++){
               if(nums[j] == i){
                   flag =1;
               }
           }
           if(flag == 0){
               return i;
           }
        }
        return 0;
    }
}
