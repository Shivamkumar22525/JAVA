import java.util.Scanner;

public class HelloForLOOP {
    public static boolean check(int num,int n){
        if (n==1){
            return true;
        }

       for (int i = n; i>1; i/=2){

           if (i%2!=0){
               break;
           }
           if (i==2){
               return true;
           }
       }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int i;
//        for (i=0;i<5;i++){
//            System.out.println("Hello");
//            i=i+2;
//        }
        int num = 2;
        int n = 10;
        if (check(num,n)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
