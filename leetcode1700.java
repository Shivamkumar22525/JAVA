import java.util.*;
public class leetcode1700 {
    public static int check(int[] students,int[] sandwiches){
        int circle = 0;
        int square = 0;
        for (int i = 0; i<students.length; i++){
            if (students[i]==0){
                circle++;
            }else {
                square++;
            }
        }
        for (int i = 0; i<sandwiches.length; i++){
            if (sandwiches[i]==0 && circle==0){
                return square;
            }
            if (sandwiches[i]==1 && square==0){
                return circle;
            }
            if (sandwiches[i]==0){
                circle--;
            }else {
                square--;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        System.out.println(check(students,sandwiches));


    }
}
