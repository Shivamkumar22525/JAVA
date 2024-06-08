public class recursion1 {
    public static int power(int n){
        if (n==0){
            return 1;
        }
        int smallerProblem = power(n-1);
        int biggerProblem = 2*smallerProblem;
        return biggerProblem;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(power(n));

    }
}
