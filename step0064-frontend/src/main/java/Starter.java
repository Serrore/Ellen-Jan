import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Starter class for this project running javaFX
 * Initializing model, controller and creating necessary elements for javaFX
 */
public class Starter extends Application {
    Model m;
    Controller c;

    /**
     * Start methode to create the view as a javaFX stage using a FXML
     * Creating instances of model and FXMLLoader to get controller and connect them
     * @param primaryStage Window containing the project scene
     * @throws Exception not handled
     */
    public void start(Stage primaryStage) throws Exception {
        m = new Model();
        Parent ViewFXML = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        Scene scene = new Scene(ViewFXML);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.setTitle("Calculator");
        primaryStage.show();
        FXMLLoader loader= new FXMLLoader(getClass().getResource("Scene.fxml"));
        ViewFXML = loader.load();
        c = loader.getController();
        c.setM(m);
    }

    /**
     * main method running the project
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
