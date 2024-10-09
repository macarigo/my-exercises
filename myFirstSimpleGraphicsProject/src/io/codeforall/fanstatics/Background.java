package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.pictures.Picture;
public class Background {
    private Picture road;

    public Background () {
        road = new Picture(10, 0, "rsc/background.jpeg");
        road.draw();

    }
}
