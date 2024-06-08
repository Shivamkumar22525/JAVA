public class GoodPairs {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4,12};
        int[] nums2 = {2,4};
        int k = 1;

        int cnt = 0;
//        int i  = 0;
////        int j = 0;
//
//        while(i<nums2.length){
//            int j = 0;
//            while(j<nums1.length){
//                if(nums1[i]%(nums2[j]*k)==0){
//                    cnt++;
//                    j++;
//                }else{
//                    j++;
//                }
//            }
//            i++;
//        }
        for (int i = 0; i<nums2.length; i++){
            for (int j = 0; j<nums1.length; j++){
                if(nums1[i]%(nums2[j]*k)==0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
