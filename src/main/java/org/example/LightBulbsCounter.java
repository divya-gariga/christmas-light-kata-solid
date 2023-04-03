package org.example;

public class LightBulbsCounter{
    public int calculateTotalLightBulbs(int[][] grid) {
        int totalBulbs=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                    totalBulbs+=grid[i][j];
            }
        }
        return totalBulbs;
    }
}
