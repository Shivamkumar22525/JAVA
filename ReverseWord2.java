public class ReverseWord2 {
    public static void reverse2(char[] s){
        int i = 0;
        int j = 0;
        while(i<s.length && j<s.length){
            while(i<s.length && s[i]==' '){
                i++;
            }
            j = i;
            while(j<s.length && s[j] != ' '){
                j++;
            }
            reverse(s,i,j-1);
            i = j;
        }

    }
    public static void reverse(char[] s,int i,int j){

        while(i<=j){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        char[] s = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};

        reverse(s,0,s.length-1);
        reverse2(s);
        System.out.println(s);

    }
}
