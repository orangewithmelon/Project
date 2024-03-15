import java.util.Scanner;
public class Checkers {
    Space[][] board;
    Scanner scanner;
    Player player1;
    Player player2;

    public Checkers() {
        scanner = new Scanner(System.in);
        board = new Space[8][8];
        play();
    }

    public void setUpBoard() {
        int num = 9;
        for (int i = 0; i < 8; i++) {
            num--;
            System.out.print(num + " ");
            for (int e = 0; e < 8; e++) {
                board[i][e] = new Space("_");
                System.out.print(board[i][e].getSymbol() + " ");
            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H");
    }

    public void placePieces() {
        for (int i = 0; i < 8; i+=2) {
            board[0][i] = new Piece(0,i, player2.getName());
        }
        for (int i = 1; i < 8; i+=2) {
            board[1][i] = new Piece(1,i, player2.getName());
        }
        for (int i = 0; i < 8; i+=2) {
            board[2][i] = new Piece(2,i, player2.getName());
        }

    }

    public void play() {
        System.out.print("Player 1, what is your name? ");
        player1 = new Player(scanner.nextLine().toLowerCase());
        System.out.print("Player 2, what is your name? ");
        player2 = new Player(scanner.next().toLowerCase());
        setUpBoard();
        System.out.println("Generating board...");
        placePieces();

    }
}
