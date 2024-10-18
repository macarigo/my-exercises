package simplegfx;

import grid.position.AbstractGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import grid.position.GridPosition;

import javax.swing.*;

public class SimpleGridPosition extends AbstractGridPosition {
    private Rectangle rectangle;
    private SimpleGrid simpleGrid;
    //private GridColor gridColor;

    public SimpleGridPosition(SimpleGrid grid) {
        super(grid.getCols(), grid.getRows(), grid);
        this.rectangle = new Rectangle(grid.columnToX(this.getCol()), grid.rowToY(this.getRow()), SimpleGrid.CELL_SIZE, SimpleGrid.CELL_SIZE);
    }

    public SimpleGridPosition(int col, int row, SimpleGrid grid) {
        super(col, row, grid);
        this.rectangle = new Rectangle(grid.columnToX(col),
                grid.rowToY(row),
                SimpleGrid.CELL_SIZE,
                SimpleGrid.CELL_SIZE);
        this.rectangle.fill();
        this.simpleGrid = grid;
    }

    @Override
    public void show() {
        this.rectangle.fill();
    }

    @Override
    public void hide() {
        this.rectangle.delete();
    }
}
