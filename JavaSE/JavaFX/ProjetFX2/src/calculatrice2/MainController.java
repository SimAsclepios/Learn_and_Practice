package calculatrice2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {



		@FXML
		private Label res;
		private int number1=0;
		private int number2=0;
		private String operator = "";
		private Boolean start=true;
		private String val = "";
		
		@FXML
		public void processNumber(ActionEvent event) {
			
			if (start) {
				res.setText(""); 
				start=false;
			}
			
			val = val+((Button)event.getSource()).getText();
			
			res.setText(res.getText()+((Button)event.getSource()).getText());
			
		}
		
	
		@FXML
		public void ProcessOperator(ActionEvent event) {
			
			if (start) {
				res.setText(""); 
				start=false;
			}

			String btOp = ((Button)event.getSource()).getText();
			
			if (btOp.equals("Clear")) {
				res.setText("");
				number1=0;
				number2=0;
				val="";
				operator="";
				return;
			}
			
			else if (!btOp.equals("=") ) {
				
				operator = ((Button)event.getSource()).getText();
				number1 = Integer.parseInt(val);
				val="";
				res.setText(res.getText()+((Button)event.getSource()).getText());
				return;
				
			}
			else if (btOp.equals("=")) { number2 = Integer.parseInt(val);		
			res.setText(res.getText() + " " + "=" + " " + Model.calculer(number1, number2, operator));
			}
			
			
			
		}
				
		
	}


