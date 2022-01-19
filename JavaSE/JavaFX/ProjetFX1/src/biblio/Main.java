package biblio;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start (Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
				Scene scene = new Scene(root, 800, 600);
				
				primaryStage.setScene(scene);
				
				primaryStage.setTitle("Gestion des livres");
				
				primaryStage.show();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
launch(args);
	}

}
