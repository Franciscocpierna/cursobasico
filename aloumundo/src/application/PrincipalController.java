package application;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class PrincipalController {
	@FXML
	private Label LblLabel;

	// Event Listener on Button.onAction
	@FXML
	public void btnButon(ActionEvent event) {
		// TODO Autogenerated
		LblLabel.setText("Ola Mundo");
			}
}