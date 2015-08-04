package com.groucypanda.cmckee.designtemplate;

import java.util.Random;

/**
 * Created by ChristopherMc on 8/4/2015.
 * Psuedoclass used to populate the list (recyclerview)
 */
public class Models {

    private static final Random RANDOM = new Random();
    public static int getRandomDrawable() {
        switch (RANDOM.nextInt(8)) {
            default:
            case 0:
                return R.drawable.sample_0;
            case 1:
                return R.drawable.sample_1;
            case 2:
                return R.drawable.sample_2;
            case 3:
                return R.drawable.sample_3;
            case 4:
                return R.drawable.sample_4;
            case 5:
                return R.drawable.sample_5;
            case 6:
                return R.drawable.sample_6;
            case 7:
                return R.drawable.sample_7;
        }
    }

    public static final String[] sModels = {
            "Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India",
            "Juliett", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo",
            "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-ray", "Yankee", "Zulu"
    };
}
