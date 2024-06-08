public class Optimised_prime {

    public static boolean prime(int n){
        boolean check = true;

        if (n==1){
            return false;
        }
        if (n==2){
            return check;
        }


        for (int i = 2; i<Math.sqrt(n);i++){
            if (n%i==0){
                check = false;
                return check;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        System.out.println(prime(10));

    }
}
