public class SayDigit {
    public static void say(int n, String[] arr){
        if (n==0){
            return;
        }
        int digit = n%10;
        n = n/10;

        say(n,arr);
        System.out.print(arr[digit]+" ");
    }
    public static void main(String[] args) {
        int n = 314;
        String[] arr ={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        say(n,arr);

    }
}
