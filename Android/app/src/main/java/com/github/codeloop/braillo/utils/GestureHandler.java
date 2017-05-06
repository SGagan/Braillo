package com.github.codeloop.braillo.utils;

/**
 * <p>
 * Created by Angad Singh on 6/5/17.
 * </p>
 */

public interface GestureHandler {
    void onSwipeRight(int fingers);
    void onSwipeLeft(int fingers);
    void onSwipeUp(int fingers);
    void onSwipeDown(int fingers);
    void onTouch(int counts);
}
