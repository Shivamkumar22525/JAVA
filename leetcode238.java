public class leetcode238 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
//        int idx = 0;
//        int[] array = new int[arr.length];
//        int cnt = 0;
//        for(int el : arr){
//            if(el == 0){
//                cnt++;
//            }
//        }
//        if(cnt>1) {
//            for (int i: array){
//                System.out.print(i+" ");
//            }
//        }else {}
//
//        for (int i = 0; i<arr.length; i++){
//            int ans = 1;
//            for (int j = 0; j<arr.length; j++){
//                if (arr[i]!=arr[j]){
//                    ans*=arr[j];
//                }
//            }
//            array[idx] = ans;
//            idx++;
//        }
        int n = arr.length;
        int[] array = new int[n];

        int pre = 1;
        for (int i = 0; i < n; i++) {
            array[i] = pre;
             pre*= arr[i];
        }

        int post = 1;
        for (int i = n - 1; i >= 0; i--) {
            array[i] *= post;
            post *= arr[i];
        }

//        return array;
        for (int val:array)
            System.out.print(val+" ");
        }



}
