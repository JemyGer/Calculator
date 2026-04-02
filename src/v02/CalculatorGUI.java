/*packages*/
package v02;

/*imports*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

  public class CalculatorGUI extends Application{

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("c.dincer.javadeveloper");
        Scene scene = new Scene(label, 500, 500);
        primaryStage.setTitle("Calculator_V02");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
