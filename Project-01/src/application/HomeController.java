package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HomeController {
	@FXML private Button btnOrder;

	@FXML private void initialize(){

		btnOrder.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				onOrderClicked();
			}
		});


	}

	public void onOrderClicked(){
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Order.fxml"));
			Scene scene = new Scene(root,700,860);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();

	}
	}
}
