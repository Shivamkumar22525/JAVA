public class GCDof2Num {
    public static int gcd(int a,int b){
        while (a!=b) {
            if (a==0){
                return b;
            }
            if (b==0){
                return a;
            }
            if (a > b) {
                a = a-b;
            }else{
                b = b-a;
            }
        }

        return a;
    }
    public static int lcm(int a,int b,int gcd){
        int lcm = a*b/gcd;
        return lcm;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 56;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b,gcd(a,b)));
        System.out.println(lcm(a,b,gcd(a,b))*gcd(a,b));
        System.out.println(a*b);

    }
}
