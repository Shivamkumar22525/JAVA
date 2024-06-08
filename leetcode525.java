import java.util.*;
public class leetcode525 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==0){
                sum+=-1;
            }else {
                sum+=1;
            }
            if (map.containsKey(sum)){
                int idx = map.get(sum);
                int length = i-idx;
                if (length>ans){
                    ans = length;
                }
            }else{
                map.put(sum,i);
            }
        }
        System.out.println(ans);

    }
}
