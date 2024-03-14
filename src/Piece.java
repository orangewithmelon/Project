public class Piece extends Space{
    private int row;
    private int col;

    public Piece(int r, int c) {
        row = r;
        col = c;
    }

    public void setRow(int num) {
        row = num;
    }

    public void setCol(int num) {
        col = num;
    }
}
