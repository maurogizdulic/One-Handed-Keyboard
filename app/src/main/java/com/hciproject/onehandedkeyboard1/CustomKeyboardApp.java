package com.hciproject.onehandedkeyboard1;

import static java.security.AccessController.getContext;

import android.content.Context;
import android.graphics.Canvas;
import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputConnection;
import android.widget.LinearLayout;

public class CustomKeyboardApp extends InputMethodService
        implements KeyboardView.OnKeyboardActionListener {

    private LinearLayout mInputView;
    private LayoutInflater layoutInflater;
    private KeyboardView keyboardView;
    boolean upperKeyboard = true;
    private  KeyEvent keyEventSpace = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_SPACE);
    private KeyEvent keyEventBackspace = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL);
    private KeyEvent keyEventEnter = new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER);
    private float keyboardX;

    @Override
    public View onCreateInputView() {
        keyboardView = (KeyboardView) getLayoutInflater().inflate(R.layout.custom_keyboard_layout, null);
        Keyboard keyboard = new Keyboard(this, R.xml.main_keyboard_up);
        keyboardView.setKeyboard(keyboard);

        WindowManager windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int screenWidth = displayMetrics.widthPixels;
        //float keyboardX = 0;
       // Log.d("SCREEN WIDTH", String.valueOf(screenWidth));
      //  int keyboardWidth = keyboardView.getWidth();
      //  Log.d("KEYBOARD WIDTH", String.valueOf(keyboardView.getX()));

        // Setting keyboard to right side
        // First calculate where to put X of keyboard
        keyboardX = (float) (screenWidth - (screenWidth * 0.6));
        Log.d("KEYBOARD X", String.valueOf(keyboardX));
        keyboardView.setX(keyboardX);

        Log.d("KEYBOARD WIDTH", String.valueOf(keyboardView.getX()));

        keyboardView.setOnKeyboardActionListener(this);
        return keyboardView;
    }




    @Override
    public void onPress(int i) {
    }

    @Override
    public void onRelease(int i) {
    }

    @Override
    public void onKey(int value, int[] ints) {
        InputConnection inputConnection = getCurrentInputConnection();
        Keyboard newKeyboard;
        KeyEvent keyEvent;

        if (inputConnection != null){

            Log.d("INPUT_KEYBOARD", String.valueOf(value));

            if(value == -1){
                newKeyboard = new Keyboard(this, R.xml.keyboard1up);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -2) {
                newKeyboard = new Keyboard(this, R.xml.keyboard2up);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -3){
                newKeyboard = new Keyboard(this, R.xml.keyboard3up);
                keyboardView.setKeyboard(newKeyboard);

            }
            else if(value == -4){
                newKeyboard = new Keyboard(this, R.xml.keyboard4up);
                keyboardView.setKeyboard(newKeyboard);

            }
            else if(value == -5){
                newKeyboard = new Keyboard(this, R.xml.keyboard5up);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -6){
                newKeyboard = new Keyboard(this, R.xml.keyboard6up);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -7){
                newKeyboard = new Keyboard(this, R.xml.keyboard7up);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -8){
                newKeyboard = new Keyboard(this, R.xml.keyboard8up);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -9){
                newKeyboard = new Keyboard(this, R.xml.keyboard9up);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -10){
                newKeyboard = new Keyboard(this, R.xml.main_keyboard);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if (value == -11) {
                newKeyboard = new Keyboard(this, R.xml.keyboard_symbol_1);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if (value == -12) {
                inputConnection.sendKeyEvent(keyEventBackspace);
            }
            else if (value == -13) {
                inputConnection.sendKeyEvent(keyEventSpace);
            }
            else if (value == -14) {
                inputConnection.sendKeyEvent(keyEventEnter);
            }
            else if(value == -15){
                newKeyboard = new Keyboard(this, R.xml.keyboard0up);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if (value == -131){
                newKeyboard = new Keyboard(this, R.xml.main_keyboard_up);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -21){
                newKeyboard = new Keyboard(this, R.xml.keyboard1);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -22) {
                newKeyboard = new Keyboard(this, R.xml.keyboard2);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -23){
                newKeyboard = new Keyboard(this, R.xml.keyboard3);
                keyboardView.setKeyboard(newKeyboard);

            }
            else if(value == -24){
                newKeyboard = new Keyboard(this, R.xml.keyboard4);
                keyboardView.setKeyboard(newKeyboard);

            }
            else if(value == -25){
                newKeyboard = new Keyboard(this, R.xml.keyboard5);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -26){
                newKeyboard = new Keyboard(this, R.xml.keyboard6);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -27){
                newKeyboard = new Keyboard(this, R.xml.keyboard7);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -28){
                newKeyboard = new Keyboard(this, R.xml.keyboard8);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -29){
                newKeyboard = new Keyboard(this, R.xml.keyboard9);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if(value == -30){
                newKeyboard = new Keyboard(this, R.xml.main_keyboard_up);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if (value == -31) {
                newKeyboard = new Keyboard(this, R.xml.keyboard_symbol_1);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if (value == -32) {
                inputConnection.sendKeyEvent(keyEventBackspace);
            }
            else if (value == -33) {
                inputConnection.sendKeyEvent(keyEventSpace);
            }
            else if (value == -34) {
                inputConnection.sendKeyEvent(keyEventEnter);
            }
            else if (value == -35){
                newKeyboard = new Keyboard(this, R.xml.keyboard0);
                keyboardView.setKeyboard(newKeyboard);
            }
            else if (value == -40) {
                keyboardView.setX(0);
            }
            else if (value == -41) {
                keyboardView.setX(keyboardX);
            }
            else if (value == -42) {
                keyboardView.setX(0);
            }
            else if (value == -43) {
                keyboardView.setX(keyboardX);
            }
            else if(value == -132){
                newKeyboard = new Keyboard(this, R.xml.main_keyboard);
                keyboardView.setKeyboard(newKeyboard);
            } else if (value == -133) {
                newKeyboard = new Keyboard(this, R.xml.keyboard_symbol_2);
                keyboardView.setKeyboard(newKeyboard);
            } else if (value == -134) {
                newKeyboard = new Keyboard(this, R.xml.keyboard_symbol_1);
                keyboardView.setKeyboard(newKeyboard);

            } else {
                char pressedChar = (char) value;
                inputConnection.commitText(String.valueOf(pressedChar), 1);
                if (value >= 60 && value <= 90){
                    newKeyboard = new Keyboard(this, R.xml.main_keyboard_up);
                    keyboardView.setKeyboard(newKeyboard);
                }
                else {
                    newKeyboard = new Keyboard(this, R.xml.main_keyboard);
                    keyboardView.setKeyboard(newKeyboard);
                }
            }
        }
    }

    @Override
    public void onText(CharSequence charSequence) {
    }

    @Override
    public void swipeLeft() {
    }

    @Override
    public void swipeRight() {
    }

    @Override
    public void swipeDown() {
    }

    @Override
    public void swipeUp() {
    }
}
