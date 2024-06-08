import java.util.HashMap;

public class StringCompression2 {
    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
