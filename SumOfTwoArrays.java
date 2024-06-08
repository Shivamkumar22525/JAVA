public class SumOfTwoArrays {
    public static int sum(int[] arr,int p){
        int sum1 = 0;
        int pow = 0;

        for (int i = p-1; i>=0; i--){
            sum1+=arr[i]*(int)Math.pow(10,pow);
            pow++;
        }
        return sum1;
    }
    public static int Fsum( int finalSum){
        int count = 0;
        while(finalSum>0){
            finalSum/=10;
            count++;
        }
        return count;
    }
    public static int[] reverse(int[] ans){
        int start = 0;
        int end = ans.length-1;
        while(start<end){
            int temp = ans[end];
            ans[end] = ans[start];
            ans[start] = temp;
            start++;
            end--;
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr1 = {9,9,1};
        int n = arr1.length;
        int[] arr2 = {3,4,5};
        int p = arr2.length;
        int finalSum = sum(arr1,n)+sum(arr2,p);
        int s = Fsum(finalSum);

        int[] ans = new int[s];
        for (int i = 0; i<s; i++){
            int r = finalSum%10;
            finalSum/=10;
            ans[i] = r;
        }
        reverse(ans);
        for (int i = 0; i<s; i++){
            System.out.print(ans[i]+",");
        }
    }
}
