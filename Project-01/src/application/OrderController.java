package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class OrderController {

	@FXML private Button btnReservation;
	@FXML private Button btnConfirm;
	@FXML private Button btnCancel;


	@FXML public void initializer(){

		btnReservation.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				onReservationClicked();
			}
		});


		btnConfirm.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				onConfirmClicked();
			}
		});


		btnCancel.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				onCancelClicked();
			}
		});
	}


	public void onReservationClicked(){
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("reservation.fxml"));
			Scene scene = new Scene(root,700,860);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();

		}
	}


	public void onConfirmClicked(){
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Receipt.fxml"));
			Scene scene = new Scene(root,700,860);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();

		}
	}


	public void onCancelClicked(){
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Home.fxml"));
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
