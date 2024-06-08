public class LinearSearchRecursion {
    public static boolean search(int[] arr,int i,int n){
        if (i == arr.length){
            return false;
        }
        if(arr[i]==n){
            return true;
        }
        return search(arr,i+1,n);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = 0;
        int num = 7;
        if (search(arr,i,num)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

    }
}
