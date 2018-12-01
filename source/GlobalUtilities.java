/*
Class to store Model Organism information in a global scale
*/
package code;

import java.util.ArrayList;

public final class GlobalUtilities{
    //----- Variables to take note of -----//
    // Model Organism Information
    private static int fruitFlyCount = 0;
    private static int zebraFishCount = 0;
    private static int mouseCount = 0;
    private static int chickenCount = 0;

    //----- Public functions -----//
    //--- GETters ---//
    public static int getFruitFlyCount(){return fruitFlyCount;}

    public static int getZebraFishCount(){return zebraFishCount;}

    public static int getMouseCount(){return mouseCount;}

    public static int getChickenCount(){return chickenCount;}

   
    //--- SETters ---//
    public static void setFruitFlyCount(int userInputFruitFlyCount){
        fruitFlyCount = userInputFruitFlyCount;
    }

    public static void setZebraFishCount(int userInputZebraFishCount){
        zebraFishCount = userInputZebraFishCount;
    }

    public static void setMouseCount(int userInputMouseCount){
        mouseCount = userInputMouseCount;
    }

    public static void setChickenCount(int userInputChickenCount){
        chickenCount = userInputChickenCount;
    }
}
