public class SubArray {
    public static void sub(int[] arr){
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++){

            for (int j = i; j<arr.length; j++){
                int sum = 0;
                for (int k = i; k<=j; k++){

                    System.out.print("["+arr[k]+"]");
                    sum = sum+arr[k];
                    max = Math.max(max,sum);
                    min = Math.min(min,sum);
                }
                System.out.println("sum = "+sum);

                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub array = " + count);

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};

        sub(arr);
    }
}
