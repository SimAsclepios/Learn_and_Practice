package application;

package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Code.Fichier;
import Code.Stagiaire;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ControllerAdmin {

	static List<Stagiaire> triListe = new ArrayList<>();
	
	
	@FXML
	private TextField tfNom;
	
	@FXML
	private TextField tfPrenom;

	@FXML
	private TextField tfAdresse;

	@FXML
	private TextField tfMail;

	@FXML
	private TextField tfTheme;

	@FXML
	private TextField tfDebut;

	@FXML
	private TextField tfDuree;

	@FXML
	private static TextField tfRecherche;

	@FXML
	private TableView<Stagiaire> tvStagiaire;

	@FXML
	private TableColumn<Stagiaire, String> colNom;

	@FXML
	private TableColumn<Stagiaire, String> colPrenom;

	@FXML
	private TableColumn<Stagiaire, String> colAdresse;

	@FXML
	private TableColumn<Stagiaire, String> colMail;

	@FXML
	private TableColumn<Stagiaire, String> colTheme;

	@FXML
	private TableColumn<Stagiaire, String> colDebut;

	@FXML
	private TableColumn<Stagiaire, String> colDuree;

	@FXML
	private Button btnAjouter;

	@FXML
	private Button btnModifier;

	@FXML
	private Button btnSuprimer;

	@FXML
	private Button btnRechercher;

	@FXML
	private Button btnImprimer;
	
	@FXML
	private Button btnDeconnecter;
	

	@FXML
	private void handleButtonAction(ActionEvent event) throws ClassNotFoundException, IOException {
		System.out.println("test");

//		if (event.getSource() == btnAjouter) {
//
//			chercherStagiaire();
//			items.clear();
//			items.addAll(triListe);
//		}

		if (event.getSource() == btnSuprimer) {

			DeleteEnregistrement();
		}

		else {
			UpdateEnregistrement();
		}
	}

	private void AjouterEnregistrement() {

	}

	private void UpdateEnregistrement() {

	}

	private void DeleteEnregistrement() {

	}

	@FXML
	public void initialize() throws Throwable, Exception {

		
		
		
		items.addAll(Fichier.deserialisation());

		tvStagiaire.setItems(items);
		colNom.setCellValueFactory(new PropertyValueFactory<Stagiaire, String>("nom"));
		colPrenom.setCellValueFactory(new PropertyValueFactory<Stagiaire, String>("prenom"));
		
		
		btnAjouter.setOnAction(event -> { 
			String rech = "";
			System.out.println(rech);
			rech = tfRecherche.getText();
			System.out.println(rech);
			} );
		
//			items.clear();
//			items.addAll(triListe);
//			tvStagiaire.getItems().clear();
//			tvStagiaire.getItems().addAll(triListe);
//			tvStagiaire.setItems(items);
//			colNom.setCellValueFactory(new PropertyValueFactory<Stagiaire, String>("nom"));
//			colPrenom.setCellValueFactory(new PropertyValueFactory<Stagiaire, String>("prenom"));
//		} );
			
		
		btnDeconnecter.setOnAction(event -> {
			btnDeconnecter.getScene().getWindow().hide();
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/ApiConnexion.fxml"));
			try {
				loader.load();
			} catch (IOException e) {
				// TODO Bloc catch généré automatiquement
				e.printStackTrace();
			}
			
			Parent root = loader.getRoot();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.showAndWait();
		});
	}
	
private static void chercherStagiaire() throws ClassNotFoundException, IOException  {
		
	String rech = "";
	System.out.println(rech);
	rech = tfRecherche.getText();
	System.out.println(rech);

	Boolean result = false;
	triListe.clear();
				
				for(int i=0; i<(Fichier.deserialisation().size()); i++) {
					
					Stagiaire stag = Fichier.deserialisation().get(i);
					result = stag.recherche(rech);
				
					if (result == true) { triListe.add(stag); }					}
				
				System.out.println(triListe);
				
		}

}
