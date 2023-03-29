package org.example;

public class TurnOnLightWithBrightness implements TurnOn {
    @Override
    public void turnOn(int[][] grid, int startX, int startY, int endX, int endY) {
        for(int i=startX;i<=endX;i++)
        {
            for(int j=startY;j<=endY;j++)
            {
                grid[i][j]+=1;
            }
        }
    }
}
