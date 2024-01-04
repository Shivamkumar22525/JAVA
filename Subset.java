import java.util.Scanner;

public class Subset {

    public static void subset(int[] arr){
        int range = (int)Math.pow(2,arr.length);
        for (int i = 0; i<range; i++){
            int temp = i;
            String set = "";
            for (int j = arr.length-1; j>=0; j--){
                int rem = temp%2;
                temp/=2;
                if (rem==0){
                    set = "-\t" + set;
                }else {
                    set = arr[j]+"\t"+set;
                }

            }
            System.out.print(set);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length = ");
        int n = sc.nextInt();

        System.out.print("Enter the elements = ");
        int[] arr = new int[n];
        for (int i = 0;i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        subset(arr);

    }
}
