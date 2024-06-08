public class leetcode2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        int count = word.indexOf(ch);

        StringBuilder str = new StringBuilder();

        while(count>=0){
            str.append(word.charAt(count));
            count--;
        }
        count = word.indexOf(ch);
        while(count<word.length()-1){
            str.append(word.charAt(count+1));
            count++;
        }
        System.out.println(str.toString());
    }
}
