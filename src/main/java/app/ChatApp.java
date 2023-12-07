package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = new FXMLLoader(getClass().getResource("/chat.fxml")).load();

        stage.setScene(new Scene(root));

        stage.setTitle("Chat App");
        stage.show();
    }
}
