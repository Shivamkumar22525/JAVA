import java.util.ArrayList;

public class BookAllocated {
    public static boolean possible(ArrayList<Integer> arr, int mid,int m){
        int student = 1;
        int pagesum = 0;
        for (int i = 0; i<arr.size(); i++){
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


    public static int allocate(ArrayList<Integer> arr,int m){
            int l = 0;
            int sum = 0;
            int ans = -1;

            for (int i = 0; i< arr.size(); i++){
                sum += arr.get(i);
            }
            int h = sum;


            while (l<=h){
                int mid = l+(h-l)/2;
                if (possible(arr,mid,m)){
                    ans = mid;
                    h = mid-1;
                }else {
                    l = mid+1;
                }
            }
            return ans;
    }


    public static void main(String[] args) {
//        2 8 8 4 5

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(8);
        arr.add(8);
        arr.add(4);
        arr.add(5);

        int m = 6;


        System.out.println(allocate(arr,m));
    }
}
