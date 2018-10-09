package hus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class house_simulator extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		
		House house = new House();
		Scene scene = new Scene(house,house.getHOUSE_WIDTH(),house.getFLOOR_HEIGHT()*house.getFLOORS());
		primaryStage.setScene(scene);
		primaryStage.show();
		
		scene.setOnKeyPressed(event->{
			
			house.repaint(Color.color(Math.random(),Math.random(),Math.random()));
			
		});
		

	}
	
	public static void main(String[] args) {
		launch();
	}

}
