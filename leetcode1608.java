public class leetcode1608 {
    public static void main(String[] args) {
        int[] nums = {0,0,3,4,4};
        int[] table = new int[1001];
        for(int i = 0; i<nums.length; i++){
            int val = nums[i];
            table[val]+=1;
        }
        int count = 0;
        for(int i = table.length-1; i>=0; i--){
            count+=table[i];
            if(count==i){
                System.out.println(count);
                break;
            }
        }
    }
}
