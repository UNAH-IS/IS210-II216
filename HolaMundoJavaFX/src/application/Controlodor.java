package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controlodor {
	@FXML private TextField txtUsuario;
	@FXML private PasswordField txtPassword;


	@FXML
	public void accionBotonIngresar(){
		//System.out.println("Hola mundo");
		//JOptionPane.showMessageDialog(null, "Hola mundo");
		// JDK > 1.8u45
		Alert mensaje = new Alert(AlertType.ERROR);
		mensaje.setContentText("Hola mundo");
		mensaje.setTitle("Este es el titulo");
		mensaje.setHeaderText("Usuario: "+txtUsuario.getText()+"\n"+
				" Password: "+txtPassword.getText());
		mensaje.show();

	}
}
