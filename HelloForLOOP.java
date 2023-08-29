import java.util.Scanner;

public class HelloForLOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        for (i=0;i<5;i++){
            System.out.println("Hello");
            i=i+2;
        }
    }
}
