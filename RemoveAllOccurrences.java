public class RemoveAllOccurrences {
    public static String search(String s, String part){

        StringBuilder str = new StringBuilder();

       for (int i = 0; i<=s.length()-part.length();i++){
           if (s.substring(i,(i+part.length())).equals(part)){
               str.append(s.substring(0,i));
               str.append(s.substring(i+part.length(),s.length()));
               break;
           }
       }
       return str.toString();
    }
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        if (part.isEmpty()){
            System.out.println("Enter the valid part");
        }
        while(s.contains(part)){
            s = search(s,part);
        }
        System.out.println(s);
    }
}
