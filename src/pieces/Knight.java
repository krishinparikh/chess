package pieces;

import constants.*;

public class Knight extends Piece {
    public Knight(Color color) {
        super(color, PieceType.KNIGHT, "../../assets/" + (color == Color.WHITE ? "white-knight.png" : "black-knight.png"), 3, true);
    }
}
