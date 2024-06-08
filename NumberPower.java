import java.util.*;
public class NumberPower {
    public static void main(String[] args) {
        int num = 2;
        int pow = 50;
        int ans = 1;
        for (int i = 0; i<pow; i++){
            ans*=num;
        }
        System.out.println(ans);
    }
}
