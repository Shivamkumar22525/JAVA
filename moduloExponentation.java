public class moduloExponentation {
    public static void main(String[] args) {
        int x = 10000000;
        int n = 10;
        int m = 10000005;
        int res = 1;
        while(n>0){
            if (n/2!=0){
                res = (int) (1L*(res*(x)%m)%m);
            }
            x = (int) ((1L * ((x)%m) * ((x)%m))%m);
            n = n>>1;
        }
        System.out.println(res);
//        long a = ((long) Math.pow(x,n))%m;
//        System.out.println(a);
    }
}
