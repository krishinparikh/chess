package pieces;

import constants.*;

public class Queen extends Piece {
    public Queen(Color color) {
        super(color, PieceType.BISHOP, "../../assets/" + (color == Color.WHITE ? "white-queen.png" : "black-queen.png"), 9, true);
    }
}
