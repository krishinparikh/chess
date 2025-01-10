package pieces;

import constants.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
    
    public Piece(Color color, PieceType type, String imagePath, int pointValue, boolean isPromotionPiece) {
        this.color = color;
        this.type = type;
        this.image = loadImage(imagePath);
        this.pointValue = pointValue;
        this.isPromotionPiece = isPromotionPiece;
    }

    private BufferedImage loadImage(String imagePath) {
        try {
            return ImageIO.read(new File(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error loading image: " + imagePath);
            return null;
        }
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
