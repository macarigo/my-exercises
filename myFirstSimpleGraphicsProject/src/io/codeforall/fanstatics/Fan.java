package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fan implements KeyboardHandler {

    private Keyboard keyboard;
    private Picture picture;

    public Fan() {
        picture = new Picture(20, 20, "rsc/fan.jpg");
        picture.draw();

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
        grow.setKey(KeyboardEvent.KEY_SPACE);
        grow.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(grow);

        KeyboardEvent message = new KeyboardEvent();
        message.setKey(KeyboardEvent.KEY_M);
        message.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(message);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                picture.translate(100, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                picture.translate(-100, 0);
                break;
            case KeyboardEvent.KEY_UP:
                picture.translate(0, -100);
                break;
            case KeyboardEvent.KEY_DOWN:
                picture.translate(0, 100);
                break;
            case KeyboardEvent.KEY_SPACE:
                picture.grow(50, 50);
                break;
        }

    }


@Override
public void keyReleased(KeyboardEvent keyboardEvent){

        }
        }
