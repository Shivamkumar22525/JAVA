import java.util.*;
public class leetcode1401 {
    public static void main(String[] args) {
        String s = "1111011110000011100000110001011011110010111001010111110001";
        int cnt = 0;
        StringBuilder str = new StringBuilder(s);

        while(str.length()!=1){
            if(str.charAt(str.length()-1)=='0'){
                str.deleteCharAt(str.length()-1);
                cnt++;
            }else if(str.charAt(str.length()-1)=='1'){
                int i = str.length()-1;
                while(str.charAt(i)!='0'){
                    str.setCharAt(i,'0');
                    i--;
                    if(str.charAt(0)=='0'){
                        break;
                    }
                }

//                if(str.charAt(0)=='0'){
//
//                }
                if(str.charAt(0)=='0'){
                    str.insert(0,'1');
                    cnt++;
                }else{
                    str.setCharAt(i,'1');
                    cnt++;
                }
            }
        }
        System.out.println(str);
        System.out.println(cnt);
    }
}
