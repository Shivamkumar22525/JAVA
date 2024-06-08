public class RecursionPower {
    public static int find(int n,int pow){
        if (pow==0){
            return 1;
        }
        if (pow==1){
            return n;
        }
        int ans = find(n,pow/2);

        if (pow%2==0){
            return ans*ans;
        }else{
            return n*ans*ans;
        }
    }
    public static void main(String[] args) {
        int n = 2;
        int pow = 13;
        System.out.println(find(n,pow));
    }
}
