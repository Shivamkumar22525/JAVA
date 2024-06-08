public class leetcode58 {
    public static void main(String[] args) {
        String s = "abasdasdasd   ";
        int cnt = 0;
        for (int i = s.length()-1; i>=0; i--){
            if (s.charAt(i)!=' '){
                cnt++;
            }else {
                if (cnt>0){

                    break;
                }
            }
        }
        System.out.println(cnt);








    }
}
