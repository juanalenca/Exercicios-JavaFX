package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		} else if(contador < 0) {
			label.getStyleClass().add("vermelho");
		}
	}

	
	// Método start: ponto de entrada da aplicação JavaFX, onde a interface é construída
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Cria um rótulo (Label) para o título "Contador"
        Label labelTitulo = new Label("Contador");
        // Adiciona uma classe CSS ao rótulo do título
        labelTitulo.getStyleClass().add("titulo");
        

        // Cria um rótulo para exibir o valor atual do contador
        Label labelNumero = new Label("0");
        // Adiciona uma classe CSS ao rótulo do número
        labelNumero.getStyleClass().add("numero");

        
        // Cria um botão para decrementar o valor do contador
        Button botaoDecremento = new Button("-");
        
        botaoDecremento.getStyleClass().add("botoes");
        
        // Define o evento de clique do botão de decremento
        botaoDecremento.setOnAction(e -> {
            contador--; // Decrementa o contador
            atualizarLabelNumero(labelNumero); // Atualiza o rótulo com o novo valor
        });

        
        // Cria um botão para incrementar o valor do contador
        Button botaoIncremento = new Button("+");
        
        botaoIncremento.getStyleClass().add("botoes");
        
        // Define o evento de clique do botão de incremento
        botaoIncremento.setOnAction(e -> {
            contador++;
            atualizarLabelNumero(labelNumero);
        });

        
        // Cria um layout horizontal (HBox) para organizar os botões de incremento e decremento
        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER); // Centraliza os botões horizontalmente
        boxBotoes.setSpacing(10); // Define um espaçamento entre os botões
        boxBotoes.getChildren().add(botaoDecremento); // Adiciona o botão de decremento ao layout
        boxBotoes.getChildren().add(botaoIncremento); // Adiciona o botão de incremento ao layout

        
        // Cria um layout vertical (VBox) para organizar o título, o número e os botões
        VBox boxConteudo = new VBox();
        boxConteudo.getStyleClass().add("conteudo"); // Aplica uma classe CSS ao layout
        boxConteudo.setAlignment(Pos.CENTER); // Centraliza o conteúdo verticalmente
        boxConteudo.setSpacing(10); // Define um espaçamento entre os elementos
        boxConteudo.getChildren().add(labelTitulo); // Adiciona o título ao layout
        boxConteudo.getChildren().add(labelNumero); // Adiciona o rótulo do número ao layout
        boxConteudo.getChildren().add(boxBotoes); // Adiciona os botões ao layout

        
        // Carrega o arquivo CSS externo para estilizar a interface
        String caminhoDoCss = getClass()
                .getResource("/basico/Contador.css").toExternalForm();

        
        // Cria a cena principal da aplicação com o layout e define suas dimensões
        Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
        
        // Adiciona o CSS personalizado à cena
        cenaPrincipal.getStylesheets().add(caminhoDoCss);
        
        // Adiciona uma fonte externa através de uma URL
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald:wght@200..700&display=swap");

        // Define a cena no palco principal e exibe a janela
        primaryStage.setScene(cenaPrincipal);
        primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		
		launch(args); // Inicia a aplicação JavaFX
		
	}
	
}