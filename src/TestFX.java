import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestFX extends Application{
    @Override
    public void start(Stage stage){
        Label label = new Label("Password Field");
        PasswordField password=new PasswordField();
        Button button=new Button("password ");
        button.setOnAction(e ->{
            String pwd=password.getText();
            System.out.println("Password entered ");
        });
        VBox root=new VBox(10);
        root.getChildren().addAll(label,password,button);

        Scene scene=new Scene(root,400,300);
        stage.setTitle("Password Example");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
        
    }
}
//javac --module-path "C:\Users\pooja\Downloads\javafx-27_windows-x64_bin-sdk\javafx-sdk-27\lib" --add-modules javafx.controls TestFX.java
