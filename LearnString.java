import java.util.Scanner;

public class LearnString {
    public static void reverse(char[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            char temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char[] arr = sc.next().toCharArray();


        int count = 0;

        reverse(arr);
        for(int i = 0;i< arr.length;i++){
            int ch = arr[i];
            if ((ch>=65 && ch<=92)  || (ch>=97 && ch<=122)){
                System.out.print(arr[i] +" , ");
                count++;
            }else {
                break;
            }
        }
        System.out.println();
        System.out.println(count);










//        int size = sc.nextInt();
//        String[] strArr = new String[size];
////
//        for (int i=0;i<size;i++){
//            strArr[i] = sc.next();
//        }
////
//        for (String s : strArr){
//            System.out.println(s);
//        }





    }
}
