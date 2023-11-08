import java.util.Scanner;

public class frequency {

    public static int freq(int[] arr, int num){
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==num){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length = ");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.print("Enter your numbers = ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to check = ");
        int num = sc.nextInt();

        System.out.println("Frequency of number = "+freq(arr,num));
    }
}
