import java.util.Arrays;

public class leetcode621 {
    public static void main(String[] args) {
        char[] arr = {'A','A','A','B','B','B'};
        int n = 2;
        int[] count = new int[26];
        for (int i = 0; i<arr.length; i++){
            char ch = arr[i];
            count[ch-'A']++;
        }
        Arrays.sort(count);
        int max = count[25];

        int time = max;
        int totalSpaces = (time-1)*n;
        for (int i = 24; i>=0; i--){
            if (totalSpaces<count[i]) {
                time+=count[i];
                totalSpaces = 0;
            }else if (totalSpaces==0 && count[i]<max){
                time+=count[i];
            }else if(count[i]==max){
                time+=count[i];
                totalSpaces-=count[i]-1;
            } else if (count[i]<max) {
                time+=count[i];
                totalSpaces-=count[i];
            }

        }
        int ans = time+totalSpaces;
        System.out.println(ans);

    }
}
