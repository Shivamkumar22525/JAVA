public class MergetwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,7,9,0,0,0,0,0};
        int m = 5;
        int[] arr2 = {1,4,6,8,10};
        int n = 5;
//        int idx = arr1.length-1;

        int i = m-1;
        int j = n-1;
        while (j>=0 && i >=0){
            if (arr1[i]<arr2[j]){
                arr1[i+j+1] = arr2[j--];
            }else {
                arr1[i+j+1] = arr1[i--];
            }
        }

        while(j>=0){
            arr1[i+j+1] = arr2[j--];
        }
        while(i>=0){
            arr1[i+j+1] = arr1[i--];
        }
        for (int k = 0; k<arr1.length; k++){
            System.out.print(arr1[k]+",");
        }
    }
}
