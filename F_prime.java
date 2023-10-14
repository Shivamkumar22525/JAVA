public class F_prime {

    public static boolean prime(int n){
        boolean check = true;

        for (int i = 2; i<n; i++){
            if (n%i==0){
                check = false;
                return check;
            }
        }
        return check;
    }
    public static void main(String[] args) {

        System.out.println(prime(5));

    }
}
