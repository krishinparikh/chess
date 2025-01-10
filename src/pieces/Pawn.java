package pieces;

import constants.*;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color, PieceType.PAWN, "../../assets/" + (color == Color.WHITE ? "white-pawn.png" : "black-pawn.png"), 1, false);
    }
}
