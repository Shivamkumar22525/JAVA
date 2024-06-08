public class techfest3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 100;
        while(b!=0){
            int c = a&b;
            a = a^b;
            b = c<<1;
        }
        System.out.println(a);

    }
}
