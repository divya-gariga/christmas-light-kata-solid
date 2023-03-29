package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] grid=new int[1000][1000];

        //part one of the problem
        TurnOn onLight= new TurnOnLight();
        TurnOff offLight=new TurnOffLight();
        Toggle toggleLight=new ToggleLight();
        LightBulbsCounter countLightBulbs= new LightBulbsCounter();


//        turn on 887,9 through 959,629
        onLight.turnOn(grid,887,9,959,629);
//        turn on 454,398 through 844,448
        onLight.turnOn(grid,454,398,844,448);
//        turn off 539,243 through 559,965
        offLight.turnOff(grid,539,243,559,965);
//        turn off 370,819 through 676,868
        offLight.turnOff(grid,370,819,676,868);
//        turn off 145,40 through 370,997
        offLight.turnOff(grid,145,40,370,997);
//        turn off 301,3 through 808,453
        offLight.turnOff(grid,301,3,808,453);
//        turn on 351,678 through 951,908
        onLight.turnOn(grid,351,678,951,908);
//        toggle 720,196 through 897,994
        toggleLight.toggle(grid,720,196,897,994);
//        toggle 831,394 through 904,860
        toggleLight.toggle(grid,831,394,904,860);
        System.out.println("total bulbs "+countLightBulbs.calculateTotalLightBulbs(grid));

        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(grid[i], 0);
        }

        //part two of the problem
        TurnOn on= new TurnOnLightWithBrightness();
        Toggle toggle= new ToggleWithBrightness();
        LightBulbsCounter counter= new LightBulbsCounter();

        // turn on 0,0 through 0,0 would increase the total brightness by 1.
        on.turnOn(grid,0,0,0,0);
       // System.out.println("total lit bulbs "+counter.calculateTotalLightBulbs(grid));

       // toggle 0,0 through 999,999 would increase the total brightness by 2000000.
        toggle.toggle(grid,0,0,999,999);
        System.out.println("total lit bulbs "+counter.calculateTotalLightBulbs(grid));

    }
}