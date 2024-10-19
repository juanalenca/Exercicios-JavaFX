package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	
	public void entrar() {
		
		boolean emailValido = campoEmail.getText().equals("juanbarrosdev@gmail.com");
		boolean senhaValida = campoEmail.getText().equals("123456");
		
		
		System.out.println(campoEmail.getText());
		System.out.println(campoSenha.getText());
		
		if(emailValido && senhaValida) {
			Notifications.create()
				.position(Pos.TOP_CENTER)
				.title("Login FXML")
				.text("Login efetuado com sucesso!")
				.showInformation();
		}else {
			Notifications.create()
				.position(Pos.TOP_CENTER)
				.title("Login FXML")
				.text("Usuário ou senha inválidos!")
				.showError();
		}
	}

}
