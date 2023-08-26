import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Day = ");
        int day = sc.nextInt();

        switch (day)
        {
            case 1 : {
                System.out.println("Monday");
                break;
            }
            case 2 : {
                System.out.println("Tuesday");
                break;
            }
            case 3 : {
                System.out.println("Wednesday");
                break;
            }
            case 4 : {
                System.out.println("Thursday");
                break;
            }
            case 5 : {
                System.out.println("Friday");
             break;
            }
            case 6 : {
                System.out.println("Saturday");
             break;
            }
            case 7 : {
                System.out.println("Sunday");
            }
            default:{
                System.out.println("Day can't be less than 1 and more than 7 in a week");
            }

        }
    }
}
