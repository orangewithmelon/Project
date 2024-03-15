public class Piece extends Player{
    private int row;
    private int col;

    public Piece(int r, int c, String name) {
        super(name);
        row = r;
        col = c;
    }

    public void setRow(int num) {
        row = num;
    }

    public void setCol(int num) {
        col = num;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
}
