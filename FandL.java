public class FandL {
    public static void firstIndex(int[] arr,int d){


            int l = 0;
            int h = arr.length - 1;
            int first = -1;


            while (l <= h) {
                int mid = (l + h) / 2;
                if (arr[mid] < d) {
                    l = mid + 1;
                } else if (arr[mid] > d) {
                    h = mid - 1;
                } else {
                    first = mid;
                    h = mid - 1;

                }
            }

        System.out.println(first);


    }
    public static void lastIndex(int[] arr,int d){
        int l = 0;
        int h = arr.length - 1;
        int last = -1;


        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] < d) {
                l = mid + 1;
            } else if (arr[mid] > d) {
                h = mid - 1;
            } else {
                last = mid;
                l = mid + 1;

            }
        }

        System.out.println(last);


    }
    public static void main(String[] args) {

        int[] arr = {10,20,30,30,30,30,30,30,40,50,60};
        int d = 30;
        firstIndex(arr,d);
        lastIndex(arr,d);
    }
}
