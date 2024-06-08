import java.util.*;

public class leetcode506 {
    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        int[] score1 = new int[score.length];
        for (int i = 0; i<score1.length; i++){
            score1[i] = score[i];
        }
        Arrays.sort(score1);
        int n = score1.length-1;
        int place = 1;
        HashMap<Integer,String> map = new HashMap<>();
        for(int i = n; i>=0; i--){
            if(i==n){
                map.put(score1[i],"Gold Medal");
                place++;
            } else if (i==n-1) {
                map.put(score1[i],"Silver Medal");
                place++;
            } else if (i==n-2) {
                map.put(score1[i],"Bronze Medal");
                place++;
            }else{
                map.put(score1[i],String.valueOf(place));
                place++;
            }
        }
        String[] str = new String[score.length];
        for (int i = 0; i<str.length; i++){
            str[i] = map.get(score[i]);
        }
        for(int i = 0; i<str.length; i++){
            System.out.println(str[i]);
        }


    }
}
