package usandofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
	@FXML
	private Label label;
	
	public void initialize() {
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		label.setText("Hello, JavaFx "+ javafxVersion +"\nRunning on Java "+ javaVersion + ".");
	}

}
