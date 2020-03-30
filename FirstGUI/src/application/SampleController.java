package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
	
	// txtDisplay for Text fields to display result 
		@FXML
		private TextField txtDisplay;
		
		private long num1 =0;
		private String operator ="";
		
		private Model model = new Model();
		
		// Event Listener for Digits (when 0-9 pressed)
		@FXML
		public void digitHandler(ActionEvent event) {
			txtDisplay.setText("");
			String val1 = ((Button)event.getSource()).getText();
			txtDisplay.setText(txtDisplay.getText()+val1);	
			
		}
	
		
		
		// Event Listener for operator action
		@FXML
		public void action(ActionEvent event) {
			String val1 = ((Button)event.getSource()).getText();	

			if (!"=".equals(val1)) {
				if(!operator.isEmpty())
					return;
				
				operator = val1;
				num1 = Long.parseLong(txtDisplay.getText());	
				txtDisplay.setText("");

			}
			else {
				//calculation happens here
				
				if(operator.isEmpty())
					return;
				txtDisplay.setText(String.valueOf(model.calculate(num1, Long.parseLong(txtDisplay.getText()),operator)));			
					
					
				
			}
		}
		
		
		
		// Event Listener on Button.onAction
			@FXML
			public void decimalHandler(ActionEvent event) {
				
			}

	
}
