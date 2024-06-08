import java.util.*;
public class RearrangeBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int n = nums.length;
//        int[] pos = new int[n/2];
//        int[] neg = new int[n/2];
//        int j = 0;
//        int k = 0;
//        for (int i = 0; i<n; i++){
//            if (nums[i]>0) {
//                pos[j] = nums[i];
//                j++;
//            }else {
//                neg[k] = nums[i];
//                k++;
//            }
//        }
        int[] arr = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n){
            if (nums[i]>0){
                arr[2*k] = nums[i];
                i++;
                k++;
            } else if (nums[i]<0) {
                arr[2*j+1] = nums[i];
                i++;
                j++;
            }
        }
        for (int l = 0; l<n; l++){
            System.out.print(arr[l]+",");
        }
//        for (int i = 0; i<n/2; i++){
//            System.out.print(pos[i]+",");
//            System.out.print(neg[i]+",");
//        }
//        for (int i = 0; i<n/2; i++){
//            nums[i*2] =  pos[i];
//            nums[i*2+1] = neg[i];
//        }
//        for (int i = 0; i<n; i++){
//            System.out.print(nums[i]+",");
//        }



    }
}
