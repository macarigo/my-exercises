import grid.Grid;
import grid.position.GridPosition;
import io.codeforall.bootcamp.grid.GridColor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import simplegfx.SimpleGrid;
import simplegfx.SimpleGridPosition;


public class Player implements KeyboardHandler {
    private Rectangle player;
    private Keyboard keyboard;
    private SimpleGrid pos;


    public Player(SimpleGrid pos) {
        this.player = new Rectangle(SimpleGrid.PADDING, SimpleGrid.PADDING, SimpleGrid.CELL_SIZE, SimpleGrid.CELL_SIZE);
        this.player.fill();
        this.player.setColor(Color.GREEN);
        this.pos = pos;
        initKeyboard();
    }
    public SimpleGrid getPos(){
        return pos;
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

        KeyboardEvent paint = new KeyboardEvent();
        paint.setKey(KeyboardEvent.KEY_SPACE);
        paint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(paint);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                if(player.getX() < pos.getWidth())
                player.translate(SimpleGrid.CELL_SIZE, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                if(player.getX() > pos.columnToX(0))
                player.translate(-SimpleGrid.CELL_SIZE, 0);
                break;
            case KeyboardEvent.KEY_UP:
                if (player.getY() > pos.rowToY(0))
                player.translate(0, -SimpleGrid.CELL_SIZE);
                break;
            case KeyboardEvent.KEY_DOWN:
                if (player.getY() < pos.getHeight())
                player.translate(0, SimpleGrid.CELL_SIZE);
                break;
            case KeyboardEvent.KEY_SPACE:

                break;

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}