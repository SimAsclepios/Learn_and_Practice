package calculatrice;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class TestJavaFX extends Application {
	@Override
	public void start(Stage primaryStage) throws InterruptedException {
	
		System.out.println("Start call method");
		
		primaryStage.setTitle("Helo Java");
		primaryStage.setWidth(600);
		primaryStage.setHeight(500);
		primaryStage.show();
		primaryStage.centerOnScreen();
		
		Stage OS = new Stage();
		OS.setTitle("I love Java");
		OS.setWidth(200);
		OS.setHeight(300);
		OS.show();
		OS.centerOnScreen();
		Thread.sleep(5000);
		OS.close();
		
		/*try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}*/
	}
	
	public void init() throws Exception {
		System.out.println("Init call method");
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
