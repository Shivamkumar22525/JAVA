public class ReplaceSpaces {

    public static void main(String[] args) {
        String s = "            My name is shivam kumar       ";
//        s = s.trim();
        int maxCount = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                maxCount++;
            }
        }

        int idx = 0;
        int wordCount = 0;
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if(idx == maxCount){
                break;
            }
            if (s.charAt(i)!=' '){
                s1.append(s.charAt(i));
                wordCount++;
                idx++;
            }else {
                if(wordCount != 0){
                    s1.append("@40");
                }
            }

        }
        System.out.print(s1);


//        System.out.println(replace(new StringBuilder(String.valueOf(str))));
    }
}
