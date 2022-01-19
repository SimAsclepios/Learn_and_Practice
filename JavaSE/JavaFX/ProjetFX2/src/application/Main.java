package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) { 
		
		primaryStage.setTitle("Fruits");
		BorderPane PB = new BorderPane();
		Scene SC = new Scene(PB,400,400);
		primaryStage.setScene(SC);
		
		HBox HB = new HBox();
		HB.setPadding(new Insets(10));
		
		Label L1 = new Label("Fruits");
		L1.setPadding(new Insets(5));
		
		TextField TF = new TextField();
		
		Button B1 = new Button("Ajouter");
		
		HB.getChildren().addAll(L1,TF,B1);
		
		VBox VB = new VBox();
		
		ListView<String> LV = new ListView<>();
		LV.getItems().addAll("oranges", "pommes");
	
		VB.getChildren().addAll(LV);
		

			
		PB.setTop(HB);
		PB.setCenter(VB);
		
		
			Alert error = new Alert(AlertType.ERROR);
			error.setHeaderText("champ est vide");
			error.setContentText("Veuillez saisir un fruit");
			error.showAndWait();

		
		B1.setOnAction(e->{
			String nom=TF.getText();
			LV.getItems().add(nom);
		});
		
		/*
		B1.setOnAction(e->{
			if (TF.getText().equals("")) {
				this.error();
			}
			else {
			String nom=TF.getText();
			LV.getItems().add(nom); 
			}
		});
		*/
		
		primaryStage.show();
		
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}
