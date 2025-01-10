# Chess
Building chess for fun

## Organization
* `assets\` - chess piece pngs
* `src\` - source code
    * `constants\` - enums
    * `pieces\` - derivations of the Piece class
    * `Board.java` - stores the board state
    * `ChessGame.java` - manages chess logic
    * `ChessApp.java` - main entry point into this API
    * `Player.java` - stores information for a player

## How it Works
Each chess piece is abstracted from the Piece class. A chess board is represented by a 2D ArrayList of Piece objects. The piece movement logic is handled by the ChessGame. On a high level, finding the Player's legal moves for the current turn works like this:
```
foreach Piece in Player's pieces:
    case pawn (for example):
        foreach possible move:
            if move is pseudolegal & Player's king is not in check afterwards:
                append move to Piece legal move set 
```

## Terminology
- **Legal Moves**: Legal moves in standard chess 
- **Pseudolegal Moves**: Legal moves for a piece excluding moves that fail to address being in check
- **Vision Squares**: Squares that a piece can "see" but may or may not legally be able to move to
