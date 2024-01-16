public class PivotElement {
    public static int PivEl(int[] arr){
        int l = 0;
        int h = arr.length-1;
        while (l<h){
            int mid = (l+h)/2;
            if (arr[mid]>=arr[0]){
                l = mid+1;
            }else {
                h = mid;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,7,8,9,1,2};
        System.out.println(PivEl(arr));

    }
}
