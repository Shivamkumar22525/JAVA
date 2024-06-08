public class Prime_range {

    public static boolean prime(int a){
        if (a==1){
            return false;
        }
        if (a==2){
            return true;
        }
        for (int i = 2; i<=Math.sqrt(a); i++){
            if (a%i==0){
                return false;
            }
        }
        return true;
    }

    public static void range(int n,int s){

        for (int i = s; i<n; i++){
            if (prime(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        range(43,6);

    }
}

