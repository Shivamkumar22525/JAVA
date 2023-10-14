public class Binomial {

    public static int fact(int n){
        int fact = 1;

        for (int i=1; i<=n;i++){
            fact = fact*i;
        }

        return fact;
    }

    public static int binomial(int n,int r){

        int factN = fact(n);
        int factR = fact(r);
        int factZ = fact(n-r);

        int Binomial = factN/(factR*factZ);

        return Binomial;
    }
    public static void main(String[] args) {
        System.out.println("Binomial coefficient = "+binomial(5,4));
    }
}
