package pieces;
import java.awt.image.BufferedImage;

/**
 * A chess piece
 */
public abstract class Piece {

    protected int color;
    protected int piece;
    protected BufferedImage image;
    protected int pointValue;
    protected boolean isPromotionPiece;
    
    public Piece() {
        
    }

    public int getColor() {
        return color;
    }

    public int getPiece() {
        return piece;
    }

    public abstract void getLegalSquares();
    

}
