public class Reverse2 {
    public static void main(String[] args) {

//        int rev = 0;
//        int last;

//        while (a>0){
//            last = a%10;
//            rev = (rev*10) + last; //reverse the number
//            a = a/10;
//        }

        int rev = 0;
        for (int a = 12345; a>0;a/=10 ){
            int last = a%10;
             rev = (rev*10) + last;
        }
        System.out.println(rev);
    }
}
