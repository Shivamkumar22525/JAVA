public class BitoDec {

    public static int Dec(int n){
        int dec = 0;
        int pow = 0;
        for (int i = n; i>0; i /=10){
            int LD = i%10;
            System.out.println(LD);
            dec = dec+(LD*(int)Math.pow(2,pow));
            pow++;
        }
        return dec;

    }
    public static void main(String[] args) {

//        System.out.println(Dec(101));
        Dec(101);
    }
}
