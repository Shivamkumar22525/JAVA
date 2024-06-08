public class leetcode1544 {
    public static String goodstring(String s){

        for (int i = 0; i<s.length(); i++){
//            if ((s.charAt(i) == s.charAt(i+1)-32) ||(s.charAt(i) == s.charAt(i+1)+32)){
//                return goodstring(s.substring(0,i)+s.substring(i+2));
//            }
            if ((Math.abs(s.charAt(i)-s.charAt(i+1))==32)){
                return goodstring(s.substring(0,i)+s.substring(i+2));
            }
        }
        return s;


    }
    public static void main(String[] args) {
        String s = "leEeetcode";

        System.out.println(goodstring(s));


    }
}
