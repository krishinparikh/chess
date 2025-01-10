import pieces.*;
import java.util.*;

public class Player {

    private String name;
    private boolean isTurn;
    private boolean inCheck;
    private boolean isCastled;
    private boolean canCastle;
    private HashSet<Piece> capturedPieces;
    

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isTurn() {
        return isTurn;
    }

    public void setTurn(boolean isTurn) {
        this.isTurn = isTurn;
    }

    public boolean isInCheck() {
        return inCheck;
    }

    public void setInCheck(boolean inCheck) {
        this.inCheck = inCheck;
    }

    public boolean isCastled() {
        return isCastled;
    }

    public void setIsCastled(boolean isCastled) {
        this.isCastled = isCastled;
    }

    public boolean canCastle() {
        return canCastle;
    }

    public void setCanCastle(boolean canCastle) {
        this.canCastle = canCastle;
    }

    public HashSet<Piece> getCapturedPieces() {
        return capturedPieces;
    }

    public void appendToCapturedPieces(Piece piece) {
        capturedPieces.add(piece);
    }
    

}
