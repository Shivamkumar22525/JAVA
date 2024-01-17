public class SearchInRotatedarray {
    public static int PiEl(int[] arr){
        int l = 0;
        int h = arr.length-1;
        while(l<h){
            int mid = (l+h)/2;
            if (arr[mid]>=arr[0]){
                l = mid+1;
            }else {
                h = mid;
            }
        }
        System.out.println(l);
        return l;
    }

    public static int binary(int[] arr,int l, int h,int target){
        int low = l;
        int high = h;
        while(low<=high){
            int mid = (low + high)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (arr[mid]<target){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {5,1,3};
        int target = 3;
        int pivot = PiEl(arr);
        if(arr[pivot] == target) {
            System.out.println(pivot);
        }else if (arr[pivot]<target && target<=arr[arr.length-1]){
            System.out.println(binary(arr,pivot,arr.length-1,target));
        }else {
            System.out.println(binary(arr,0,pivot-1,target));
        }
    }
}
