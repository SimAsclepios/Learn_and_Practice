package calculatrice;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorFX extends Application {

	Button btnDiv;
	Button btnMulti;
	Button btnAdd;
	Button btnSub;
	Button clear;
	TextField num1;
	TextField num2;
	Label res;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		num1 = new TextField();
		num2 = new TextField();
		btnDiv = new Button("/");
		btnAdd = new Button("+");
		btnSub = new Button("-");
		btnMulti = new Button("x");
		clear = new Button("Clear");
		res = new Label("?");
		
		GridPane root = new GridPane();
		//Position des boutons les uns par rapport aux autres
		root.add(btnDiv, 0, 0);
		root.add(btnMulti, 1, 0);
		root.add(btnAdd, 0, 1);
		root.add(btnSub, 1, 1);
		root.add(num1, 0, 2);
		root.add(num2, 1, 2);
		root.add(res, 0,3, 2, 1);
		root.add(clear,  0, 4, 2, 1);
		
		//Espace entre chaque Bouton et autres
		root.setAlignment(Pos.CENTER);
		root.setHgap(10);
		root.setVgap(10);
		
		/*
		double no1 = Double.parseDouble(num1.getText());
		double no2 = Double.parseDouble(num2.getText());
		*/
		
		btnDiv.setOnAction(e->{
			double calcul = Double.parseDouble(num1.getText()) / Double.parseDouble(num2.getText());
			res.setText(Double.toString(calcul));
		});

		btnMulti.setOnAction(e->{
			double calcul = Double.parseDouble(num1.getText()) * Double.parseDouble(num2.getText());
			res.setText(String.valueOf(calcul));
		});
		
btnAdd.setOnAction(e->{
	res.setText(Double.toString(Double.parseDouble(num1.getText()) + Double.parseDouble(num2.getText())));
});
		
		btnSub.setOnAction(e->{
			double calcul = Double.parseDouble(num1.getText()) - Double.parseDouble(num2.getText());
			res.setText(String.valueOf(calcul));
		});

		clear.setOnAction(e->{
			res.setText("");
			num1.setText("");
			num2.setText("");
		});
		
		
		/*
		btnSub.setOnAction(e->{res.setText("" + (no1-no2) + ""); });
		btnAdd.setOnAction(e->{res.setText("" + (no1+no2) + ""); });
		btnDiv.setOnAction(e->{res.setText("" + (no1/no2) + ""); });
		btnMulti.setOnAction(e->{res.setText("" + (no1*no2) + ""); });
		*/

		
		this.setLargeur();
		
		primaryStage.setTitle("Calculatrice");
		Scene sc = new Scene(root, 300, 250);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	private void setLargeur()
	{
		num1.setPrefWidth(70);
		num2.setPrefWidth(70);
		btnDiv.setPrefWidth(70);
		btnMulti.setPrefWidth(70);
		btnSub.setPrefWidth(70);
		btnAdd.setPrefWidth(70);
		clear.setPrefWidth(150);
		res.setPrefWidth(150);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
}
