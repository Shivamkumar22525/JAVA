import java.util.*;
public class leetcode881 {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = 1;
        int weight = 0;
        int boat = 0;

        while(i<people.length || j<people.length){
            if(j<people.length){
                weight+= people[i]+people[j];
            }else{
                weight+= people[i];
            }

            if(weight<=limit){
                boat++;
                i+=2;
                j+=2;
                weight = 0;
            }else if(weight>limit){
                boat++;
                i++;
                j++;
            }
        }
        return boat;
    }
    public static void main(String[] args) {
        int[] people = {3,4,3};
        int limit = 5;
        System.out.println(numRescueBoats(people,limit));
    }
}
