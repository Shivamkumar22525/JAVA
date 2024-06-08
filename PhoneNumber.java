import java.util.*;
public class PhoneNumber {
    public static void answer(String digit,String output,List<String> ans,String[] mapping,int idx){
        if (idx>=digit.length()){
            if (!output.isEmpty()){
                ans.add(output);
            }
            return;
        }

        int num = digit.charAt(idx)-'0';
        String value = mapping[num];
        for (int i = 0; i<value.length(); i++){
            answer(digit,output+value.charAt(i),ans,mapping,idx+1);
        }

    }
    public static List solve(String digit){
        List<String> ans = new ArrayList<>();
        if (digit.isEmpty()){
            return ans;
        }
        int idx = 0;
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqr","stuv","wxyz"};
        answer(digit,"",ans,mapping,idx);
        return ans;
    }
    public static void main(String[] args) {
        String digit = "23";

        System.out.println(solve(digit));
    }
}
