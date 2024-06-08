public class techfest8 {
    public static boolean checkleapyear(int yr){
        if (yr%100==0){
            return false;
        }
        if (yr%4==0){
            return true;
        }
        if (yr%400==0){
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int yr = 2023;
        if (checkleapyear(yr)){
            System.out.println("Leap year");
        }else {
            System.out.println("Not Leap Year");
        }
    }
}
