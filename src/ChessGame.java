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
        whitePlayer.setTurn(true);
        blackPlayer.setTurn(false);
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
