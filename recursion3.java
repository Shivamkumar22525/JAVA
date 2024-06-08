public class recursion3 {
    public static void count(int n){
        if (n==0){
            return;
        }
        count(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        count(n);
    }
}
