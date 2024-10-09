package io.codeforall.fanstatics;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {
        //Rectangle rectangle = new Rectangle(0, 0, 1000, 1000);
        //rectangle.setColor(Color.CYAN);
        //rectangle.fill();

        //Fan fan = new Fan();


        Background background = new Background();
        ML bishi = new ML();
        Text gg = new Text(600, 200, "GG n00bs");
        gg.setColor(Color.WHITE);
        gg.draw();
        gg.grow(200,40);

    }
}
