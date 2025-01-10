import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * The main entry point into this API
 */
public class ChessApp extends Application {
    private static final int TILE_SIZE = 80;
    private static final int BOARD_SIZE = 8;

    @Override
    public void start(Stage primaryStage) {
        GridPane board = new GridPane();

        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                Rectangle square = new Rectangle(TILE_SIZE, TILE_SIZE);
                square.setFill((row + col) % 2 == 0 ? Color.BEIGE : Color.DARKGREEN);
                board.add(square, col, row);
            }
        }

        Scene scene = new Scene(board, TILE_SIZE * BOARD_SIZE, TILE_SIZE * BOARD_SIZE);
        primaryStage.setTitle("Chess Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        // "Enter White player's name: "
        // "Enter time control (in minutes) for ____: "
        // "Enter Black player's name: "
        // "Enter time control (in minutes) for ____: "
        // "Enter increment (in seconds): "

        launch(args);
    }
}
