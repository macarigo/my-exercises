import grid.Grid;
import simplegfx.SimpleGrid;
import simplegfx.SimpleGridPosition;

public class Game {
    private Grid grid;
    private Player player;

    Game(int cols, int rows) {
        this.grid = SimpleGrid.makeGrid(cols, rows);
    }

    public void init() {
        grid.init();
        new Player((SimpleGrid) grid);
    }
}
