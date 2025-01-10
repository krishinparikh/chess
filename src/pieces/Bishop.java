package pieces;

import constants.*;

public class Bishop extends Piece {
    public Bishop(Color color) {
        super(color, PieceType.BISHOP, "../../assets/" + (color == Color.WHITE ? "white-bishop.png" : "black-bishop.png"), 3, true);
    }
}
