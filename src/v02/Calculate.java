package v02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Calculate extends Application {
    private Parent createContent() {
        return new StackPane(new Text("Hello JavaFX!"));
    }
    @Override
    public void start(Stage stage) throws Exception{
       Scene scene = new Scene(createContent(), 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
