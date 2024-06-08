public class leetcode42 {
    public static int trap(int[] height) {
        int n = height.length;
//
//        int[] maxLeft = new int[n];
//        maxLeft[0] = height[0];
//        int max1 = -1;
//        for(int i = 1; i<n; i++){
//            max1 = Math.max(max1,height[i-1]);
//            maxLeft[i] = max1;
//        }
//
//        int max2 = -1;
//        int[] maxRight = new int[n];
//        maxRight[n-1] = 0;
//        for(int i = n-2; i>=0; i--){
//            max2 = Math.max(max2,height[i+1]);
//            maxRight[i] = max2;
//        }
//        int sum = 0;
//
//        for (int i = 0; i<n; i++){
//            int min = Math.min(maxLeft[i],maxRight[i]);
//            int num=min-height[i];
//            if (num<0){
//                num = 0;
//            }
//                sum+=num;
//
//        }
//        return sum;
        int sum = 0;
        int maxLeft = height[0];
        int maxRight = height[n - 1];
        int i = 0;
        int j = n-1;
        while (i < j) {
            if (maxLeft < maxRight) {
                i++;
                int num = maxLeft-height[i];
                if (num<0){
                    num = 0;
                }
                sum+=num;
                maxLeft = Math.max(maxLeft,height[i]);
            }else{
                j--;
                int num = maxRight-height[j];
                if (num<0){
                    num = 0;
                }
                sum+=num;
                maxRight = Math.max(maxRight,height[j]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
