import java.util.Scanner;

public class techfest1 {
    public static int first(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        int firstOccur = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == num) {
                firstOccur = mid;
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return firstOccur;
    }
    public static int last(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        int lastOccur = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == num) {
                lastOccur = mid;
                low = mid + 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return lastOccur;
    }
    public static int freq(int[] arr, int num) {
        int first = first(arr, num);
        int last = last(arr, num);

        if (first == -1 || last == -1) {
            return 0;
        }

        return last - first + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 4, 4, 5};
        int num = sc.nextInt();

        System.out.println("frequency of " + num + " is = " + freq(arr,num));

    }
}
