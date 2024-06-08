public class leetcode3110 {
    public static void main(String[] args) {
        String s = "hello";
        int sum = 0;
        int i = 0;
        int j = 1;
        while(i<s.length()-1){
            sum += Math.abs(s.charAt(i) - s.charAt(i+1));
            i++;
//            j++;
        }
        System.out.println(sum);
    }
}
