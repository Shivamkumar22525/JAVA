public class RecursionSorted {
    public static boolean helpfn(int[] arr,int i, int j){
        if (i==j){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }else {
            boolean ans = helpfn(arr,i+1,j);
            return ans;
        }
    }

    public static boolean check(int[] arr,int size){

        if (size==0 || size==1){
            return true;
        }
        if (arr[0]>arr[1]){
            return false;
        }else {
            boolean ans = helpfn(arr,1,size-1);
            return ans;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,9,1,12};
        int size = arr.length;

        System.out.println(check(arr,size));

    }
}
