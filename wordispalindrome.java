public class wordispalindrome {
   public static boolean check(String s1) {
       int start = 0;
       int end = s1.length()-1;
       while (start<end){
           if (s1.charAt(start)!=s1.charAt(end)){
               return false;
           }
           start++;
           end--;
       }
       return true;

   }
        public static void main (String[]args){
            String[] s = {"abc", "car", "ada", "racecar", "cool"};


            for (int i = 0; i < s.length; i++) {
                if(check(s[i])){
                    System.out.println(s[i]);
                    break;
                }
                }

            }


        }

