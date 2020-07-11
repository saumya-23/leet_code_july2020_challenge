class Solution {
    public int islandPerimeter(final int[][] grid) {

        final int n = grid.length;
        final int m = grid[0].length;
        int perimeter = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 1){
                if(i>0 && grid[i-1][j] == 0 || i==0)
                    perimeter = perimeter+1;
                if((j>0 && grid[i][j-1] == 0) || j==0)
                    perimeter = perimeter+1;
                if((i<(n-1) && grid[i+1][j] == 0) || i==(n-1))
                    perimeter = perimeter+1;
                if((j<(m-1) && grid[i][j+1] == 0) || j==(m-1))
                    perimeter = perimeter+1;
                }
            }
        }
        return perimeter;
    }
}

/*You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water,
and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
Determine the perimeter of the island.

Example:
Input:
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Output: 16
*/