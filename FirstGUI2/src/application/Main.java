package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
//			Image img = new Image("file:calc.png");
//			primaryStage.getIcons().add(img);
			
			Image icon = new Image (getClass().getResourceAsStream("calc.png"));
			primaryStage.getIcons().add(icon);
			primaryStage.setTitle("Calculator 1.2 ");
			
	        Scene scene = new Scene(root,450,600);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
	}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
