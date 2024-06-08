import java.util.Arrays;

public class leetcode1 {
    public static int[] find(int[] arr,int target){
        for (int i = 1; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                if (arr[j-i]+arr[j] == target){
//                    arr[idx] = j;
//                    idx++;
//                    check = true;
                    return new int[]{j-i,j};
                }
            }
//            if (check){
//                arr[idx] = i;
//            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 18;
//        int[] arr1 = new int[2];
//        int idx = 0;
//        boolean check = false;
//        for (int i = 0; i<arr.length; i++){
//            for (int j = i+1; j<arr.length; j++){
//                if (arr[i]+arr[j]==target){
//                    arr1[idx] = j;
//                    idx++;
//                    check = true;
//                    break;
//                }
//            }
//            if (check){
//                arr1[idx] = i;
//                break;
//            }
//        }
//        for (int i = 0; i<arr1.length; i++){
//            System.out.print(arr1[i] +" ");
//        }
//        System.out.println(find(arr,target));
        System.out.println(Arrays.toString(find(arr, target)));
    }
}
