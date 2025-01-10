
/**
 * A chess game is a combination of a board, players, and clock.
 * It handles most of the chess logic.
 */
public class ChessGame {

    private Board board;
    private White white;
    private Black black;
    private Clock clock;


    public ChessGame(Board board, White white, Black black, Clock clock) {
        this.board = board;
        this.white = white;
        this.black = black;
        this.clock = clock;
        white.setTurn(true);
        black.setTurn(false);
    }

    public Board getBoard() {
        return board;
    }

    public White getWhite() {
        return white;
    }

    public Black getBlack() {
        return black;
    }

    public Clock getClock() {
        return clock;
    }
    
    public void findLegalMoves(boolean isWhiteTurn) {
        // foreach white piece
            // case pawn
            // foreach possible move
                // check if pseudolegal
                // check if in check
                // append square to Piece
    }

    public void move(int[] pieceIndex, int[] targetSquare) {
        // check if there's a white piece on the pieceIndex
        // board.getboardPieces()[pieceIndex]
        // if Piece.getLegalSquares.contains(targetSquare)
            // change the ArrayList of the board to reflect the new move
            // findLegalMoves(opponent)
    }


    public void inCheck(boolean isWhiteTurn) {

    }

    
    
}
