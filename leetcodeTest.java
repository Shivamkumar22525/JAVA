public class leetcodeTest {
    public static boolean satisfiesConditions(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if (i+1>=m){
                    break;
                }
                if(grid[i][j]!=grid[i+1][j]){
                    return false;
                }
                if (j+1>=n){
                    break;
                }
                if ((grid[i][j]==grid[i][j+1])){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] grid = {{1,4},{6,6}};
        System.out.println(satisfiesConditions(grid));

    }
}
