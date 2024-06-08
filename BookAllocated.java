import java.util.ArrayList;
import java.util.Scanner;

public class BookAllocated {
    public static boolean possible(ArrayList<Integer> arr, int mid,int m,int n){
        int student = 1;
        int pagesum = 0;
        for (int i = 0; i<n; i++){
            if (mid>=pagesum+arr.get(i)){
                pagesum+=arr.get(i);
            }else {
                student++;
                if (student>m || arr.get(i)>mid){
                    return false;
                }
                pagesum = arr.get(i);
            }

        }
        return true;
    }


    public static int allocate(ArrayList<Integer> arr,int m,int n){
            int l = 0;
            int sum = 0;
            int ans = -1;

            for (int i = 0; i< n; i++){
                sum += arr.get(i);
            }
            int h = sum;


            while (l<=h){
                int mid = l+(h-l)/2;
                if (n<m){
                    return -1;
                }
                if (possible(arr,mid,m,n)){
                    ans = mid;
                    h = mid-1;
                }else {
                    l = mid+1;
                }
            }
            return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers of books = ");
        int n = sc.nextInt();

        System.out.print("Enter the number of students = ");
        int m = sc.nextInt();

        System.out.print("Enter the elements = ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i<n; i++){
            int j = sc.nextInt();
            arr.add(j);
        }
//        arr.add(2);
//        arr.add(8);
//        arr.add(8);
//        arr.add(4);
//        arr.add(5);

        System.out.println(allocate(arr,m,n));
    }
}
