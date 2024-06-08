import java.util.*;

public class leetcode846 {
    public static void main(String[] args) {
        int[] hand = {12,67,8};
        Arrays.sort(hand);
        int groupSize = 3;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i<hand.length; i++){
            if(map.containsKey(hand[i])){
                map.put(hand[i], map.get(hand[i])+1);
            }else{
                map.put(hand[i],1);
            }
        }
        System.out.println(map);

        while(!map.isEmpty()){
            int curr = map.firstKey();
            for(int i = 0; i<groupSize; i++){
                if(!map.containsKey(curr + i)){
                    break;
                }
                map.put(curr+i,map.get(curr+i)-1);
                if(map.get(curr+i)==0){
                    map.remove(curr+i);
                }
            }
        }
        if(map.isEmpty()){
            System.out.println(true);
        }





    }
}
