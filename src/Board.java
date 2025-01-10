import java.util.*;
import constants.*;
import pieces.*;

public class Board {

    // A chess board is represented as an 8x8 2D ordered ArrayList of Pieces
    private ArrayList<ArrayList<Piece>> boardPieces;

    public Board() {
        this.boardPieces = Board.createStandardFormat();
    }

    public ArrayList<ArrayList<Piece>> getBoardPieces() {
        return boardPieces;
    }

    private static ArrayList<ArrayList<Piece>> createStandardFormat() {
        ArrayList<ArrayList<Piece>> board = new ArrayList<ArrayList<Piece>>();
        
        // Step 2: Add 8 rows
        for (int i = 0; i < 8; i++) {
            board.add(new ArrayList<>());  // Add a row
        }

        board.get(0).add(0, new Rook(Color.BLACK));
        board.get(0).add(1, new Knight(Color.BLACK));
        board.get(0).add(2, new Bishop(Color.BLACK));
        board.get(0).add(3, new Queen(Color.BLACK));
        board.get(0).add(4, new King(Color.BLACK));
        board.get(0).add(5, new Bishop(Color.BLACK));
        board.get(0).add(6, new Knight(Color.BLACK));
        board.get(0).add(7, new Rook(Color.BLACK));
        
        board.get(1).add(0, new Pawn(Color.BLACK));
        board.get(1).add(1, new Pawn(Color.BLACK));
        board.get(1).add(2, new Pawn(Color.BLACK));
        board.get(1).add(3, new Pawn(Color.BLACK));
        board.get(1).add(4, new Pawn(Color.BLACK));
        board.get(1).add(5, new Pawn(Color.BLACK));
        board.get(1).add(6, new Pawn(Color.BLACK));
        board.get(1).add(7, new Pawn(Color.BLACK));
        
        board.get(6).add(0, new Pawn(Color.WHITE));
        board.get(6).add(1, new Pawn(Color.WHITE));
        board.get(6).add(2, new Pawn(Color.WHITE));
        board.get(6).add(3, new Pawn(Color.WHITE));
        board.get(6).add(4, new Pawn(Color.WHITE));
        board.get(6).add(5, new Pawn(Color.WHITE));
        board.get(6).add(6, new Pawn(Color.WHITE));
        board.get(6).add(7, new Pawn(Color.WHITE));
        
        board.get(7).add(0, new Rook(Color.WHITE));
        board.get(7).add(1, new Knight(Color.WHITE));
        board.get(7).add(2, new Bishop(Color.WHITE));
        board.get(7).add(3, new Queen(Color.WHITE));
        board.get(7).add(4, new King(Color.WHITE));
        board.get(7).add(5, new Bishop(Color.WHITE));
        board.get(7).add(6, new Knight(Color.WHITE));
        board.get(7).add(7, new Rook(Color.WHITE));

        return board;
    }


}
