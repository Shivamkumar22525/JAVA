import java.util.Scanner;

import static java.lang.Math.round;

public class SquareRoot {
    public static int root(int n){
        long l = 0;
        long h = n;
        long ans = -1;
        while(l<=h){
            long mid = l+(h-l)/2;
            long square = mid*mid;
            if (square==n){
                return (int)mid;
            }
            if (square<n){
                ans = mid;
                l = mid+1;
            }else {
                h = mid-1;
            }
        }
        return (int)ans;
    }
    public static double sqrt(int n, int total, int place){
//        n = 11;total = 3....;place.000
        double factor = 1;
        double finalAnswer = total;
        for (int i = 0; i<place; i++){
            factor = factor/10;
            for (double j = finalAnswer; j*j<n; j = j+factor){
                finalAnswer = j;
            }
        }
        return finalAnswer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int place = sc.nextInt();
        int total = root(n);
        double ans = sqrt(n,total,place);
        System.out.printf("%.3f%n",ans);
    }
}
