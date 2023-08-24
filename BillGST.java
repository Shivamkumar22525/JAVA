import java.util.*;

public class BillGST {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);{

            float pencil = 15.40f;
            System.out.println("price of pencil = " + pencil);

            float pen = 10.50f;
            System.out.println("price of pen = " + pen);

            float eraser = 7.50f;
            System.out.println("price of eraser = " + eraser);

            float TotalBill = pencil+pen+eraser;
            System.out.println("Total Bill = " + TotalBill);

            float GST = TotalBill * 18/100f;
            System.out.println("18% GST = " + GST);

            float newbill = TotalBill + GST;
            System.out.println("New Bill = " + newbill);

            float q = 0.18f*TotalBill;
            System.out.println(q);




        }
    }
}
