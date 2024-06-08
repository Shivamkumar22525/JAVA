public class SubArray {
    public static void sub(int[] arr){
        int count = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<arr.length; i++){
            int sum = 0;

            for (int j   = i; j<arr.length; j++){
                for (int k = i; k<=j; k++){
                    System.out.print(arr[k]+",");
                }

//                        subArray(arr,i,j);
                        sum += arr[j];

//                    sum = sum+arr[k];
                    max = Math.max(max,sum);
                    min = Math.min(min,sum);

                System.out.println("sum = " + sum);

                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub array = " + count);

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }

//    public static int sum(int i,int j,int[] arr){
//        int sum = 0;
//        for (int k = i; k<=j;k++) {
//            sum += arr[k];
//        }
//        return sum;
//    }
    public static void subArray(int[] arr,int i,int j){
        for (int k = i;k<=j;k++){
            System.out.print("["+arr[k]+"]");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {12,34,67,90};

        sub(arr);

    }
}
