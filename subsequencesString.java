import java.util.*;
public class subsequencesString {
    public static void solve(String str,ArrayList<String> ans,String output,int idx){
        if (idx>=str.length() ){
            if(!output.isEmpty()) {
                ans.add(output);
            }
            return;
        }
        solve(str,ans,output,idx+1);
        solve(str,ans,output + str.charAt(idx),idx+1);
    }
    public static ArrayList<String> Subsequences(String str) {
        ArrayList<String> ans = new ArrayList<>();

        int idx = 0;
        solve(str,ans,"",idx);
        return ans;
    }
    public static void main(String[] args) {
        String str = "abc";

        System.out.println(Subsequences(str));

    }
}



//public static void solve(String str,List<String> ans,StringBuilder output,int idx){
//    if (idx>=str.length()){
//        ans.add(new String(output));
//        return;
//    }
//
//    solve(str,ans,output,idx+1);
//
//    char ch = str.charAt(idx);
//    output.append(ch);
//    solve(str,ans,output,idx+1);
//    output.deleteCharAt(output.length()-1);
//}
//public static List Subsequences(String str){
//    List<String> ans = new ArrayList<>();
//    StringBuilder output = new StringBuilder();
//    int idx = 0;
//    solve(str,ans,output,idx);
//    ans.remove(0);
//    return ans;
//}f
