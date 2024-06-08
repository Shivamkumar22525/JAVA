public class leetcode2370 {
    public static int longestString(String s, int k, int idx, char lastCharacter){
        if(idx>=s.length()){
            return 0;
        }
        // Including
        int pick = 0;
        char currCharacter = s.charAt(idx);
        int diff = Math.abs(lastCharacter-currCharacter);
        if(lastCharacter=='*' || diff<=k){
            pick = 1+ (longestString(s,k,idx+1,currCharacter));
        }

        //Not including

        int notPick = 0+ (longestString(s,k,idx+1,lastCharacter));

        return Math.max(pick,notPick);
    }

    public static void main(String[] args) {
        String s = "acfgbd";
        int k = 2;
        int i = 0;
        char lastCharacter = '*';
        System.out.println(longestString(s,k,i,lastCharacter));



    }
}
