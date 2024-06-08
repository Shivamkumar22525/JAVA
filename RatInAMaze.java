import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RatInAMaze {
    public static boolean isSafe(int x,int y,int[][] arr,int m,int n,int[][] visited){
        if ((x>=0 && x<m) && (y>=0 &&y<n) && arr[x][y]==1 && visited[x][y]==0){
            return true;
        }else {
            return false;
        }
    }
    public static void findpath(int[][] arr,int m,int n,ArrayList<String> str,String s,int x,int y,int[][] visited){
        if (x==m-1 && y==n-1){
            str.add(s);
            return;
        }
        visited[x][y] = 1;

        //choices D,L,R,U
        //Down
        int newx = x+1;
        int newy = y;
        if (isSafe(newx,newy,arr,m,n,visited)){
            findpath(arr,m,n,str,s+'D',newx,newy,visited);

        }

        //Left
        newx = x;
        newy = y-1;
        if (isSafe(newx,newy,arr,m,n,visited)){
            findpath(arr,m,n,str,s+'L',newx,newy,visited);

        }

        //Right
        newx = x;
        newy = y+1;
        if (isSafe(newx,newy,arr,m,n,visited)){
            findpath(arr,m,n,str,s+'R',newx,newy,visited);

        }

        //Up
        newx = x-1;
        newy = y;
        if (isSafe(newx,newy,arr,m,n,visited)){
            findpath(arr,m,n,str,s+'U',newx,newy,visited);

        }
        visited[x][y] = 0;
    }
    public static ArrayList<String> solve(int[][] arr,int m,int n){
        ArrayList<String> str = new ArrayList<>();
        if (arr[0][0]==0){
            return str;
        }
        int x = 0;
        int y = 0;
        int[][] visited = new int[m][n];
        for (int i = 0; i<m; i++){
            for (int j = 0; j<n; j++){
                visited[i][j] = 0;
            }
        }
        findpath(arr,m,n,str,"",x,y,visited);
        Collections.sort(str);
        return str;
    }
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        System.out.println(solve(arr,m,n));
    }
}
