package org.example;

public class ToggleWithBrightness implements Toggle{
    @Override
    public void toggle(int[][] grid, int startX, int startY, int endX, int endY) {
        for(int i=startX;i<=endX;i++)
        {
            for(int j=startX;j<=endY;j++)
            {
                grid[i][j]+=2;
            }
        }
    }
}
