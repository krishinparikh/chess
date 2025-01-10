package pieces;

import constants.*;

public class King extends Piece {
    public King(Color color) {
        super(color, PieceType.KING, "../../assets/" + (color == Color.WHITE ? "white-king.png" : "black-king.png"), 0, false);
    }
}
