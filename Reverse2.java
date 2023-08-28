import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rev = 0;
        int last;

        int a = sc.nextInt();


        while (a>0){
            last = a%10;
            rev = (rev*10) + last; //reverse the number
            a = a/10;
        }
        System.out.println(rev);


        for ( a = 12345; a>0;a/=10 ){
             last = a%10;
             rev = (rev*10) + last;
        }
        System.out.println(rev);
    }
}
