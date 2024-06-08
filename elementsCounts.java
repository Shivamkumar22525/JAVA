public class elementsCounts {
    public static int check(int[] arr){
        int[] count = new int[101];

        for (int i = 0; i<arr.length; i++){
            int n = arr[i];
            count[n]++;
        }
        int max = 0;
        for (int i = 0; i<count.length; i++){
            if (count[i]>max){
                max = count[i];
            }
        }
        int ans = 0;
        for (int i = 0; i< count.length; i++){
            if (count[i]==max){
                ans+=max;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(check(arr));

    }
}
