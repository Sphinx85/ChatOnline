package client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ApplicationStart extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationStart.class.getResource("mainFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),320,240);
        stage.setTitle("Sphinx Chat");
        stage.setScene(scene);
        stage.show();

    }
}
