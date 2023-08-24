import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{

            System.out.print("Income = ");
            int income = sc.nextInt();
            int Tax;

            if(income<500000){
                Tax = 0;
                System.out.println(Tax);
            } else if(income>500000 && income<1000000)
            {
                Tax = (int) (income *0.20);
                System.out.println(Tax);
            }else{
                Tax = (int) (income* 0.30);
                System.out.println(Tax);
            }
        }
    }
}
