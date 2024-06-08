import java.util.Scanner;

public class BinarySearch {

    public static int binary(int[] num,int key){
        int start = 0, end = num.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(num[mid]==key){
                return mid;
            }
            if (num[mid] > key){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = {-1,2,3,4,5,6,7,8,9};

        System.out.print("Enter your key = ");
        int key = sc.nextInt();

        System.out.println("At index  = " + binary(num,key));

    }
}
