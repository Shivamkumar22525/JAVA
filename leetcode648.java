import java.util.ArrayList;
import java.util.List;

public class leetcode648 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("aa");
        list.add("aaa");
        list.add("aaaa");

        String sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";
        ArrayList<String> list1 = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        int l = 0;
        for(int j = 0; j<sentence.length(); j++) {
            StringBuilder str1 = new StringBuilder();
            for (; l < sentence.length(); l++) {
                if (sentence.charAt(l) == ' ') {
                    break;
                }
                if (sentence.charAt(l) != ' ') {
                    str1.append(sentence.charAt(l));
                }
            }
            if(!String.valueOf(str1).equals(" ")){
                list1.add(String.valueOf(str1));
                j = l;
                l++;
            }
        }
        System.out.println(list1);
        System.out.println(list);



        for(int i = 0; i<list.size(); i++){
            for(int j = 0; j<list1.size(); j++){

                String s1 = list.get(i);
                String s2 = list1.get(j);
                boolean flag = false;
                for(int k = 0; k<s1.length(); k++){
                    if(s1.length()>s2.length()){
                        break;
                    }
                    if(s1.charAt(k)!=s2.charAt(k)){
                        flag = false;
                        break;
                    }else{
                        flag = true;
                    }
                }
                if(flag){
                    list1.remove(j);
                    list1.add(j,list.get(i));

                }
            }
        }
        System.out.println(list1);
        for(int i = 0; i<list1.size(); i++){
            if(i==list1.size()-1){
                str.append(list1.get(i));
            }else{
                str.append(list1.get(i));
                str.append(" ");
            }
        }
        System.out.println(str.length());
        System.out.println(str.toString());

    }
}
