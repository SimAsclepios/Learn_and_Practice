package biblio;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ResourceBundle;


//import com.mysql.cj.protocol.Resultset;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable {

	
	@FXML
	private TextField tfId;
	
	@FXML
	private TextField tfTitre;
	
	@FXML
	private TextField tfAutheur;
	
	@FXML 
	private TextField tfAnnee;
	
	@FXML
	private TextField tfPages;
	
	@FXML
	private Button btAjout;
	
	@FXML
	private Button btModif;
	
	@FXML
	private Button btSup;
	
	@FXML
	private Button btAct;
	
	@FXML
	private TableView<Livre> tbLivres;
	
	@FXML
	private TableColumn<Livre, Integer> colId;
	
	@FXML
	private TableColumn<Livre, String> colTitre;
	
	@FXML
	private TableColumn<Livre, String> colAutheur;
	
	@FXML
	private TableColumn<Livre, Integer> colAnnee;
	
	@FXML
	private TableColumn<Livre, Integer> colPages;
	
	
	public Connection getConnection(){
        Connection conn;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Biblio?serverTimezone=UTC", "root","");
            return conn;
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
            return null;
        }
    }

		
	
	
	public void initialize (URL location, ResourceBundle resources) {
		
		Connection test = this.getConnection();
		
		
		
		if (test!=null)
		{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information");
			alert.setHeaderText("Connexion à la base");
			alert.setContentText("Connexion Reussi");
	      
			alert.showAndWait();
			try {
				Thread.sleep(2000);
				alert.close();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else 
		{
		Alert errorAlert = new Alert(AlertType.ERROR);
		errorAlert.setHeaderText("Connexion à la base");
		errorAlert.setContentText("Echec de connexion");
		errorAlert.showAndWait();
		Platform.exit();
			

		
	}
	}
	
	@FXML
	private void handleButtonAction(ActionEvent event) {
//Cette méthode enclenche une autre méthode à chaque clic sur le bouton ajouter de l'interface graphique
		
		if ((Button)event.getSource()==btAjout) {
			ajouterEnregistrement();
			return;
		}
		
		if ((Button)event.getSource()==btModif) {
			modifierEnregistrement();
			return;
		}
		
		if ((Button)event.getSource()==btSup) {
			supprimerEnregistrement();
			return;
		}
		
	}
	
	private void ajouterEnregistrement() {
		//String query = "INSERT INTO `livre`(`id`, `title`, `author`, `year`, `pages`) VALUES (" + tfId.getText() + "," + tfTitre.getText() + "," + tfAutheur.getText() + "," + tfAnnee.getText() + "," + tfPages.getText() + ")"; 				
		String query = "INSERT INTO `livre` VALUES (" + tfId.getText() + ",'" + tfTitre.getText() + "','" + tfAutheur.getText() + "'," + tfAnnee.getText() + "," + tfPages.getText() + ")";		
		this.executeQuery(query);
	}
	
	private void supprimerEnregistrement() {
		
		if (tfTitre.getText()!=null) {
			//String query = "DELETE FROM `livre` WHERE title= '" + tfTitre.getText() + "'";
			String query ="DELETE FROM `livre` WHERE title="+"'"+tfTitre.getText()+"'";
			this.executeQuery(query);
			
			
		}
		
		
		if (tfId.getText()!=null) {
			String query = "DELETE FROM `livre` WHERE id=" + tfId.getText();
			this.executeQuery(query);
		}
		
		
	}
	
	private void modifierEnregistrement() {
		//string query = "UPDATE `livre` SET `id`="tfId,`title`=[value-2],`author`=[value-3],`year`=[value-4],`pages`=[value-5] WHERE 1
		//UPDATE `livre` SET `title`="newtitle" WHERE id=3
		
		
		
		
	}
	
	
	private void executeQuery (String query) {

			Connection conn = this.getConnection();
			Statement st;
			try {
				st = conn.createStatement();
				st.executeUpdate(query);
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Information");
				alert.setHeaderText("Actualisation de la bibliothèque");
				alert.setContentText("Modication effectuée");
		      
				alert.showAndWait();
				//System.out.println("Ajout du livre dans la bibliothèque effectué");
				
				afficherLivres();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		tfId.setText(null);
		tfTitre.setText(null);
		tfAutheur.setText(null);
		tfAnnee.setText(null);
		tfPages.setText(null);	
		tfId.requestFocus();

	}
	
	public ObservableList<Livre>  getLivres()
	{
		
		ObservableList<Livre> livreListe=FXCollections.observableArrayList();
		
		Connection conn = this.getConnection();
		
		String query="SELECT * FROM livre";
		
		Statement st;
		ResultSet rs;
		
		
try {   st=conn.createStatement();
         rs= st.executeQuery(query);
         Livre livre;
         
         
         while(rs.next())
         {
        	 
        	 livre= new Livre(rs.getInt("id"), rs.getString("title"), rs.getString("author"), rs.getInt("year"), rs.getInt("pages"));
              
        	 livreListe.add(livre);
        	        
         }
        
		} catch (SQLException e) {
			System.err.println("Error" + e);
		}

 return  livreListe;

	}
	
	public void afficherLivres() {
		try {
			List<Livre> list = this.getLivres();
			
			colId.setCellValueFactory(new PropertyValueFactory<Livre, Integer>("id"));
			colTitre.setCellValueFactory(new PropertyValueFactory<Livre, String>("title"));
			colAutheur.setCellValueFactory(new PropertyValueFactory<Livre, String>("author"));
			colAnnee.setCellValueFactory(new PropertyValueFactory<Livre, Integer>("year"));
			colPages.setCellValueFactory(new PropertyValueFactory<Livre, Integer>("pages"));
			
			tbLivres.getItems().clear();
			tbLivres.getItems().addAll(list);
		}
		catch (NullPointerException e) {
			System.err.println("Error" + e);
		}
	
	
	}

	
	
}
