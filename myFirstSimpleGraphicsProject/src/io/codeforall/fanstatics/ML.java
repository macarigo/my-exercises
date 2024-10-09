package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class ML implements KeyboardHandler {

    private Keyboard keyboard;
    private Picture bishi;

    public ML () {
        bishi = new Picture(0, 20, "rsc/lancer.png");
        bishi.draw();
        initKeyboard();
    }

    private void initKeyboard() {
        this.keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveLeft);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(moveDown);

        KeyboardEvent grow = new KeyboardEvent();
        grow.setKey(KeyboardEvent.KEY_Q);
        grow.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(grow);

        KeyboardEvent shrink = new KeyboardEvent();
        shrink.setKey(KeyboardEvent.KEY_W);
        shrink.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(shrink);

    }




    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                bishi.translate(100, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                bishi.translate(-100, 0);
                break;
            case KeyboardEvent.KEY_UP:
                bishi.translate(0, -100);
                break;
            case KeyboardEvent.KEY_DOWN:
                bishi.translate(0, 100);
                break;
            case KeyboardEvent.KEY_Q:
                bishi.grow(50, 50);
                break;
            case KeyboardEvent.KEY_W:
                bishi.grow(-50, -50);
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
