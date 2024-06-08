//public class Printi {
//    public static void main(String[] args) {
//
//        for (int i = 0; i<=5; i++){
//            System.out.println("i = " + i);
//        }
//        System.out.println("i after loop = " + i);
//    }
//}
import java.util.Scanner;

public class Printi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a = 0;
//        int b = 1;
//        int c;
//        int n = 5;
//        c = a + b;
//        System.out.print(a+" ");
//        System.out.print(b+" ");
//
//        for (int i = 0; i < n ; i++) {
//            System.out.print(c + "  ");
//
//                int temp = c;
//                a = b;
//                b = temp;
//                c = a + b;
//
//
//
//
//
//        }


//        int n = sc.nextInt();
//        int r = sc.nextInt();
//        int nMr = n-r;
//
//        int factN =1;
//        while(n>=2){
//            factN *= n;
//            n--;
//        }
//
//        int factR =1;
//        while(r>=2){
//            factR *= r;
//            r--;
//        }
//        int factNmR =1;
//        while(nMr>1){
//            factNmR *= nMr;
//            nMr--;
//        }
//
//
//
//        int ans = (factN)/(factR * factNmR);
//
//        System.out.print(ans);






        int n =5;
        int a =1;

        for (int i=1; i<=n; i++){
            for (int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            for (int j=0; j<i; j++) {
                System.out.print(a+"   ");

            }
            a++;
            System.out.println();

        }

    }
}
