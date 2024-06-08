public class leetcode79 {

    public static boolean fillWord(char[][] arr,int i, int j,int x,int y,String word,int idx) {
        if (idx == word.length()) {
            return true;
        }
        if ((i==-1 || i==x) || (j==-1 || j==y) || arr[i][j]!=word.charAt(idx)){
            return false;
        }
        char ch = arr[i][j];
        arr[i][j] = '*';

        boolean found = fillWord(arr,i+1,j,x,y,word,idx+1)||
                fillWord(arr,i-1,j,x,y,word,idx+1)||
                fillWord(arr,i,j+1,x,y,word,idx+1)||
                fillWord(arr,i,j-1,x,y,word,idx+1);


        arr[i][j] = ch;
        return found;
    }


    public static boolean check(char[][] arr,int x,int y,String word){
        int idx = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j<y; j++){
                if (arr[i][j]==word.charAt(idx) && fillWord(arr,i,j,x,y,word,idx)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        char[][] arr = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        int x = arr.length;
        int y = arr[0].length;
        System.out.println(check(arr,x,y,word));

    }
}

