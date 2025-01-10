package pieces;

import constants.*;
import java.util.*;
import java.awt.image.BufferedImage;

/**
 * A chess piece
 */
public abstract class Piece {

    protected Color color;
    protected PieceType type;
    protected BufferedImage image;
    protected int pointValue;
    protected boolean isPromotionPiece;
    protected HashSet<int[]> legalSquares;
    
    public Piece(Color color, PieceType type, BufferedImage image, int pointValue, boolean isPromotionPiece) {
        this.color = color;
        this.type = type;
        this.image = image;
        this.pointValue = pointValue;
        this.isPromotionPiece = isPromotionPiece;
    }

    public Color getColor() {
        return color;
    }

    public PieceType getType() {
        return type;
    }

    public HashSet<int[]> getLegalSquares() {
        return legalSquares;
    }
    

}
