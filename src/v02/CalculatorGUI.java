/*packages*/
package v02;

/*imports*/
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

  public class CalculatorGUI extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/entry.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("calculator_V02");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
