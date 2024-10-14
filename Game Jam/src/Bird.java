import java.awt.*;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Bird {
    public Rectangle bird;

    public Bird(Rectangle bird) {
        this.bird = bird;
        bird.draw();
    }
}
