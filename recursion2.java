public class recursion2 {
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        int smallerProblem = fact(n-1);
        int biggerproblem = n*smallerProblem;
        return biggerproblem;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
