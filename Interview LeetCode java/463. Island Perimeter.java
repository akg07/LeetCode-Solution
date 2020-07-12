class Solution {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        if(grid == null) return 0;
        
        int peri = 0;
        for(int i=0; i<r; i++){
            for(int j=0;j<c; j++){
                if(grid[i][j] == 1){
                    peri+=4;
                    if(i > 0 && grid[i-1][j] == 1) peri -= 2;     //UP
                    
                    if(j > 0 && grid[i][j-1] == 1) peri -= 2;     //LEFT
                    
                }
                    
            }
        }
        return peri;
    }
}


/*
class Solution {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        if(grid == null) return 0;
        
        int peri = 0;
        for(int i=0; i<r; i++){
            for(int j=0;j<c; j++){
                if(grid[i][j] == 1)
                    peri += (4-neighbour(grid, i,j, r, c));
            }
        }
        return peri;
    }
    public int neighbour(int[][] grid, int i, int j, int r, int c) {
        int count  = 0;
        
        //up
        if(i > 0 && grid[i-1][j] == 1)
            count++;
        
        //LEFT
        if(j > 0 && grid[i][j-1] == 1)
            count++;
        
        ////DOWN
        if(i < r-1 && grid[i+1][j] == 1)
            count++;
        
        //RIGHT
        if(j < c-1 && grid[i][j+1] == 1)
            count++;
        
        return count;
    }
}
*/

/*
class Solution {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        
        if(grid == null) return 0;
        
        int peri = 0;
        for(int i=0; i<r; i++){
            for(int j=0;j<c; j++){
                if(grid[i][j] == 1){
                    if(i == 0 || grid[i-1][j] == 0) peri++;     //UP
                    if(i == r-1 || grid[i+1][j] == 0) peri++;   //DOWN
                    if(j == 0 || grid[i][j-1] == 0) peri++;     //LEFT
                    if(j == c-1 || grid[i][j+1] == 0) peri++;     //RIGHT
                }
                    
            }
        }
        return peri;
    }
}
*/