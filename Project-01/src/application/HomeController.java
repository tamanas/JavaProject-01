package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HomeController {
	@FXML private Button btnOrder;
	@FXML private Button btnReservation;
	@FXML private TextField fieldFirstName;
	@FXML private TextField fieldLastName;

	//private UserName userName;
	//@FXML OrderController orderController;

	 String firstName;
	 String lastName;

	ImageView img = new ImageView();


	@FXML private void initialize(){

		btnOrder.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				onOrderClicked();
			}
		});

		btnReservation.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				onReservationClicked();
			}
		});

	}
	public void name(){
		firstName = fieldFirstName.getText();
		lastName = fieldLastName.getText();
	}

	public void onOrderClicked(){
		name();

		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(getClass().getResource("Order.fxml"));
		try {
			Loader.load();

		} catch(Exception e) {
			e.printStackTrace();

		}
		OrderController display = Loader.getController();
		display.name(firstName, lastName);
		Parent root = Loader.getRoot();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.showAndWait();

	}


	public void onReservationClicked(){
		name();

		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(getClass().getResource("Reservation.fxml"));
		try {
			Loader.load();

		} catch(Exception e) {
			e.printStackTrace();

		}
		OrderController display = Loader.getController();
		display.name(firstName, lastName);
		Parent root = Loader.getRoot();
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.showAndWait();

	}


}
