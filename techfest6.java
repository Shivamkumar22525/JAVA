public class techfest6 {
    public static void main(String[] args) {
        int a = 23;
        int b = 3;
        boolean prime = true; // previous was false
        while (b!=a){
            if (a%b==0){
                prime = false; // previous was true
                break;
            }
            b++;
        }
        if (prime){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
