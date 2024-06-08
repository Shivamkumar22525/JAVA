public class DectoBi {
    public static int Dec(int n){
        int pow = 0;
        int bin = 0;
        for (int i = n; i>0; i/=2){
            int rem = i%2;
            bin = bin+rem*(int)Math.pow(10,pow);
            pow++;
        }
        return bin;
    }
    public static void main(String[] args) {

        System.out.println(Dec(20));

    }
}
