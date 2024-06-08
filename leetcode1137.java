public class leetcode1137{
    public static int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int tri = (tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3));
        return tri;



    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(tribonacci(n));
//        int a = 0;
//        int b = 1;
//        int c = 1;
//        int d = 0;
//        for (int i = 3; i<=n; i++){
//            d = a+b+c;
//            a = b;
//            b = c;
//            c = d;
//        }
//        System.out.println(d);
    }
}
