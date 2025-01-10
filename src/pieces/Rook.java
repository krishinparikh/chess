package pieces;

import constants.*;

public class Rook extends Piece {
    public Rook(Color color) {
        super(color, PieceType.ROOK, "../../assets/" + (color == Color.WHITE ? "white-rook.png" : "black-rook.png"), 5, true);
    }
}
