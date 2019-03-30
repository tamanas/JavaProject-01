package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class OrderController {

	@FXML private Button btnReservation;
	@FXML private Button btnConfirm;
	@FXML private Button btnCancel;
	@FXML private TextField username;
	@FXML private ImageView imageView1;
	@FXML private Label usernameL;

	@FXML private Button lMeals;
	@FXML private Button rtMeals;
	@FXML private Button lBeverages;
	@FXML private Button rBeverages;
	@FXML private Button lDesserts;
	@FXML private Button rDesserts;

	//private UserName userName;

	//String[] _images = {"1.jpg", "2.jpg", "3.jpg"};
   Images images = new Images();

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


		lMeals.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				onLeftMealsClicked();
			}
		});



	}

	public void name(String first, String last){
		String display = first + " " + last;
		username.setText(display);
	}



	public void onLeftMealsClicked(){
		int index = 0;
		images.setimage(index);
		String imageURL = images.getimage();
    	Image image = new Image(imageURL);
    	imageView1.setImage(image);
    	index++;

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
