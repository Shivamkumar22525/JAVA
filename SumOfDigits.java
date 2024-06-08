import java.util.Scanner;

public class SumOfDigits {

    public static int sum_digits(int n){
        int sum = 0;
        for (int i = n; i>0; i/=10){
            int LD = i%10;
            sum = sum+LD;
        }
        return sum;


    }
    public static void main(String[] args) {

        System.out.println(sum_digits(4));

    }
}
