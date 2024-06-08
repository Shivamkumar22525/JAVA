public class techfest5 {
    public static void main(String[] args) {
        int[] arr = {1,10,5,7,9};
        int max = 0;
        for (int i = 0; i<5;i++){
            if (max<arr[i]){
                max = arr[i];
            }
//            i++; // i increase 2 times
        }
        System.out.println(max);
    }
}
