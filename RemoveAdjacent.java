public class RemoveAdjacent {

//    public static String adjacent(String s){
//        StringBuilder str = new StringBuilder(s);
//        int flag;
//        do {
//            flag = 0;
//            for (int i = 0; i < str.length() - 1; i++) {
//                if (str.charAt(i) == str.charAt(i + 1)) {
//                    str.delete(i, i + 2);
//                    flag++;
//                }
//            }
//        } while (flag != 0);
//        return str.toString();
//    }
    public static void main(String[] args) {
        String s = "abcde";
        StringBuilder str = new StringBuilder(s);
        System.out.println(str);
        str.delete(0,2);
        System.out.println(str);
//        System.out.println(adjacent(s));
    }
}
