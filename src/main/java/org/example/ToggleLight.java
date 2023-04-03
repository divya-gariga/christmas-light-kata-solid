package org.example;

public class ToggleLight implements Toggle  {
    public void toggle(int[][] grid, int startX, int startY, int endX, int endY) {
        for(int i=startX;i<=endX;i++)
        {
            for(int j=startY;j<=endY;j++)
            {
                grid[i][j]=1-grid[i][j];
            }
        }
    }
}
