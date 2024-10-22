package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// O objeto 'raiz' será utilizado para armazenar o layout que será exibido na cena principal
        	Parent raiz = null;
        
        	// Aqui você pode alternar entre diferentes gerenciadores de layout para testar suas funcionalidades.
        	// Para isso, descomente a linha correspondente ao layout desejado.
		
		//raiz = new TesteAnchorPane();
		//raiz = new TesteBorderPane();
		//raiz = new TesteFlowPane();
		//raiz = new TesteGridPane();
		//raiz = new TesteStackPlane();
		raiz = new TesteTilePane();
		
		// Define a cena principal com o layout selecionado, e define o tamanho da janela (800x600)
        	Scene principal = new Scene(raiz, 800, 600);
        
	        // Configura a cena no palco principal e define o título da janela
        	primaryStage.setScene(principal);
        	primaryStage.setTitle("Gerenciadores de Layout");
        
        	// Exibe a janela da aplicação
        	primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
