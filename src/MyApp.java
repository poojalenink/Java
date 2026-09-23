import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyApp extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("Click Me");

        button.setOnAction(e -> {
            System.out.println("Button clicked");
        });

        VBox root = new VBox(button);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Event Handling");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}