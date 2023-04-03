package org.example;

public class TurnOffLightWithBrightness implements TurnOff {
    @Override
    public void turnOff(int[][] grid, int startX, int startY, int endX, int endY) {
        for (int i = startX; i <= endX; i++) {
            for (int j = startY; j <= endY; j++) {
                if(grid[i][j]!=0)
                   grid[i][j]-=1;
            }

        }
    }
}

