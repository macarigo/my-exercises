package io.codeforall.bootcamp.field;

public class Position {
    private int col;
    private int row;
    public int pos;

    public Position(int col,int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() { return col; }

    public int getRow() { return row; }
}
