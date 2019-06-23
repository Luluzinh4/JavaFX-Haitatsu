package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UpdPedidos extends Application {
	
	private static Stage stageUpdPedidos;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("HaitatsuUpdPedidos.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Haitatsu System");
			primaryStage.setScene(scene);
			primaryStage.show();
			setStage(primaryStage);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Stage getStage() {
		return stageUpdPedidos;
	}

	public static void setStage(Stage stage) {
		UpdPedidos.stageUpdPedidos = stage;
	}

}