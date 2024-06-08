public class BinarySearchRecursion {
    public static boolean search(int[] arr,int low,int high,int num){
        if (low>high){
            return false;
        }
        int mid = low+(high-low)/2;

        if (arr[mid] == num){
            return true;
        }
        if (arr[mid]>num){
            return search(arr,low,mid-1,num);
        }else {
            return search(arr,mid+1,high,num);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int low = 0;
        int high = arr.length-1;
        int num = 7;
        if (search(arr,low,high,num)){
            System.out.println("found");
        }else {
            System.out.println("not found");
        }
    }
}
