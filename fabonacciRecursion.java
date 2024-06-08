public class fabonacciRecursion {
    public static long find(int term){
        if (term==0){
            return 0;
        }
        if (term==1){
            return 1;
        }
//        int a = 0;
//        int b = 1;
//        int c = 0;
//
//        for (int i = 2; i<term; i++){
//            c = a+b;
//            a = b;
//            b = c;
//        }
//        return c;

        int fabo = (int) (find(term-2)+find(term-1));
        return fabo;
    }
    public static void main(String[] args) {
        int term = 4;
        System.out.println(find(term));
    }
}
