public class leetcode930 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        int goal = 0;
        int cnt = 0;

        for (int i = 0; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                int sum = 0;
                for (int k = i; k<=j; k++){
//                    System.out.print(arr[k]+" ");
                    sum+=arr[k];

                }
                if (sum==goal){
                    cnt++;
                }
//                System.out.print("  sum = "+sum);

//                System.out.println();
            }
        }
        System.out.println(cnt);
    }
}
