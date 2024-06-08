public class SumRecursion {

    public static int add(int[] arr,int i){
        if(i == arr.length-1){
            return arr[i];
        }
        return arr[i] + add(arr,i+1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(add(arr,0));

    }
}
