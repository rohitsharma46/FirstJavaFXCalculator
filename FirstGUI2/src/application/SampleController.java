package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {
	
	
	// txtDisplay for Text fields to display result 
			@FXML
			private TextField txtDisplay;
			
			private double num1 =0;
			private double num2;
			private String operator ="";
			
			private Model model = new Model();
			
			// Event Listener for Digits (when 0-9 pressed)
			@FXML
			public void digitHandler(ActionEvent event) {
				
								//display cleared before pressing digit
			txtDisplay.setText("");
				String val1 = ((Button)event.getSource()).getText();
//														System.out.println("Val1 in digit handler :"+val1);
				txtDisplay.setText(txtDisplay.getText()+val1);	
				
			}
		
		// Event Listener for operator action
		@FXML
		public void action(ActionEvent event) {
		String val1 = ((Button) event.getSource()).getText();
									//		System.out.println("val1 in action method : " + val1);
					// when operator is anything but =
		if (!"=".equals(val1)) {
			if (!operator.isEmpty())
				return;

					// here operator is either +,-,* or /      means math operator (retrieved from val1)
			operator = val1;
					// here num1 is storing the digit(s) pressed before pressing operator
					// so num1 = number pressed as we haven't changed txtDisplay yet
			num1 = Double.parseDouble(txtDisplay.getText());

			System.out.println("num1 is " + num1);
			System.out.println("operator is :" + operator);

			txtDisplay.setText("");
			txtDisplay.setText(operator);
		} else {
					//calculation happens here

			if (operator.isEmpty())
				return;
			
			num2 = Long.parseLong(txtDisplay.getText());
			System.out.println("num1 before sending to calculate: " + num1);
			System.out.println("num2 before sending to calculate: " + num2);
			System.out.println("operator before sending to calculate: " + operator);
			
			double finalnumber = model.calculate(num1, num2, operator);
			txtDisplay.setText(String.valueOf(model.calculate(num1, num2, operator)));
			 num1 = finalnumber;
			 operator="";


}
		}
		
		
		
		// Event Listener on Button.onAction
			@FXML
			public void cancelAll(ActionEvent event) {
				num1=0;
				num2=0;
				operator="";
				txtDisplay.setText("");
			}

	
}
