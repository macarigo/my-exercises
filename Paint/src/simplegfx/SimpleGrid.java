package simplegfx;

import grid.Grid;
import grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGrid implements Grid {
    private int cols;
    private int rows;
    public static final int CELL_SIZE = 15;
    public static final int PADDING = 15;
    private Rectangle rectangle;
    private SimpleGrid grid;
    private SimpleGridPosition[][] cells;

    public SimpleGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.cells = new SimpleGridPosition[this.cols][this.rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                this.rectangle = new Rectangle(columnToX(i), rowToY(j), CELL_SIZE, CELL_SIZE);
                this.rectangle.draw();
                //this.cells[i][j];
            }
        }
    }

    @Override
    public void init() {
        this.rectangle = new Rectangle(PADDING, PADDING, cols * CELL_SIZE, rows * CELL_SIZE);
        this.rectangle.draw();
    }

    public static Grid makeGrid(int cols, int rows) {
        return new SimpleGrid(cols, rows);
    }

    public SimpleGridPosition[][] getCells() {
        return cells;
    }
    /*public void fillCell () {
        this.cells[getCols()][getRows()].rectangle.fill();
    }*/

    @Override
    public int getCols() {
        return this.cols;
    }

    @Override
    public int getRows() {
        return this.rows;
    }

    public int getWidth() {
        return this.rectangle.getWidth();
    }

    public int getHeight() {
        return this.rectangle.getHeight();
    }

    public int getX() {
        return PADDING;
    }

    public int getY() {
        return PADDING;
    }


    @Override
    public GridPosition makeGridPosition() {
        return new SimpleGridPosition(this);
    }

    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return new SimpleGridPosition(col, row, this);
    }

    public int columnToX(int column) {
        return column * CELL_SIZE + PADDING;
    }

    public int rowToY(int row) {
        return row * CELL_SIZE + PADDING;
    }
}