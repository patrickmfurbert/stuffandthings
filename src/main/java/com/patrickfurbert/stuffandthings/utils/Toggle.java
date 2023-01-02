package com.patrickfurbert.stuffandthings.utils;

import org.springframework.stereotype.Component;

@Component
public class Toggle {
    private static boolean state;

    Toggle(){
        this.state = false;
    }

    public static void toggleState(){
        state = !state;
    }

    public static boolean getState(){
        return state;
    }
}
