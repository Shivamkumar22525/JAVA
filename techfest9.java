public class techfest9 {
    public static int sumofcubes(int n){
        int res = 0;
        while(n!=0){
            int dig = n%10;
            res = res+(dig*(dig*dig));
            n = n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        int a = 371;
        if (a==sumofcubes(a)){
            System.out.println("armstrong number");
        }else {
            System.out.println("not armstrong number");
        }
    }
}
