package calculatrice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatriceFX2 extends Application {

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
		

		
		this.setLargeur();
		this.attachemethode();
		
		primaryStage.setTitle("Calculatrice");
		Scene sc = new Scene(root, 300, 250);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public void attachemethode()
	{
		btnAdd.setOnAction(e->btncode(e));
		btnSub.setOnAction(e->btncode(e));
		btnDiv.setOnAction(e->btncode(e));
		btnMulti.setOnAction(e->btncode(e));
		clear.setOnAction(e->btncode(e));
	}
	
	public void btncode(ActionEvent e)
	{
		int nbre1, nbre2, reponse = 0;
		char symbole = 0;
		
		if (e.getSource()==clear) {
			res.setText(":");			//On efface le calcul de resultat et les chiffre dans les cases num1 et 2
			num1.setText("");
			num2.setText("");
			num1.requestFocus();	//On met le curseur sur la case num1 pour être prêt à écrire directement le prochain chiffre
		}
		
		try {
			
		
		nbre1 = Integer.parseInt(num1.getText());
		nbre2 = Integer.parseInt(num2.getText());
		
		if (e.getSource()==btnAdd) {
			symbole = '+';
			reponse=nbre1+nbre2;
		}
		else if (e.getSource()==btnSub) {
			symbole = '-';
			reponse=nbre1-nbre2;
		}
		else if (e.getSource()==btnDiv) {
			symbole = '/';
			reponse=nbre1/nbre2;
		}
		else if (e.getSource()==btnMulti) {
			symbole = 'x';
			reponse=nbre1*nbre2;
		}
		
		res.setText("" + nbre1 + symbole + nbre2 + "=" + reponse);
			
		}
		
		catch(NumberFormatException  | ArithmeticException x)	// attraper erreur si ce n'est pas un nombre arithmetic
		{
			if (num2.getText().equals("0"))			//Si 0 au dénominateur, affiche erreur
			{
				Alert errorAlert = new Alert(AlertType.ERROR);
				errorAlert.setHeaderText("Valeur Invalide");
				errorAlert.setContentText("Division par 0 impossible");
				errorAlert.showAndWait();
			}
			if (e.getSource()!=clear)		//Ne pas afficher l'erreur lorsque l'on appuie sur clear
			{
				Alert errorAlert = new Alert(AlertType.ERROR);
				errorAlert.setHeaderText("Valeur Invalide");
				errorAlert.setContentText("Veuillez saisir une valeur numérique");
				errorAlert.showAndWait();
			}
			
		}
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
